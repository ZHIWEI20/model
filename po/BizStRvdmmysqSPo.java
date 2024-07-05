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
 * @description: 水位流量旬月均值系列表
 * @author: ZW
 * @createDate: 2022/12/5 15:29
 */
@ApiModel("水位流量旬月均值系列表")
@TableName("ST_RVDMMYSQ_S")
@Data
public class BizStRvdmmysqSPo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("年份")
    @TableField("YR")
    private Integer yr;

    @ApiModelProperty("月份")
    @TableField("MNTH")
    private Integer mnth;

    @ApiModelProperty("旬月标示")
    @TableField("PRDTP")
    private Integer prdtp;

    @ApiModelProperty("旬月平均水位")
    @TableField("AVZ")
    private Double avZ;

    @ApiModelProperty("旬月平均流量")
    @TableField("AVQ")
    private Double avQ;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date moditime;

}
