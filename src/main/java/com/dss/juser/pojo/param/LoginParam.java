package com.dss.juser.pojo.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刀氏春秋
 * @date 2023/2/7
 */
@Data
public class LoginParam {
    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "已输入密码")
    private String password;
}
