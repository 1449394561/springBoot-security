//package com.security.controller;
//
//import com.security.common.util.JWTTokenUtil;
//import com.security.security.UserAuthenticationProvider;
//import com.security.security.service.SelfUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Login {
//
//    @Autowired
//    private SelfUserDetailsService selfUserDetailsService;
//
//    @Autowired
//    private UserAuthenticationProvider userAuthenticationProvider;
//
//
//    @GetMapping("/login")
//    public String login(String username,String password){
//
//        selfUserDetailsService.loadUserByUsername(username);
////        userAuthenticationProvider.authenticate();
//
//
//        return "2000";
//    }
//}
