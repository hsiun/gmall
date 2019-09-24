package com.example.demo.mapper;

import com.example.demo.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 14:53
 */


@Repository
public interface UserMapper extends Mapper<UmsMember>{
    List<UmsMember> findAllUser();
}
