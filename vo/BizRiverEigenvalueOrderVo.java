package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 水文站特征值排序Vo
 * @author: GSL
 * @createDate: 2022/12/3 12:14
 */
@Data
public class BizRiverEigenvalueOrderVo {
    /**
     * 平均水位
     */
    private Double avgZ;
    /**
     * 平均流量
     */
    private Double avgQ;
    /**
     * 最大水位
     */
    private Double maxZ;
    /**
     * 最大流量
     */
    private Double maxQ;
    /**
     * 最小水位
     */
    private Double minZ;
    /**
     * 最小流量
     */
    private Double minQ;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 年份
     */
    private Integer year;
}
