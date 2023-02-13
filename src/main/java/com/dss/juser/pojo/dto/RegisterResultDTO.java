package com.dss.juser.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刀氏春秋
 * @date 2023/2/13
 */
@Data
@ApiModel("注册结果信息实体")
public class RegisterResultDTO {
    @ApiModelProperty("注册成功标志")
    private Boolean success;

    @ApiModelProperty("注册结果")
    private String result;
}
