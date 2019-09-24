package com.example.demo.mapper;

import com.example.demo.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-09-23 16:53
 */


/**
 * Repository写不写都行，写了idea不会报错
 */
@Repository
public interface UmsMemberAddressMapper extends Mapper<UmsMemberReceiveAddress>{
}
