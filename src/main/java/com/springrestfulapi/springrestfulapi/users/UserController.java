package com.springrestfulapi.springrestfulapi.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    List<UserModel> userlist = new ArrayList<>(Arrays.asList(
        new UserModel(1, "username1"),
        new UserModel(2, "username2"),
        new UserModel(3, "username3"),
        new UserModel(4, "username4")
    ));

    @GetMapping("/user")
    public List<UserModel> findAllUser() {
        return userlist;
    }
}
