package com.noonoo.prjtbackend.common.interceptor;

import com.noonoo.prjtbackend.common.config.RequestContext;
import com.noonoo.prjtbackend.common.util.IpUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class RequestContextInterceptor implements HandlerInterceptor {

    public static final String LOGIN_MEMBER_SEQ = "LOGIN_MEMBER_SEQ";
    public static final String LOGIN_MEMBER_ID = "LOGIN_MEMBER_ID";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String clientIp = IpUtil.getClientIp(request);
        RequestContext.setClientIp(clientIp);

        HttpSession session = request.getSession(false);
        if (session != null) {
            Object loginMemberSeq = session.getAttribute(LOGIN_MEMBER_SEQ);
            Object loginMemberId = session.getAttribute(LOGIN_MEMBER_ID);

            if (loginMemberSeq instanceof Long seq) {
                RequestContext.setLoginMemberSeq(seq);
            } else if (loginMemberSeq instanceof Integer seq) {
                RequestContext.setLoginMemberSeq(seq.longValue());
            }

            if (loginMemberId instanceof String memberId) {
                RequestContext.setLoginMemberId(memberId);
            }
        }

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        RequestContext.clear();
    }
}
