package com.faon.blog.controller;

import com.alibaba.fastjson.JSON;
import com.faon.blog.dao.PermissionDao;
import com.faon.blog.dao.UserDao;
import com.faon.blog.entity.SystemPermission;
import com.faon.blog.entity.SystemUser;
import com.faon.blog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
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
    @PostMapping("/login")
    public String login(@PathVariable("userInfo") String userInfo){
        return Result.SuccessResult(userInfo);
    }
    @RequestMapping("/select/{id}")
    public String findUser(@PathVariable int id){
        SystemUser user = userDao.findUserById(id);
        System.out.println(user);
        String userJson = JSON.toJSONString(user);
        System.out.println(userJson);
        return userJson;
    }

    @RequestMapping("/selectPermission/{permissionId}")
    public String find(@PathVariable("permissionId") int permissionId){
        SystemPermission permission = permissionDao.findPermission(permissionId);
        System.out.println(permission);
        String userJson = JSON.toJSONString(permission);
        System.out.println(userJson);
        return userJson;
    }

}
