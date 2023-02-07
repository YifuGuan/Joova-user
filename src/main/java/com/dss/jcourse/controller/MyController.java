package com.dss.jcourse.controller;

import com.dss.jcourse.pojo.dto.UserInfoDTO;
import com.dss.jcourse.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刀氏春秋
 * @date 2023/1/30
 */
@RestController
public class MyController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping(value = "/hello")
    public String firstController() {
        return "hello springboot";
    }

    @GetMapping(value = "/test")
    public UserInfoDTO queryUserInfo(int userNo){
        return userInfoService.queryUserInfo(userNo);
    }
}
