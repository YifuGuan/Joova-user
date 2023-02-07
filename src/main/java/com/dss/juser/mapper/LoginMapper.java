package com.dss.juser.mapper;

import com.dss.juser.pojo.domain.UserInfoDO;
import com.dss.juser.pojo.param.LoginParam;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
@Mapper
public interface LoginMapper {
    /**
     * 依照用户名密码确认登录信息
     * @param loginParam 登录参数：用户名，密码
     * @return 返回用户信息DO对象
     */
    UserInfoDO queryUserInfoByNameAndPassword(LoginParam loginParam);
}
