package com.dss.jcourse.service;

import com.dss.jcourse.pojo.dto.UserInfoDTO;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
public interface UserInfoService {
    /**
     * 测试业务——查询用户信息
     * @param userNo 用户编号
     * @return 查询到的用户实体
     */
    UserInfoDTO queryUserInfo(int userNo);
}
