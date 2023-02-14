package com.dss.juser.controller;

import com.dss.juser.constant.ResponseMessageStatusCode;
import com.dss.juser.pojo.dto.RegisterResultDTO;
import com.dss.juser.pojo.dto.UserInfoDTO;
import com.dss.juser.pojo.request.LoginRequest;
import com.dss.juser.pojo.request.RegisterRequest;
import com.dss.juser.pojo.response.CommonResponse;
import com.dss.juser.service.UserInfoService;
import com.dss.juser.util.ResponseWrapper;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刀氏春秋
 * @date 2023/1/30
 */
@RequestMapping(value = "/login")
@RestController
@Api(value = "用户相关", tags = "用户相关")
public class UserRelatedController {
    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "用户身份信息验证", notes = "用户身份信息验证")
    @ApiOperationSupport(order = 1)
    @PostMapping(value = "/test")
    public CommonResponse<UserInfoDTO> loginToJoova(LoginRequest loginRequest) {
        // 执行业务
        UserInfoDTO userReturned = userInfoService.confirmUserIdentity(loginRequest);
        CommonResponse<UserInfoDTO> response = new CommonResponse<>();

        // 判断是否成功并包装response
        ResponseWrapper<UserInfoDTO> wrapper
                = new ResponseWrapper<>(ResponseMessageStatusCode.SUCCESS, ResponseMessageStatusCode.LOGIN_FAIL);
        return wrapper.responseJudgeByNotNullDto(response, userReturned);
    }

    @ApiOperation(value = "用户注册", notes = "用户注册")
    @ApiOperationSupport(order = 1)
    @PostMapping(value = "/register")
    public CommonResponse<RegisterResultDTO> registerToJoova(RegisterRequest registerRequest) {
        // 执行业务
        RegisterResultDTO registerResult = userInfoService.registerAsNewUser(registerRequest);
        CommonResponse<RegisterResultDTO> response = new CommonResponse<>();

        // 判断是否成功并包装response
        ResponseWrapper<RegisterResultDTO> wrapper
                = new ResponseWrapper<>(ResponseMessageStatusCode.SUCCESS, ResponseMessageStatusCode.REGISTER_FAIL);
        return wrapper.responseJudgeByCondition(response, registerResult, registerResult.getSuccess());
    }
}
