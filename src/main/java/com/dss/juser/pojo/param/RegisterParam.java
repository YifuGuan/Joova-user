package com.dss.juser.pojo.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刀氏春秋
 * @date 2023/2/13
 */
@Data
@ApiModel("新用户数据插入参数")
public class RegisterParam {
    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "头像")
    private String icon;
}
