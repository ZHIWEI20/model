package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * @description: 水文站相似年对比Vo
 * @author: GSL
 * @createDate: 2022/12/1 20:13
 */
@Data
public class BizRiverSimilarYearCompareVo {
    /**
     * 结果列表
     */
    private List<HashMap<String,Object>> resultList;
    /**
     * 表格头
     */
    private List<BizStorageComparisonThree> tableHead;
}
