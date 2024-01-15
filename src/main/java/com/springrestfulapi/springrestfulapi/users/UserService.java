package com.springrestfulapi.springrestfulapi.users;

import java.util.*;

import org.springframework.stereotype.Service;


@Service
public class UserService {
    List<UserModel> userlist = new ArrayList<>(Arrays.asList(
        new UserModel(1, "username1"),
        new UserModel(2, "username2"),
        new UserModel(3, "username3"),
        new UserModel(4, "username4")
    ));

    List<UserModel> findAll() {
        return userlist;
    };

    Map<String, UserModel> findOneById(Integer userId) {
        HashMap<String, UserModel> map = new HashMap<>();
        map.put("userId", userId);
        map.put("username", "username3");
        return map;
    };
}
