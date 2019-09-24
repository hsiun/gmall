package com.example.demo.controller;

import com.example.demo.bean.UmsMember;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 14:54
 */

@Controller
public class UserController {


    @Autowired
    UserService userService;


    @RequestMapping("user")
    @ResponseBody
    public List<UmsMember> findAllUser() {
        return userService.findAllUser();

    }


    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "Hello User";
    }
}
