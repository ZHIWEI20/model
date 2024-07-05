package com.shunwang.api.monitorWarning.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 流域关注站点相关的Bo
 * @author: ZW
 * @createDate: 2023/4/11 17:26
 */
@Data
@ApiModel("关注站点Bo")
public class AddWatershedFocusSiteBo {

    @ApiModelProperty("站点名称")
    private String stnm;

    @ApiModelProperty("修改类型(1:增;0:删)")
    private Integer type;

    @ApiModelProperty("用户Id")
    private Integer userId;

    @ApiModelProperty("方案Id")
    private Integer faId;
}
