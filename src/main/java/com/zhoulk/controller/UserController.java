package com.zhoulk.controller;

import com.zhoulk.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/login")
    public User login(@RequestParam(value = "name")String name){
//        User user = userService.findUserByName(name);
//        if(null != user)
//            return user.getId()+"/"+user.getName()+"/"+user.getPassword();
//        else return "null";
        User user = new User();
        user.setName(name);
        return user;
    }
}
