package com.dss.jcourse.mapper;

import com.dss.jcourse.pojo.domain.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
@Mapper
public interface UserInfoMapper {
    /**
     * 测试方法——依照用户编号查询用户信息
     * @param userNo 查询参数类，内含一个编号字段
     * @return 返回用户信息DO对象
     */
    UserInfoDO queryUserInfoByUserNo(Integer userNo);
}
