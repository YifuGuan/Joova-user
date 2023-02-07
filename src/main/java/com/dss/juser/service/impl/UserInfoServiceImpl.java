package com.dss.juser.service.impl;

import com.dss.juser.mapper.LoginMapper;
import com.dss.juser.pojo.domain.UserInfoDO;
import com.dss.juser.pojo.dto.UserInfoDTO;
import com.dss.juser.pojo.param.LoginParam;
import com.dss.juser.pojo.request.LoginRequest;
import com.dss.juser.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserInfoDTO confirmUserIdentity(LoginRequest loginRequest) {
        // 请求参数转为查询参数对象
        LoginParam loginInfo = new LoginParam();
        BeanUtils.copyProperties(loginRequest, loginInfo);

        // 依照用户名密码校验身份信息
        UserInfoDO res = loginMapper.queryUserInfoByNameAndPassword(loginInfo);
        if (res != null) {
            // 包装返回结果
            UserInfoDTO userInfo = new UserInfoDTO();
            BeanUtils.copyProperties(res, userInfo);
            log.info("已成功验证用户：" + userInfo.getName() + "身份信息");
            return userInfo;
        } else {
            // 验证失败返回
            log.info("身份信息验证失败，用户名或密码错误");
            return null;
        }
    }
}
