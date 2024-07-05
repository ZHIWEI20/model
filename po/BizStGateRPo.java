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
 * @description: 闸门启闭情况表Po
 * @author: GSL
 * @createDate: 2022/12/7 9:55
 */
@ApiModel("闸门启闭情况表")
@TableName("ST_GATE_R")
@Data
public class BizStGateRPo implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("标志时间")
    @TableField("TM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date TM;

    @ApiModelProperty("扩展关键字")
    @TableField("EXKEY")
    private String exKey;

    @ApiModelProperty("设备类别")
    @TableField("EQPTP")
    private String eqptp;

    @ApiModelProperty("设备编号")
    @TableField("EQPNO")
    private String eqpno;

    @ApiModelProperty("开启孔数")
    @TableField("GTOPNUM")
    private Integer gtopnum;

    @ApiModelProperty("开启高度")
    @TableField("GTOPHGT")
    private Double gtophgt;

    @ApiModelProperty("过闸流量")
    @TableField("GTQ")
    private Double gtQ;

    @ApiModelProperty("测流方法")
    @TableField("MSQMT")
    private String msqmt;
}
