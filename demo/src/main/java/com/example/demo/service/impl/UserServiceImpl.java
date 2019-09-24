package com.example.demo.service.impl;

import com.example.demo.bean.UmsMember;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 14:53
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> findAllUser() {

        //return userMapper.findAllUser();
        return userMapper.selectAll();
    }
}
