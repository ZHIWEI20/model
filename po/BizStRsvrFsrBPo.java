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
 * @description: 雨水情数据库ST_RSVRFSR_B表Po
 * @author: GSL
 * @createDate: 2022/11/24 21:43
 */
@ApiModel("库(湖)站汛限水位表")
@TableName("ST_RSVRFSR_B")
@Data
public class BizStRsvrFsrBPo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("开始月日")
    @TableField("BGMD")
    private String bgMD;

    @ApiModelProperty("结束月日")
    @TableField("EDMD")
    private String edMD;

    @ApiModelProperty("汛限水位")
    @TableField("FSLTDZ")
    private Double fsltdz;

    @ApiModelProperty("汛限库容")
    @TableField("FSLTDW")
    private Double fsltdw;

    @ApiModelProperty("汛期类别")
    @TableField("FSTP")
    private String fstp;

    @ApiModelProperty("时间戳")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modiTime;
}
