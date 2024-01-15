package com.springrestfulapi.springrestfulapi.users;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired private UserService userService;

    @GetMapping("/user")
    public List<UserModel> findAllUser() {
        return userService.findAll();
    }

    // @GetMapping("/user/{id}")
    // public List<UserModel> findOneUser(@RequestParam String userId) {
    //     Integer id = Integer.valueOf(userId);
    //     return userService.findOneById(id);
    // }
}
