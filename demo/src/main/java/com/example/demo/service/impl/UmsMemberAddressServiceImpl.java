package com.example.demo.service.impl;

import com.example.demo.bean.UmsMemberReceiveAddress;
import com.example.demo.mapper.UmsMemberAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 16:50
 */

@Service
public class UmsMemberAddressServiceImpl {

    @Autowired
    UmsMemberAddressMapper umsMemberAddressMapper;


    public List<UmsMemberReceiveAddress> getAddressByMemeberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        return umsMemberAddressMapper.select(umsMemberReceiveAddress);
    }


    public List<UmsMemberReceiveAddress> getAddressById(String condition) {

        Example address = new Example(UmsMemberReceiveAddress.class);
        address.createCriteria().andLike("memberId", condition);
        address.createCriteria().andLike("id", condition);
        return umsMemberAddressMapper.selectByExample(address);
    }
}
