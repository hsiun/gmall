package com.example.demo.service;

import com.example.demo.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 16:52
 */
public interface UmsMemberAddressService {
    List<UmsMemberReceiveAddress> getAddressByMemeberId(String memberId);
}
