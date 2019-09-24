package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 16:43
 */


@Setter
@Getter
public class UmsMemberReceiveAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String memberId;
    private String name;

    private String phoneNumber;
    private String defaultStatus;

    private String postCode;
    private String province;

    private String city;
    private String region;

    private String detailAddress;
}
