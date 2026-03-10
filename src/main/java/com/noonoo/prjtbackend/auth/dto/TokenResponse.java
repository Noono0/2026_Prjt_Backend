package com.noonoo.prjtbackend.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TokenResponse {
    private Long memberSeq;
    private String memberId;
    private String accessToken;
    private String refreshToken;
}
