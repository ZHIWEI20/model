package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * @description: 水文站历史同期对比Vo
 * @author: GSL
 * @createDate: 2022/11/29 17:03
 */
@Data
public class BizRiverHistoryCompareVo {
    /**
     * 年份list
     */
    private List<String> legend;
    /**
     *流量水位数据List
     */
    private List<HashMap<String,Object>> tableList;
    /**
     * 时间list
     */
    private List<String> TmList;
}
