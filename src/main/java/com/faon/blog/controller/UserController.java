package com.faon.blog.controller;

import com.alibaba.fastjson.JSON;
import com.faon.blog.dao.UserDao;
import com.faon.blog.entity.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/add/{username}/{password}")
    public String  addNewUser(@PathVariable String username,@PathVariable String password){
        SystemUser u = new SystemUser();
        u.setUsername(username);
        u.setPassword(password);
        int id = userDao.addUser(u);
        if (id>0){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }
    @RequestMapping("/select/{id}")
    public String findUser(@PathVariable int id){
        SystemUser user = userDao.findUserById(id);
        System.out.println(user);
        String userJson = JSON.toJSONString(user);
        System.out.println(userJson);
        return userJson;
    }
}
