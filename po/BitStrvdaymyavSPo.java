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
 * @description: 水位流量多年日平均统计表
 * @author: ZW
 * @createDate: 2022/12/9 20:58
 */
@ApiModel("水位流量多年日平均统计表")
@TableName("ST_RVDAYMYAV_S")
@Data
public class BitStrvdaymyavSPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("月份")
    @TableField("MNTH")
    private Integer mnth;

    @ApiModelProperty("日期")
    @TableField("DAY")
    private Integer day;

    @ApiModelProperty("多年日平均水位")
    @TableField("MYDAVZ")
    private Double mydavz;

    @ApiModelProperty("多年日平均流量")
    @TableField("MYDAVQ")
    private Double mydavq;

    @ApiModelProperty("开始年份")
    @TableField("BGYR")
    private Integer bgyr;

    @ApiModelProperty("结束年份")
    @TableField("EDYR")
    private Integer edyr;

    @ApiModelProperty("统计年数")
    @TableField("STTYRNUM")
    private Integer sttyrnum;

    @ApiModelProperty("备注")
    @TableField("COMMENTS")
    private String comments;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date moditime;

}
