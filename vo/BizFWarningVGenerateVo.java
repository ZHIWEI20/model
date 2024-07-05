package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shunwang.api.resultManagement.model.po.BizStForeCastFPo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @description: 预警生成Vo
 * @author: ZL
 * @createDate: 2023/7/18 16:43
 */
@Data
@ApiModel("预警生成Vo")
public class  BizFWarningVGenerateVo {

    @ApiModelProperty("测站编码")
    private String stcd;

    @ApiModelProperty("数据")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private QueryVo queryVo;

    @ApiModelProperty("流域")
    private String drainageBasin;

    @ApiModelProperty("河名")
    private String rvnm;

    @ApiModelProperty("站名")
    private String stnm;

    @ApiModelProperty("洪水蓝色预警线")
    private Double floodLineByB;

    @ApiModelProperty("洪水黄色预警线")
    private Double floodLineByY;

    @ApiModelProperty("洪水橙色预警线")
    private Double floodLineByO;

    @ApiModelProperty("洪水红色预警线")
    private Double floodLineByR;

    @ApiModelProperty("预报等级")
    private String forecastLevel;
}
