package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description: 水文站 旬月值对比 装返回数据的类
 * @author: zw
 * @createDate: 2022/11/30 15:52
 */
@Data
public class BizRiverMonthOrMeadowDataVo {
    /**
     * 1月
     */
    private List<Double> m1;
    /**
     * 2月
     */
    private List<Double> m2;
    /**
     * 3月
     */
    private List<Double> m3;
    /**
     * 4月
     */
    private List<Double> m4;
     /**
     * 5月
     */
    private List<Double> m5;
    /**
     * 6月
     */
    private List<Double> m6;
    /**
     * 7月
     */
    private List<Double> m7;
    /**
     * 8月
     */
    private List<Double> m8;
    /**
     * 9月
     */
    private List<Double> m9;
    /**
     * 10月
     */
    private List<Double> m10;
    /**
     * 11月
     */
    private List<Double> m11;
    /**
     * 12月
     */
    private List<Double> m12;
    /**
     * 统计年数
     */
    private List<Long> staticYear;
    /**
     * 多年平均
     */
    private List<Double> staticYearAvg;
    /**
     * 最大值
     */
    private List<Double> staticYearMax;
    /**
     * 最小值
     */
    private List<Double> staticYearMin;
    /**
     * 出现时间
     */
    private List<Integer> staticYearMaxTm;
    /**
     * 出现年份
     */
    private List<Integer> staticYearMinTm;
    /**
     * 站点
     */
    private String stcdt;
    /**
     * 年份
     */
    private List<Integer> syear;
    /**
     * 全年
     */
    private List<Double> ym;
    /**
     * 出现时间
     */
    private List<Date> ymt;
}
