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
 * @description: 站点显示等级表Po
 * @author: GSL
 * @createDate: 2022/12/8 18:36
 */
@ApiModel("站点等级表")
@TableName("BIZ_STATION_LEVEL")
@Data
public class BizStationLevelPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("测站名称")
    @TableField(value = "STNM")
    private String stnm;

    @ApiModelProperty("测站等级")
    @TableField("LEVEL")
    private String levels;

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

    @ApiModelProperty("信息管理单位")
    @TableField("ADMAUTH")
    private String admauth;

    @ApiModelProperty("交换管理单位")
    @TableField("LOCALITY")
    private String locality;

    @ApiModelProperty("别名")
    @TableField("NICK_NAME")
    private String nickName;

    @ApiModelProperty("测站类别")
    @TableField("STTP")
    private String sttp;

    @ApiModelProperty("创建时间")
    @TableField("CREATE_TIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty("更新时间")
    @TableField("UPDATE_TIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
