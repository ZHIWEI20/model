package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: BizStorageComparisonVo中第二个对象存放的对象
 * @author: GSL
 * @createDate: 2022/11/25 19:32
 */
@Data
public class BizStorageComparisonThree {
    /**
     * 标签
     */
    private String label;
    /**
     * 属性
     */
    private String prop;

    public BizStorageComparisonThree(String label, String prop) {
        this.label = label;
        this.prop = prop;
    }
}
