package com.shunwang.api.monitorWarning.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 用户关注站点相关的Bo
 * @author: GSL
 * @createDate: 2022/11/22 17:26
 */
@Data
@ApiModel("关注站点Bo")
public class AddUserFocusSiteBo {
    
    @ApiModelProperty("站点编码")
    private String stcd;

    @ApiModelProperty("站点名称")
    private String stnm;

    @ApiModelProperty("修改类型(1:增;0:删)")
    private Integer type;
    
    @ApiModelProperty("用户Id")
    private Integer userId;

    @ApiModelProperty("方案Id")
    private Integer faId;
}
