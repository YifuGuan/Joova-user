package com.dss.juser.service;

import com.dss.juser.pojo.dto.RegisterResultDTO;
import com.dss.juser.pojo.dto.UserInfoDTO;
import com.dss.juser.pojo.request.LoginRequest;
import com.dss.juser.pojo.request.RegisterRequest;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
public interface UserInfoService {
    /**
     * 用户身份信息验证
     *
     * @param loginRequest 登录请求参数：用户名、密码
     * @return 查询到的用户实体
     */
    UserInfoDTO confirmUserIdentity(LoginRequest loginRequest);

    /**
     * 注册新用户
     *
     * @param registerRequest 注册请求参数：用户名、密码、头像
     * @return 注册结果实体
     */
    RegisterResultDTO registerAsNewUser(RegisterRequest registerRequest);
}
