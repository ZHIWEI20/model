package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * @description: 水库站历史同期对比Vo
 * @author: GSL
 * @createDate: 2022/11/29 17:04
 */
@Data
public class BizRsvrHistoryCompareVo {
    /**
     * 年份list
     */
    private List<String> legend;
    /**
     *流量水位数据List
     */
    private List<HashMap<String,Object>> tableList;
    /**
     *过去三十年的 inq otq z 数据
     */
    private List<HashMap<String,Object>> tableList30;
    /**
     * 时间list
     */
    private List<String> TmList;
}
