package com.dss.juser.service;

import com.dss.juser.pojo.dto.UserInfoDTO;
import com.dss.juser.pojo.request.LoginRequest;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
public interface UserInfoService {
    /**
     * 测试业务——查询用户信息
     * @param loginRequest 登录请求参数：用户名、密码
     * @return 查询到的用户实体
     */
    UserInfoDTO confirmUserIdentity(LoginRequest loginRequest);
}
