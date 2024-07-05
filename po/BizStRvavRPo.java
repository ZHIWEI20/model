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
 * @description: 河道水情多日均值表
 * @author: GSL
 * @createDate: 2022/12/5 15:29
 */
@ApiModel("河道水情多日均值表")
@TableName("ST_RVAV_R")
@Data
public class BizStRvavRPo implements Serializable {
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

    @ApiModelProperty("平均水位")
    @TableField("AVZ")
    private Double avZ;

    @ApiModelProperty("平均入流量")
    @TableField("AVQ")
    private Double avQ;
}
