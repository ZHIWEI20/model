package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: BizStorageComparisonVo中map中存的List中的对象
 * @author: GSL
 * @createDate: 2022/11/25 15:51
 */
@Data
public class BizStorageComparisonOne {
    /**
     * 供水
     */
    private String gs;
    /**
     * 时间
     */
    private String tm;
    /**
     * 蓄水
     */
    private String xs;

    public BizStorageComparisonOne() {
    }

    public BizStorageComparisonOne(String gs, String tm, String xs) {
        this.gs = gs;
        this.tm = tm;
        this.xs = xs;
    }
}
