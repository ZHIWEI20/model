package com.shunwang.api.monitorWarning.model.vo;

import com.alibaba.fastjson2.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description: 水位流量过程-预报数据-时间点的数据
 * @author: ZL
 * @createDate: 2023/4/25 20:40
 */
@Data
@ApiModel("水位流量过程-预报数据-时间点的数据")
public class WaterLevelFlowDataVo {

    /**
     * 数据List
     */
    private List<Double> dataList;
    /**
     * 时间List
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private List<Date> timeList;
    /**
     * 名字
     */
    private String name;
}
