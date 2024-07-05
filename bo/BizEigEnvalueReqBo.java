package com.shunwang.api.monitorWarning.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 频率分析Bo-测站参数
 * @author: ZL
 * @createDate: 2023/4/19 10:08
 */
@Data
@ApiModel("频率分析Bo-测站参数")
public class BizEigEnvalueReqBo {

    @ApiModelProperty("历史年份-结束年份")
    private Integer ey;

    @ApiModelProperty("测站编码")
    private  String stcd;

    @ApiModelProperty("历史年份 - 开始年份")
    private Integer sy;

    @ApiModelProperty("当前年份 - 月数 表现形式M+月份")
    private String type;

    @ApiModelProperty("类型选择")
    private String typeShow;
}
