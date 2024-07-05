package com.shunwang.api.monitorWarning.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 首页-频率分析Bo
 * @author: ZL
 * @createDate: 2023/4/19 10:06
 */
@Data
@ApiModel("首页-频率分析Bo")
public class BizCalFrequencyCurveBo {

    @ApiModelProperty("偏态系数")
    private String Cs;

    @ApiModelProperty("样本均值")
    private String Cv;

    @ApiModelProperty("变差系数")
    private String Ex;

    private BizEigEnvalueReqBo eigEvalueReq;
}
