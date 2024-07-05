package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @description: 水库站旬月值对比月查询Vo
 * @author: ZW
 * @createDate: 2022/11/29 17:04
 */
@Data
public class BizRsvrAndRiverMeadowDataVo {
    /**
     * 月旬名称
     */
    private String monthAndMeadow;

    /**
     * 年
     */
    private Integer syear;

    /**
     * 平均水位上中下旬
     */
    private Double avgZ;

    /**
     * 平均流量上中下旬
     */
    private Double avgQ;

    /**
     * 最大流量上中下旬
     */
    private Double maxQ;

    /**
     * 最小流量上中下旬
     */
    private Double minQ;

    /**
     * 最大水位上中下旬
     */
    private Double maxZ;

    /**
     * 最小水位上中下旬
     */
    private Double minZ;

    //出现时间
    /**
     * 最大水位出现时间
     */
    private Date maxZTime;

    /**
     * 最大流量出现时间
     */
    private Date maxQTime;

    /**
     * 最小水位出现时间
     */
    private Date minZTime;

    /**
     * 最小流量出现时间
     */
    private Date minQTime;

    /**
     * 平均水位出现时间
     */
    private Date avgZTime;

    /**
     * 平均流量出现时间
     */
    private Date avgQTime;

}
