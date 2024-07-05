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
 * @description: 潮汐水情表Po
 * @author: GSL
 * @createDate: 2022/12/6 19:36
 */
@ApiModel("潮汐水情表")
@TableName("ST_TIDE_R")
@Data
public class BizStTideRPo implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("时间")
    @TableField("TM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;

    @ApiModelProperty("潮位")
    @TableField("TDZ")
    private Double tdZ;

    @ApiModelProperty("气压")
    @TableField("AIRP")
    private Integer airp;

    @ApiModelProperty("潮水特征码")
    @TableField("TDCHRCD")
    private String tdChrcd;

    @ApiModelProperty("潮势")
    @TableField("TDPTN")
    private String tdptn;

    @ApiModelProperty("高低潮标志")
    @TableField("HLTDMK")
    private String hltdmk;
}
