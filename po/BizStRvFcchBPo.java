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
 * @description: ST_RVFCCH_B表实体类
 * @author: GSL
 * @createDate: 2022/11/29 9:40
 */
@ApiModel("河道站防洪指标表")
@Data
@TableName("ST_RVFCCH_B")
public class BizStRvFcchBPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("左堤高程")
    @TableField("LDKEL")
    private Double ldkel;

    @ApiModelProperty("右堤高程")
    @TableField("RDKEL")
    private Double rdkel;

    @ApiModelProperty("警戒水位")
    @TableField("WRZ")
    private Double wrZ;

    @ApiModelProperty("警戒流量")
    @TableField("WRQ")
    private Double wrQ;

    @ApiModelProperty("保证水位")
    @TableField("GRZ")
    private Double grZ;

    @ApiModelProperty("保证流量")
    @TableField("GRQ")
    private Double grQ;

    @ApiModelProperty("平滩流量")
    @TableField("FLPQ")
    private Double flpQ;

    @ApiModelProperty("实测最高水位")
    @TableField("OBHTZ")
    private Double obhtZ;

    @ApiModelProperty("实测最高水位出现时间")
    @TableField("OBHTZTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date obhtZTm;

    @ApiModelProperty("调查最高水位")
    @TableField("IVHZ")
    private Double ivhZ;

    @ApiModelProperty("调查最高水位出现时间")//
    @TableField("IVHZTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ivhZTm;

    @ApiModelProperty("实测最大流量")
    @TableField("OBMXQ")
    private Double obmxQ;

    @ApiModelProperty("实测最大流量出现时间")
    @TableField("OBMXQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date obmxQTm;

    @ApiModelProperty("调查最大流量")
    @TableField("IVMXQ")
    private Double ivmxQ;

    @ApiModelProperty("调查最大流量出现时间")
    @TableField("IVMXQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ivmxQTm;

    @ApiModelProperty("历史最大含沙量")
    @TableField("HMXS")
    private Double hmxs;

    @ApiModelProperty("历史最大含沙量出现时间")
    @TableField("HMXSTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hmxsTm;

    @ApiModelProperty("历史最大断面平均流速")
    @TableField("HMXAVV")
    private Double hmxavv;

    @ApiModelProperty("历史最大断面平均流速出现时间")
    @TableField("HMXAVVTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hmxavvTm;

    @ApiModelProperty("历史最低水位")
    @TableField("HLZ")
    private Double hlZ;

    @ApiModelProperty("历史最低水位出现时间")
    @TableField("HLZTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hlZTm;

    @ApiModelProperty("历史最小流量")
    @TableField("HMNQ")
    private Double hmnQ;

    @ApiModelProperty("历史最小流量出现时间")
    @TableField("HMNQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hmnQTm;

    @ApiModelProperty("高水位告警值")
    @TableField("TAZ")
    private Double taZ;

    @ApiModelProperty("大流量告警值")
    @TableField("TAQ")
    private Double taQ;

    @ApiModelProperty("低水位告警值d")
    @TableField("LAZ")
    private Double laZ;

    @ApiModelProperty("小流量告警值")
    @TableField("LAQ")
    private Double laQ;

    @ApiModelProperty("启动预报水位标准")
    @TableField("SFZ")
    private Double sfZ;

    @ApiModelProperty("启动预报流量标准")
    @TableField("SFQ")
    private Double sfQ;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modiTime;
}
