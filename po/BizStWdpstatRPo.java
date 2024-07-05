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
 * @description: ST_WDPSTAT_R Po
 * @author: GSL
 * @createDate: 2022/12/6 17:05
 */
@ApiModel("引排水量统计表")
@TableName("ST_WDPSTAT_R")
@Data
public class BizStWdpstatRPo implements Serializable {
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

    @ApiModelProperty("引水次数")
    @TableField("PPTMS")
    private Integer pptms;

    @ApiModelProperty("累计引水量")
    @TableField("ACCPW")
    private Double accpw;

    @ApiModelProperty("引水时数")
    @TableField("PPHRS")
    private Double pphrs;

    @ApiModelProperty("排水次数")
    @TableField("DRNTMS")
    private Integer drntms;

    @ApiModelProperty("累计排水量")
    @TableField("ACCDW")
    private Double accdw;

    @ApiModelProperty("排水时数")
    @TableField("DRNHRS")
    private Double drnhrs;
}
