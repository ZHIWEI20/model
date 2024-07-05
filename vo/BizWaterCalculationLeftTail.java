package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 左边表格内容信息
 * @author: GSL
 * @createDate: 2022/12/5 18:10
 */
@Data
public class BizWaterCalculationLeftTail {
    /**
     * 查询时间开始时间
     */
    private String currentSt;
    /**
     * 查询时间结束时间
     */
    private String currentEt;
    /**
     * 查询时间流量
     */
    private String currentQ;
    /**
     * 30年 部分开始时间
     */
    private String thirtySt;
    /**
     * 30年 部分结束时间
     */
    private String thirtyEt;
    /**
     * 30年 部分流量
     */
    private String thirtyQ;
    /**
     * 最大X天
     */
    private String tm;
}
