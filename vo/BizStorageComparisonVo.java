package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * @description: 水库蓄量对比Vo
 * @author: GSL
 * @createDate: 2022/11/25 15:47
 */
@Data
public class BizStorageComparisonVo {
    /**
     * 用于左边的图表信息展示
     */
    private HashMap<String, List<BizStorageComparisonOne>> chartMap;
    /**
     * 用于右边的图表信息展示
     */
    private BizStorageComparisonTwo table;
}
