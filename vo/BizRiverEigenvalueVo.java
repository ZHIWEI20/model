package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 水文站报汛特征值Vo
 * @author: GSL
 * @createDate: 2022/12/2 12:17
 */
@Data
public class BizRiverEigenvalueVo {
    /**
     * 当前时间
     */
    private String ymdhm;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 上旬流量
     */
    private Double qa1;
    /**
     * 中旬流量
     */
    private Double qa2;
    /**
     * 下旬流量
     */
    private Double qa3;
    /**
     * 月流量
     */
    private Double qa4;
    /**
     * 上旬水位
     */
    private Double za1;
    /**
     * 中旬水位
     */
    private Double za2;
    /**
     * 下旬水位
     */
    private Double za3;
    /**
     * 月水位
     */
    private Double za4;

    /**
     * 历史月水位
     */
    private Double mmh;
    /**
     * 月水位距平
     */
    private Double mmhJp;
    /**
     * 历史月流量
     */
    private Double mmq;
    /**
     * 月流量距平
     */
    private Double mmqJp;
    /**
     * 上旬历史水位
     */
    private Double sxh;
    /**
     * 上旬水位距平
     */
    private Double sxhJp;
    /**
     * 上旬历史流量
     */
    private Double sxq;
    /**
     * 上旬流量距平
     */
    private Double sxqJp;
    /**
     * 中旬历史水位
     */
    private Double zxh;
    /**
     * 中旬水位距平
     */
    private Double zxhJp;
    /**
     * 中旬历史流量
     */
    private Double zxq;
    /**
     * 中旬流量距平
     */
    private Double zxqJp;
    /**
     * 下旬历史水位
     */
    private Double xxh;
    /**
     * 下旬水位距平
     */
    private Double xxhJp;
    /**
     * 下旬历史流量
     */
    private Double xxq;
    /**
     * 下旬流量距平
     */
    private Double xxqJp;
}
