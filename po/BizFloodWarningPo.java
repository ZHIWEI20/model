package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.shunwang.common.utils.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 安徽省洪水预警发布标准表Po
 * @author: ZL
 * @createDate: 2023/7/14 10:47
 */
@Data
@ApiModel("安徽省洪水预警发布标准表Po")
@TableName("BIZ_FLOOD_WARNING")
public class BizFloodWarningPo {

    @ApiModelProperty("序号")
    @TableId("ID")
    private String id;

    @ApiModelProperty("测站编码")
    @TableField("STCD")
    private String stcd;

    @ApiModelProperty("流域")
    @TableField("DRAINAGE_BASIN")
    private String drainageBasin;

    @ApiModelProperty("河名")
    @TableField("RVNM")
    private String rvnm;

    @ApiModelProperty("站名")
    @TableField("STNM")
    private String stnm;

    @ApiModelProperty("洪水蓝色报警")
    @TableField("ALARM_B")
    private Double alarmB;

    @ApiModelProperty("洪水黄色报警")
    @TableField("ALARM_Y")
    private Double alarmY;

    @ApiModelProperty("洪水橙色报警")
    @TableField("ALARM_O")
    private Double alarmO;

    @ApiModelProperty("洪水红色报警")
    @TableField("ALARM_R")
    private Double alarmR;

    public void setRvnm(String rvnm) {
        this.rvnm = StringUtils.trim(rvnm);
    }

    public void setStnm(String stnm) {
        this.stnm = StringUtils.trim(stnm);
    }
}