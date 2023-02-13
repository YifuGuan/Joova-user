package com.dss.juser.pojo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
@Data
@ApiModel("登陆后获取到的用户信息")
public class UserInfoDO {
    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("用户头像")
    private String icon;
}
