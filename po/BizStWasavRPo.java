package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 堰闸（泵）站水情多日均值表Po
 * @author: GSL
 * @createDate: 2022/12/6 11:34
 */
@ApiModel("堰闸（泵）站水情多日均值表")
@TableName("ST_WASAV_R")
@Data
public class BizStWasavRPo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("标志时间")
    @TableField("IDTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date idTm;

    @ApiModelProperty("统计时段标志")
    @TableField("STTDRCD")
    private String sttdRcd;

    @ApiModelProperty("平均闸上水位")
    @TableField("AVUPZ")
    private Double avupZ;

    @ApiModelProperty("平均闸下水位")
    @TableField("AVDWZ")
    private Double avdwZ;
    
    @ApiModelProperty("平均过闸流量")
    @TableField("AVGTQ")
    private Double avgtQ;
}
