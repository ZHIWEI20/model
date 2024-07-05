package com.shunwang.api.monitorWarning.model.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.shunwang.api.monitorWarning.model.po.BizForecastPublishPo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 洪水-预警发布
 * @author: ZL
 * @createDate: 2023/7/19 14:50
 */
@Data
@ApiModel("洪水-预警发布")
public class BizForecastPublishBo {

    @ApiModelProperty("测站编码")
    private String stcd;

    @ApiModelProperty("测站名字")
    private String stnm;

    @ApiModelProperty("预警等级")
    private String forecastLevel;

    @ApiModelProperty("实时还是预报 REAL or FORE")
    private String type;

    @ApiModelProperty("预报类型")
    private String forecastType;

    @ApiModelProperty("预报内容")
    private String forecastContent;

    @ApiModelProperty("终止时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @ApiModelProperty("经度")
    private BigDecimal lgtd;

    @ApiModelProperty("纬度")
    private BigDecimal lttd;

    @ApiModelProperty("操作")
    private int operate;
}
