package com.dss.juser.pojo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 刀氏春秋
 * @date 2023/2/7
 */
@Data
@ApiModel(description = "身份验证回应参数")
public class CommonResponse<D> {
    @ApiModelProperty("请求是否成功")
    private boolean success;

    @ApiModelProperty("补充信息")
    private String message;

    @ApiModelProperty("返回数据信息")
    private D dtoResponse;
}
