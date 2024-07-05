package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description:
 * @author: GSL
 * @createDate: 2022/12/5 18:08
 */
@Data
public class BizWaterCalculationLeftTop {
    /**
     * 查询时间的平均流量
     */
    private String currentAvg;
    /**
     * 查询时间的总流量
     */
    private String currentSum;
    /**
     * 查询时间
     */
    private String currentTm;
    /**
     * 过去三十年的平均流量
     */
    private String avg30;
    /**
     * 过去三十年的总流量
     */
    private String sum30;
    /**
     * 过去三十年
     */
    private String tm30;
}
