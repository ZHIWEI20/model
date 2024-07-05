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
 * @description: 河道信息表Po
 * @author: GSL
 * @createDate: 2022/11/24 9:39
 */
@ApiModel("河道水情表")
@TableName("ST_RIVER_R")
@Data
public class BizStRiverRPo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("时间")
    @TableField("TM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;

    @ApiModelProperty("水位")
    @TableField("Z")
    private Double z;

    @ApiModelProperty("流量")
    @TableField("Q")
    private Double q;

    @ApiModelProperty("断面过水面积")
    @TableField("XSA")
    private Double xsa;

    @ApiModelProperty("断面平均流速")
    @TableField("XSAVV")
    private Double xsavv;

    @ApiModelProperty("断面最大流速")
    @TableField("XSMXV")
    private Double xsmxv;

    @ApiModelProperty("河水特征码")
    @TableField("FLWCHRCD")
    private String flwChrcd;

    @ApiModelProperty("水势")
    @TableField("WPTN")
    private String wptn;

    @ApiModelProperty("测流方法")
    @TableField("MSQMT")
    private String msqmt;

    @ApiModelProperty("测积方法")
    @TableField("MSAMT")
    private String msamt;

    @ApiModelProperty("测速方法")
    @TableField("MSVMT")
    private String msvmt;
}
