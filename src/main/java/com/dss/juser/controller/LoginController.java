package com.dss.juser.controller;

import com.dss.juser.constant.ResponseMessageStatusCode;
import com.dss.juser.pojo.dto.UserInfoDTO;
import com.dss.juser.pojo.request.LoginRequest;
import com.dss.juser.pojo.response.CommonResponse;
import com.dss.juser.service.UserInfoService;
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
public class LoginController {
    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "用户身份信息验证-测试", notes = "用户身份信息验证-测试")
    @ApiOperationSupport(order = 1)
    @PostMapping(value = "/test")
    public CommonResponse<UserInfoDTO> loginToJoova(LoginRequest loginRequest){
        // 执行业务
        UserInfoDTO userReturned = userInfoService.confirmUserIdentity(loginRequest);
        CommonResponse<UserInfoDTO> response = new CommonResponse<>();

        // 判断是否成功
        if(userReturned != null){
            // 登陆成功
            response.setSuccess(true);
            response.setMessage(ResponseMessageStatusCode.SUCCESS);
            response.setDtoResponse(userReturned);
        } else {
            // 登陆失败
            response.setSuccess(false);
            response.setMessage(ResponseMessageStatusCode.LOGIN_FAIL);
            response.setDtoResponse(null);
        }
        return response;
    }
}
