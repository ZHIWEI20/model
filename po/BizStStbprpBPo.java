package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 雨水情库，站点信息表
 * @author: GSL
 * @createDate: 2022/11/22 10:11
 */
@ApiModel("雨水情站点信息表")
@TableName("ST_STBPRP_B")
@Data
public class BizStStbprpBPo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("测站名称")
    @TableField("STNM")
    private String stnm;

    @ApiModelProperty("河流名称")
    @TableField("RVNM")
    private String rvnm;

    @ApiModelProperty("水系名称")
    @TableField("HNNM")
    private String hnnm;

    @ApiModelProperty("流域名称")
    @TableField("BSNM")
    private String bsnm;

    @ApiModelProperty("经度")
    @TableField("LGTD")
    private BigDecimal lgtd;

    @ApiModelProperty("纬度")
    @TableField("LTTD")
    private BigDecimal lttd;

    @ApiModelProperty("站址")
    @TableField("STLC")
    private String stlc;

    @ApiModelProperty("行政区划码")
    @TableField("ADDVCD")
    private String addvcd;

    @ApiModelProperty("基面名称")
    @TableField("DTMNM")
    private String dtmnm;

    @ApiModelProperty("基面高程")
    @TableField("DTMEL")
    private BigDecimal dtmel;

    @ApiModelProperty("基面修正值")
    @TableField("DTPR")
    private BigDecimal dtpr;

    @ApiModelProperty("站点类型")
    @TableField("STTP")
    private String sttp;

    @ApiModelProperty("报汛等级")
    @TableField("FRGRD")
    private String frgrd;

    @ApiModelProperty("建站年月")
    @TableField("ESSTYM")
    private String esstym;

    @ApiModelProperty("始报年月")
    @TableField("BGFRYM")
    private String bgfrym;

    @ApiModelProperty("隶属行业单位")
    @TableField("ATCUNIT")
    private String atcUnit;

    @ApiModelProperty("信息管理单位")
    @TableField("ADMAUTH")
    private String admauth;

    @ApiModelProperty("交换管理单位")
    @TableField("LOCALITY")
    private String locality;

    @ApiModelProperty("测站岸别")
    @TableField("STBK")
    private String stbk;

    @ApiModelProperty("测站方位")
    @TableField("STAZT")
    private Double stazt;

    @ApiModelProperty("至河口距离")
    @TableField("DSTRVM")
    private Double dstrvm;

    @ApiModelProperty("集水面积")
    @TableField("DRNA")
    private Double drna;

    @ApiModelProperty("拼音码")
    @TableField("PHCD")
    private String phcd;

    @ApiModelProperty("启用标志")
    @TableField("USFL")
    private String usfl;

    @ApiModelProperty("备注")
    @TableField("COMMENTS")
    private String comments;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date moditime;
}

