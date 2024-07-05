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
 * @description: 大断面测验成果表Po
 * @author: GSL
 * @createDate: 2022/11/29 10:23
 */
@Data
@ApiModel("大断面测验成果表Po")
@TableName("ST_RVSECT_B")
public class BizStRvSectBPo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("施测时间")
    @TableField("MSTM")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date msTm;

    @ApiModelProperty("起测岸别")
    @TableField("BGBK")
    private String bgbk;

    @ApiModelProperty("垂线号")
    @TableField("VTNO")
    private Integer vino;

    @ApiModelProperty("起点距")
    @TableField("DI")
    private Double di;

    @ApiModelProperty("河底高程")
    @TableField("ZB")
    private Double zb;

    @ApiModelProperty("备注")
    @TableField("COMMENTS")
    private String comments;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modiTime;
}
