package com.dss.juser.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刀氏春秋
 * @date 2023/2/3
 */
@Data
@ApiModel("返回用户实体")
public class UserInfoDTO {
    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("用户头像")
    private String icon;
}
