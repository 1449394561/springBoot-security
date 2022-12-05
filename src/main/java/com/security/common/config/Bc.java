package com.security.common.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Bc {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        String password="111111";
        String encode1 = bCryptPasswordEncoder.encode(password);
        System.out.println("encode1:" + encode1);
    }
}
