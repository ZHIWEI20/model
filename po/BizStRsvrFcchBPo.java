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
 * 本表存储水库（湖泊）的防洪指标、水文特征值等信息。
 */
@ApiModel("库(湖)站防洪指标表")
@TableName("st_rsvrfcch_b")
@Data
public class BizStRsvrFcchBPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("坝顶高程")
    @TableField("DAMEL")
    private Double damel;

    @ApiModelProperty("校核洪水位")
    @TableField("CKFLZ")
    private Double ckflZ;

    @ApiModelProperty("设计洪水位")
    @TableField("DSFLZ")
    private Double dsflZ;

    @ApiModelProperty("防洪高水位")
    @TableField("NORMZ")
    private Double normZ;

    @ApiModelProperty("死水位")
    @TableField("DDZ")
    private Double ddZ;

    @ApiModelProperty("正常高水位")
    @TableField("ACTZ")
    private Double actZ;

    @ApiModelProperty("总库容")
    @TableField("TTCP")
    private Double ttcp;

    @ApiModelProperty("防洪库容")
    @TableField("FLDCP")
    private Double fldcp;

    @ApiModelProperty("兴利库容")
    @TableField("ACTCP")
    private Double actCp;

    @ApiModelProperty("死库容")
    @TableField("DDCP")
    private Double ddcp;

    @ApiModelProperty("历史最高库水位")
    @TableField("HHRZ")
    private Double hhRz;

    @ApiModelProperty("历史最高库水位（蓄水量）出现时间")
    @TableField("HHRZTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hhRzTm;

    @ApiModelProperty("历史最大入流")
    @TableField("HMXINQ")
    private Double hmxInq;

    @ApiModelProperty("历史最大入流时段长")
    @TableField("RSTDR")
    private Double rstdr;

    @ApiModelProperty("历史最大入流出现时间")
    @TableField("HMXINQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hmxInqTm;

    @ApiModelProperty("历史最大蓄水量")
    @TableField("HMXW")
    private Double hmxW;

    @ApiModelProperty("历史最大蓄水量出现时间")
    @TableField("HMXWTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hmxWTm;

    @ApiModelProperty("RH最大出流")
    @TableField("RHMXOTQ")
    private Float rhmxOtq;

    @ApiModelProperty("RH最大出流出现时间")
    @TableField("RHMXOTQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date rhmxOtqTm;

    @ApiModelProperty("正常蓄水位")
    @TableField("NMZ")
    private String nmz;

    @ApiModelProperty("安全蓄水位")
    @TableField("SFZ")
    private String sfz;

    @ApiModelProperty("历史最低库水位")
    @TableField("HLRZ")
    private Double hlrZ;

    @ApiModelProperty("历史最低库水位出现时间")
    @TableField("HLRZTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hlrZTm;

    @ApiModelProperty("RH最小出流")
    @TableField("RHMNOTQ")
    private Float rhmnOtq;

    @ApiModelProperty("RH最小出流出现时间")
    @TableField("RHMNOTQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date rhmnOtqTm;

    @ApiModelProperty("水库类型")
    @TableField("RSVRTP")
    private String rsvrTp;

    @ApiModelProperty("历史最大出流")
    @TableField("HMXOTQ")
    private Double hmxOtq;

    @ApiModelProperty("历史最大出流出现时间")
    @TableField("HMXOTQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hmxOtqTm;

    @ApiModelProperty("历史最小日均入流")
    @TableField("HMNINQ")
    private Double hmnInq;

    @ApiModelProperty("历史最小日均入流出现时间")
    @TableField("HMNINQTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hmnInqTm;

    @ApiModelProperty("低水位告警值")
    @TableField("LAZ")
    private Double laZ;

    @ApiModelProperty("启动预报流量标准")
    @TableField("SFQ")
    private Double sfQ;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modiTime;
}
