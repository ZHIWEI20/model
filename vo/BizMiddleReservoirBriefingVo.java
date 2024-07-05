package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 中型水库水情简报
 * @author: ZL
 * @createDate: 2022/12/9 21:36
 */
@Data
public class BizMiddleReservoirBriefingVo {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 市(县)名
     */
    private String stlc;
    /**
     * 库名
     */
    private String stnm;
    /**
     * 坝顶高程 (ST_RSVRFCCH_B)
     */
    private Double damel;
    /**
     * 总库容
     */
    private Double ttcp;
    /**
     * 防洪高水位
     */
    private Double normz;
    /**
     * 今日水位
     */
    private Double nowz;
    /**
     * 比昨日 +涨 -落
     */
    private String compareZ;
    /**
     * 蓄水量
     */
    private Double w;
    /**
     * 流量
     */
    private Double q;
    /**
     * 顺序
     */
    private Integer sort;
    /**
     * 正常高水位
     */
    private Double actz;

    /**
     * 汛限水位
     */
    private Double fsltdz;
}
