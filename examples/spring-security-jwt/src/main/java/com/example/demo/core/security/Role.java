package com.example.demo.core.security;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Role {
    ADMIN("ROLE_ADMIN", "�����ڱ���"),
    USER("ROLE_USER", "����ڱ���"),
    UNKNOWN("UNKNOWN", "�˼����� ����");

    private String code;
    private String description;

    Role(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Role of(String code) {
        return Arrays.stream(Role.values())
                .filter(r -> r.getCode().equals(code))
                .findAny()
                .orElse(UNKNOWN);
    }
}