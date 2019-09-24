package com.example.demo.controller;

import com.example.demo.bean.UmsMemberReceiveAddress;
import com.example.demo.service.impl.UmsMemberAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 16:48
 */


@Controller
public class UmsMemeberAddressController {

    @Autowired
    UmsMemberAddressServiceImpl umsMemberAddressService;


    @RequestMapping("address")
    @ResponseBody
    List<UmsMemberReceiveAddress> getAddressByMemeberId(String memberId) {
        System.out.println("memberId = " + memberId);
        return umsMemberAddressService.getAddressByMemeberId(memberId);
    }


    @RequestMapping("id")
    @ResponseBody
    List<UmsMemberReceiveAddress> getAddressById(String id) {
        return umsMemberAddressService.getAddressByMemeberId(id);
    }
}
