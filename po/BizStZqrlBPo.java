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
 * @description: 河道水位流量关系曲线表Po
 * @author: GSL
 * @createDate: 2022/11/30 20:47
 */
@ApiModel("水位流量关系曲线表")
@TableName("ST_ZQRL_B")
@Data
public class BizStZqrlBPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("曲线名称")
    @TableField("LNNM")
    private String lnnm;

    @ApiModelProperty("启用时间")
    @TableField("BGTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bgTm;

    @ApiModelProperty("点序号")
    @TableField("PTNO")
    private Integer ptNo;

    @ApiModelProperty("水位")
    @TableField("Z")
    private Double z;

    @ApiModelProperty("流量")
    @TableField("Q")
    private Double q;

    @ApiModelProperty("备注")
    @TableField("COMMENTS")
    private String comments;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modiTime;
}
