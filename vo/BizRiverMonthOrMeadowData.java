package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 水文站 旬月值对比 装返回数据的类
 * @author: GSL
 * @createDate: 2022/11/30 15:52
 */
@Data
public class BizRiverMonthOrMeadowData {
    /**
     * 月
     */
    private String mon;
    /**
     * 旬
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
     * 平均流量
     */
    private Double avgQ;
    /**
     * 最大流量
     */
    private Double maxQ;
    /**
     * 最低流量
     */
    private Double minQ;
}
