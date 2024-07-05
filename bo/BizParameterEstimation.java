package com.shunwang.api.monitorWarning.model.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: ZL
 * @createDate: 2023/4/20 14:41
 */
@Data
public class BizParameterEstimation {
    private List<Double> observedData;

    @ApiModelProperty("样本均值")
    private Double cv;

    @ApiModelProperty("偏态系数")
    private Double cs;

    @ApiModelProperty("变差系数")
    private Double ex;
}
