package com.dss.juser.pojo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 刀氏春秋
 * @date 2023/2/7
 */
@Data
@ApiModel("用户身份验证请求参数")
public class LoginRequest {
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名", required = true, example = "knight")
    @NotNull(message = "用户名不能为空！")
    private String name;

    /**
     * 已输入密码
     */
    @ApiModelProperty(value = "已输入密码", required = true, example = "256814")
    @NotNull(message = "密码不能为空！")
    private String password;
}
