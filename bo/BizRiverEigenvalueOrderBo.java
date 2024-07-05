package com.shunwang.api.monitorWarning.model.bo;

import lombok.Data;

/**
 * @description: 水文站特征值排序Bo
 * @author: GSL
 * @createDate: 2022/12/3 11:50
 */
@Data
public class BizRiverEigenvalueOrderBo {
    /**
     * 历史开始年份
     */
    private Integer startYear;
    /**
     * 历史结束年份
     */
    private Integer endYear;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 数据以月份展示还是年展示 月份用 month 年用 year
     */
    private String timeType;
    /**
     * 选择的月份 或 年份    timeType为month 时 为M +月份   timeType为year时 为yy
     */
    private String type;
    /**
     * 当前年份
     */
    private Integer year;
}
