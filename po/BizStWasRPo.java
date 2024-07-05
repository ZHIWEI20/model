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
 * @description: 堰闸水情表Po
 * @author: GSL
 * @createDate: 2022/12/6 21:08
 */
@ApiModel("堰闸水情表")
@TableName("ST_WAS_R")
@Data
public class BizStWasRPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("时间")
    @TableField("TM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;

    @ApiModelProperty("闸上水位")
    @TableField("UPZ")
    private Double upZ;

    @ApiModelProperty("闸下水位")
    @TableField("DWZ")
    private Double dwZ;

    @ApiModelProperty("总过闸流量")
    @TableField("TGTQ")
    private Double tgtQ;

    @ApiModelProperty("闸水特征码")
    @TableField("SWCHRCD")
    private String swChrcd;

    @ApiModelProperty("闸上水势")
    @TableField("SUPWPTN")
    private String supWptn;

    @ApiModelProperty("闸下水势")
    @TableField("SDWWPTN")
    private String sdwWptn;

    @ApiModelProperty("测流方法")
    @TableField("MSQMT")
    private String msqmt;
}
