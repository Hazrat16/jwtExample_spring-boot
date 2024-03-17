package com.jwt.jwtExample.controllers;

import com.jwt.jwtExample.modals.User;
import com.jwt.jwtExample.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    public UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }


    @GetMapping("/current-user")
    public String getCurrentUser(Principal principal){
        return principal.getName();
    }
}
