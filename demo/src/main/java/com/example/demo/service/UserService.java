package com.example.demo.service;

import com.example.demo.bean.UmsMember;

import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 14:52
 */

public interface UserService {
    List<UmsMember> findAllUser();
}
