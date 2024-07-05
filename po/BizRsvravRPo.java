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
 * @description: 水库日均表Po
 * @author: GSL
 * @createDate: 2022/11/22 21:20
 */
@ApiModel("水库水情多日均值表")
@TableName("ST_RSVRAV_R")
@Data
public class BizRsvravRPo implements Serializable {
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

    @ApiModelProperty("平均库水位")
    @TableField("AVRZ")
    private Double avRz;

    @ApiModelProperty("平均入流量")
    @TableField("AVINQ")
    private Double avInq;

    @ApiModelProperty("平均出流量")
    @TableField("AVOTQ")
    private Double avOtq;

    @ApiModelProperty("平均蓄水量")
    @TableField("AVW")
    private Double avW;
}
