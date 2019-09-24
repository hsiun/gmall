package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 15:16
 */

@Getter
@Setter
public class UmsMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private int status;
    private Date createTime;
    private String icon;
    private String gender;
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private String sourceType;
    private String integration;
    private String growth;
    private String luckeyCount;
    private String historyIntegration;
}
