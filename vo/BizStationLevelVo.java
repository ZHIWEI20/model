package com.shunwang.api.monitorWarning.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 2024-01-09 17:56:35
 *
 * @author zhaolin
 */
@Data
public class BizStationLevelVo {

    @ApiModelProperty("测站编码")
    private String stcd;

    @ApiModelProperty("测站名称")
    private String stnm;

    @ApiModelProperty("河流名称")
    private String rvnm;

    @ApiModelProperty("水系名称")
    private String hnnm;

    @ApiModelProperty("流域名称")
    private String bsnm;

    @ApiModelProperty("经度")
    private BigDecimal lgtd;

    @ApiModelProperty("纬度")
    private BigDecimal lttd;

    @ApiModelProperty("站址")
    private String stlc;


    @ApiModelProperty("信息管理单位")
    private String admauth;

    @ApiModelProperty("交换管理单位")
    @TableField("LOCALITY")
    private String locality;

    @ApiModelProperty("测站等级")
    private String levels;

    @ApiModelProperty("测站类别")
    private String sttp;
}
