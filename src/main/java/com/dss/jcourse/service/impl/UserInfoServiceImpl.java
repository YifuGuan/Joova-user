package com.dss.jcourse.service.impl;

import com.dss.jcourse.mapper.UserInfoMapper;
import com.dss.jcourse.pojo.domain.UserInfoDO;
import com.dss.jcourse.pojo.dto.UserInfoDTO;
import com.dss.jcourse.service.UserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfoDTO queryUserInfo(int userNo) {
        UserInfoDO res = userInfoMapper.queryUserInfoByUserNo(userNo);
        UserInfoDTO userInfo = new UserInfoDTO();
        BeanUtils.copyProperties(res,userInfo);
        return userInfo;
    }
}
