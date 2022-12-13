package com.yf.controller;

import com.yf.entity.SysUser;
import com.yf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: springcloud-base
 * @package: com.yf.controller
 * @className: UserController
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/13 15:13
 * @version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUserById")
    public SysUser getUserById(Integer id){
        return userService.getUserById(id);
    }
}
