package com.faon.blog.controller;

import com.alibaba.fastjson.JSON;
import com.faon.blog.dao.PermissionDao;
import com.faon.blog.dao.UserDao;
import com.faon.blog.entity.SystemPermission;
import com.faon.blog.entity.SystemUser;
import com.faon.blog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private PermissionDao permissionDao;


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
    @PostMapping(value = "/login")
    public String login(@RequestParam String username,@RequestParam String password){
        SystemUser u = new SystemUser();
        u.setUsername(username);
        u.setPassword(password);
        return Result.SuccessResult(u);
    }


}
