package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 首页雨情信息统计Vo
 * @author: GSL
 * @createDate: 2022/11/28 11:15
 */
@Data
public class BizRainQueryDayFilterNumCountVo {
    /**
     * 无降雨站点
     */
    private Integer D1;
    /**
     * 0~10mm降雨站点
     */
    private Integer D2;
    /**
     * 10~25mm降雨站点
     */
    private Integer D3;
    /**
     * 25~50mm降雨站点
     */
    private Integer D4;
    /**
     * 50~100mm降雨站点
     */
    private Integer D5;
    /**
     * 100~250mm降雨站点
     */
    private Integer D6;
    /**
     * >=250mm降雨站点
     */
    private Integer D7;
    /**
     * 降雨站点数量
     */
    private Integer allCount;
}
