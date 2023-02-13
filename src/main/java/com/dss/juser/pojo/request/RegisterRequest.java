package com.dss.juser.pojo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 刀氏春秋
 * @date 2023/2/13
 */
@Data
@ApiModel("用户注册信息请求参数")
public class RegisterRequest {
    @ApiModelProperty(value = "用户名", required = true, example = "glasgow")
    @NotNull(message = "用户名不能为空！")
    private String name;

    @ApiModelProperty(value = "密码", required = true, example = "qaz123!")
    @NotNull(message = "密码不能为空！")
    private String password;

    @ApiModelProperty(value = "头像", required = true, example = "default")
    @NotNull(message = "头像不能为空！")
    private String icon;
}
