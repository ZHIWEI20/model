package com.shunwang.api.monitorWarning.model.bo;

import com.shunwang.api.resultManagement.model.po.ForeEvaluateAllConfigSitPo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 评价规则弹窗保存数据
 * @author: ZL
 * @createDate: 2023/1/6 21:03
 */
@Data
@ApiModel("评价规则弹窗保存数据")
public class ForeEvaluateSingleTableConfigBo {

    @ApiModelProperty("测站信息")
    private List<ForeEvaluateAllConfigSitPo> confDtoList;

    @ApiModelProperty("报表id")
    private String tableId;

    //此处为不确定的东西

}
