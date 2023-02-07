package com.dss.juser.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
@Data
public class UserInfoDTO {
    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("用户头像")
    private String icon;
}
