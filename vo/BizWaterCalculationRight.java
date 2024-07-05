package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: GSL
 * @createDate: 2022/12/5 18:06
 */
@Data
public class BizWaterCalculationRight {
    /**
     * 查询时间的流量
     */
    private Double currQ;
    /**
     * 查询的时间（一天）
     */
    private String tm;
}
