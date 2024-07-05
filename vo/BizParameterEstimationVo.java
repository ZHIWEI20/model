package com.shunwang.api.monitorWarning.model.vo;

import com.alibaba.fastjson2.annotation.JSONField;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 参数估计数据Vo
 * @author: ZL
 * @createDate: 2023/4/20 9:47
 */
@Data
public class BizParameterEstimationVo {
    @JSONField(name = "Cs")
    @ApiModelProperty("偏态系数")
    private BigDecimal Cs;

    @ApiModelProperty("样本均值")
    @JSONField(name = "Ex")
    private BigDecimal Ex;

    @ApiModelProperty("变差系数")
    @JSONField(name = "Cv")
    private BigDecimal Cv;

    @JSONField(name = "quantile_data")
    private List<Double> quantile_data;

    @JSONField(name = "sort_data")
    @ApiModelProperty("对输入特征值数据的排序")
    private List<Double> sort_data;

    @JSONField(name = "S_values")
    @ApiModelProperty("x坐标显示的值")
    private List<Double> S_values;

    @JSONField(name = "xp2")
    @ApiModelProperty("可能是流量的值,但是有负的？？")
    private List<Double> xp2;

    @JSONField(name = "x_loc")
    @ApiModelProperty("可能是x坐标真正的值,但是是从一个 - ~ +的坐标")
    private List<Double> x_loc;
}
