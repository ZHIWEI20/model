package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 分区面雨量Bo
 * @author: ZL
 * @createDate: 2023/2/10 19:48
 */
@Data
@ApiModel("分区面雨量bo")
public class AreaRainFallBo {


    @ApiModelProperty("结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date et;

    @ApiModelProperty("开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date st;

    @ApiModelProperty("时间类型")
    private String type;

    @ApiModelProperty("分区Id")
    private String qyId;
}
