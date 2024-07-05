package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 水位流量过程-预报数据Vo
 * @author: ZL
 * @createDate: 2023/4/25 19:54
 */
@Data
@ApiModel("水位流量过程-预报数据Vo")
public class WaterLevelFlowVo {

    @ApiModelProperty("时间")
    private String name;

    @ApiModelProperty("数据")
    private List<WaterLevelFlowDataVo> dataList;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("时间")
    private Date tm;
}
