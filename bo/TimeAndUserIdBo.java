package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: GSL
 * @createDate: 2022/11/22 15:43
 */
@Data
@ApiModel("时间和id传参")
public class TimeAndUserIdBo {
    
    @ApiModelProperty("查询时间")
    private String tm;
    
    @ApiModelProperty("用户Id")
    private Integer userId;

    @ApiModelProperty("方案id")
    private Integer faId;

    @ApiModelProperty("站点id")
    private String stcd;

    @ApiModelProperty("流域")
    private String stnm;
}
