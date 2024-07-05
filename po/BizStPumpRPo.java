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
 * @description: 泵站水情表Po
 * @author: GSL
 * @createDate: 2022/12/6 15:30
 */
@ApiModel("泵站水情表")
@TableName("ST_PUMP_R")
@Data
public class BizStPumpRPo implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("时间")
    @TableField("TM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;

    @ApiModelProperty("站上水位")
    @TableField("PPUPZ")
    private Double ppupZ;

    @ApiModelProperty("站下水位")
    @TableField("PPDWZ")
    private Double ppdwZ;

    @ApiModelProperty("开机台数")
    @TableField("OMCN")
    private Double omcn;

    @ApiModelProperty("开机功率")
    @TableField("OMPWR")
    private Double ompwr;

    @ApiModelProperty("抽水流量")
    @TableField("PMPQ")
    private Double pmpQ;

    @ApiModelProperty("站水特征码")
    @TableField("PPWCHRCD")
    private String ppwChrcd;

    @ApiModelProperty("站上水势")
    @TableField("PPUPWPTN")
    private String ppUpWptn;

    @ApiModelProperty("站下水势")
    @TableField("PPDWWPTN")
    private String ppDwWptn;

    @ApiModelProperty("测流方法")
    @TableField("MSQMT")
    private String msqmt;

    @ApiModelProperty("引排特征码")
    @TableField("PDCHCD")
    private String pdchcd;
}
