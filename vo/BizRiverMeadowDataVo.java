package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @description: 水库站旬月值对比月查询Vo
 * @author: ZW
 * @createDate: 2022/11/29 17:04
 */
@Data
public class BizRiverMeadowDataVo {
    /**
     * 1月上中下旬
     */
    private Double m1Upper;
    private Double m1Center;
    private Double m1Lower;
    /**
     * 2月上中下旬
     */
    private Double m2Upper;
    private Double m2Center;
    private Double m2Lower;
    /**
     * 3月上中下旬
     */
    private Double m3Upper;
    private Double m3Center;
    private Double m3Lower;
    /**
     * 4月上中下旬
     */
    private Double m4Upper;
    private Double m4Center;
    private Double m4Lower;
    /**
     * 5月上中下旬
     */
    private Double m5Upper;
    private Double m5Center;
    private Double m5Lower;
    /**
     * 6月上中下旬
     */
    private Double m6Upper;
    private Double m6Center;
    private Double m6Lower;
    /**
     * 7月上中下旬
     */
    private Double m7Upper;
    private Double m7Center;
    private Double m7Lower;
    /**
     * 8月上中下旬
     */
    private Double m8Upper;
    private Double m8Center;
    private Double m8Lower;
    /**
     * 9月上中下旬
     */
    private Double m9Upper;
    private Double m9Center;
    private Double m9Lower;
    /**
     * 10月上中下旬
     */
    private Double m10Upper;
    private Double m10Center;
    private Double m10Lower;
    /**
     * 11月上中下旬
     */
    private Double m11Upper;
    private Double m11Center;
    private Double m11Lower;
    /**
     * 12月上中下旬
     */
    private Double m12Upper;
    private Double m12Center;
    private Double m12Lower;
    /**
     * 年份
     */
    private Integer syear;
    /**
     * 全年上中下旬
     */
    private Double ymUpper;
    private Double ymCenter;
    private Double ymLower;
    /**
     * 出现时间上中下旬
     */
    private Date ymtUpper;
    private Date ymtCenter;
    private Date ymtLower;
}
