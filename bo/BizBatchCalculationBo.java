package com.shunwang.api.monitorWarning.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 频率分析-频率互算Bo
 * @author: ZL
 * @createDate: 2023/4/20 16:08
 */
@Data
@ApiModel("频率分析-频率互算Bo")
public class BizBatchCalculationBo {
    @ApiModelProperty("偏态系数")
    private String cs;

    @ApiModelProperty("样本均值")
    private String cv;

    @ApiModelProperty("变差系数")
    private String ex;

    @ApiModelProperty("-> 1, <- 2")
    private Integer calcType;

    @ApiModelProperty("要转换的值 可有多个")
    private String value;
}
