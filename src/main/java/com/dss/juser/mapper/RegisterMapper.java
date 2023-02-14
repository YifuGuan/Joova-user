package com.dss.juser.mapper;

import com.dss.juser.pojo.param.RegisterParam;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 刀氏春秋
 * @date 2023/2/13
 */
@Mapper
public interface RegisterMapper {
    /**
     * 根据用户名查找用户
     *
     * @param name 用户名
     * @return 具有该用户名的用户数
     */
    Integer countUserByName(String name);

    /**
     * 插入新用户
     *
     * @param registerParam 新用户数据插入参数
     */
    void insertNewUser(RegisterParam registerParam);
}
