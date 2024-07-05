package com.shunwang.api.monitorWarning.model.bo;

import lombok.Data;

import java.util.List;

/**
 * @description: 水文站相似年对比Bo
 * @author: GSL
 * @createDate: 2022/12/1 20:05
 */
@Data
public class BizRiverSimilarYearCompareBo {
    /**
     * 数据类型 AVGH? AVGQ?
     */
    private String dataType;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 时间类型
     */
    private String timeType;
    /**
     * 查询当前年
     */
    private String year;
    /**
     * 相似年份们
     */
    private List<String> similarYears;
}
