package com.noonoo.prjtbackend.auth.controller;

import com.noonoo.prjtbackend.auth.dto.LoginRequest;
import com.noonoo.prjtbackend.auth.dto.TokenResponse;
import com.noonoo.prjtbackend.auth.service.AuthService;
import com.noonoo.prjtbackend.common.api.ApiResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    public static final String LOGIN_MEMBER_SEQ = "LOGIN_MEMBER_SEQ";
    public static final String LOGIN_MEMBER_ID = "LOGIN_MEMBER_ID";

    private final AuthService authService;

    @PostMapping("/login")
    public ApiResponse<TokenResponse> login(@RequestBody LoginRequest request, HttpSession session) {
        TokenResponse response = authService.login(request);

        session.setAttribute(LOGIN_MEMBER_SEQ, response.getMemberSeq());
        session.setAttribute(LOGIN_MEMBER_ID, response.getMemberId());

        return ApiResponse.ok(response);
    }

    @PostMapping("/logout")
    public ApiResponse<String> logout(HttpSession session) {
        session.invalidate();
        return ApiResponse.ok("로그아웃 완료");
    }
}