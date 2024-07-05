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
 * @description: 水库库容曲线Po
 * @author: GSL
 * @createDate: 2022/11/24 17:23
 */
@ApiModel("水库库容曲线表")
@TableName("ST_ZVARL_B")
@Data
public class BizStZvarlBPo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("施测时间")
    @TableField("MSTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date msTm;

    @ApiModelProperty("点序号")
    @TableField("PTNO")
    private Integer ptNo;

    @ApiModelProperty("库水位")
    @TableField("RZ")
    private Double rz;

    @ApiModelProperty("蓄水量")
    @TableField("W")
    private Double w;

    @ApiModelProperty("水面面积")
    @TableField("WSFA")
    private Integer wsFa;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modiTime;
}
