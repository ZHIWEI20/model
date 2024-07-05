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
 * @description: 雨水情数据库ST_RSVR_R表Po
 * @author: GSL
 * @createDate: 2022/11/22 16:52
 */
@ApiModel("水库水情表")
@TableName("ST_RSVR_R")
@Data
public class BizStRsvrRPo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("时间")
    @TableField("TM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;

    @ApiModelProperty("库上水位")
    @TableField("RZ")
    private Double rz;

    @ApiModelProperty("入库流量")
    @TableField("INQ")
    private Double inq;

    @ApiModelProperty("蓄水量")
    @TableField("W")
    private Double w;

    @ApiModelProperty("库下水位")
    @TableField("BLRZ")
    private Double blrz;

    @ApiModelProperty("出库流量")
    @TableField("OTQ")
    private Double otq;

    @ApiModelProperty("库水特征码")
    @TableField("RWCHRCD")
    private String rwChrcd;

    @ApiModelProperty("库水水势")
    @TableField("RWPTN")
    private String rWptn;

    @ApiModelProperty("入流时段长")
    @TableField("INQDR")
    private Double inqDr;

    @ApiModelProperty("测流方法")
    @TableField("MSQMT")
    private String msqmt;
}
