package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 洪水-预警发布Po
 * @author: ZL
 * @createDate: 2023/7/19 15:00
 */
@Data
@TableName("BIZ_FORECAST_PUBLISH")
@ApiModel("预警发布Po")
public class BizForecastPublishPo {

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("测站名字")
    @TableField("STNM")
    private String stnm;

    @ApiModelProperty("预警等级")
    @TableField("FORECAST_LEVEL")
    private String forecastLevel;

    @ApiModelProperty("实时还是预报 REAL or FORE")
    @TableField("TYPE")
    private String type;

    @ApiModelProperty("预报类型")
    @TableField("FORECAST_TYPE")
    private String forecastType;

    @ApiModelProperty("预报内容")
    @TableField("FORECAST_CONTENT")
    private String forecastContent;

    @ApiModelProperty("终止时间")
    @TableField("END_TIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @ApiModelProperty("经度")
    @TableField("LGTD")
    private BigDecimal lgtd;

    @ApiModelProperty("纬度")
    @TableField("LTTD")
    private BigDecimal lttd;

}
