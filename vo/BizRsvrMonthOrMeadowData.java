package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 水库站 旬月值对比 装返回数据的类
 * @author: GSL
 * @createDate: 2022/11/30 15:52
 */
@Data
public class BizRsvrMonthOrMeadowData {
    /**
     * 我？
     */
    private String mon;
    /**
     * 荀？
     */
    private String xun;
    /**
     * 平均水位
     */
    private Double avgZ;
    /**
     * 最高水位
     */
    private Double maxZ;
    /**
     * 最低水位
     */
    private Double minZ;
    /**
     * 平均入流
     */
    private Double avgInq;
    /**
     * 最大入流
     */
    private Double maxInq;
    /**
     * 最低入流
     */
    private Double minInq;
    /**
     * 平均出流
     */
    private Double avgOtq;
    /**
     * 最大出流
     */
    private Double maxOtq;
    /**
     * 最低出流
     */
    private Double minOtq;
}
