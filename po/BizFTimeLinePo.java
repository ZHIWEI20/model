package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 分析时间轴Po
 * @author: ZL
 * @createDate: 2023/7/19 16:15
 */
@Data
@ApiModel("预警分析时间轴Po")
@TableName("BIZ_FA_TL")
public class BizFTimeLinePo {

    @ApiModelProperty("测站编码")
    @TableId("ID")
    private Integer id;

    @ApiModelProperty("测站编码")
    @TableField("STCD")
    private String stcd;

    @ApiModelProperty("站名")
    @TableField("STNM")
    private String stnm;

    @ApiModelProperty("操作")
    @TableField("OPERATE")
    private String operate;

    @ApiModelProperty("时间")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modiTime;

    @ApiModelProperty("预警类型")
    @TableField("FORECAST_ALARM_TYPE")
    private String forecastAlarmType;

    @ApiModelProperty("用户名")
    @TableField("USER_NAME")
    private String userName;
}
