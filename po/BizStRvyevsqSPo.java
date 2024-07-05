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
 * @description: 水位流量年极值系列表
 * @author: ZW
 * @createDate: 2022/12/5 15:29
 */
@ApiModel("水位流量年极值系列表")
@TableName("ST_RVYEVSQ_S")
@Data
public class BizStRvyevsqSPo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("年份")
    @TableField("YR")
    private Integer yr;

    @ApiModelProperty("最高水位")
    @TableField("HTZ")
    private Double htZ;

    @ApiModelProperty("最高水位出现时间")
    @TableField("HTZTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date htzTm;

    @ApiModelProperty("最大流量")
    @TableField("MXQ")
    private Double mxQ;

    @ApiModelProperty("最大流量出现时间")
    @TableField("MXQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date mxqtm;

    @ApiModelProperty("最低水位")
    @TableField("LTZ")
    private Double ltZ;

    @ApiModelProperty("最低水位出现时间")
    @TableField("LTZTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date ltzTm;

    @ApiModelProperty("最小流量")
    @TableField("MNQ")
    private Double mnQ;

    @ApiModelProperty("最小流量出现时间")
    @TableField("MNQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date mnqTm;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date moditime;

}
