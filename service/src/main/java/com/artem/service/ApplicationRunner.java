package com.artem.service;

import com.artem.service.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {
        var userService = new UserService();
        System.out.println(userService.getUser(1L));
    }
}
