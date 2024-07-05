package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @description: 水文站旬月值对比Vo
 * @author: GSL
 * @createDate: 2022/11/30 15:33
 */
@Data
public class BizRiverMonthCompareVo {
    private List<BizRiverMonthOrMeadowData> dataList;

    /**
     * 历史List
     */
    private List<BizRiverMonthOrMeadowData> historyList;

    /**
     * 月List
     */
    private List<BizRiverMonthOrMeadowDataVo> monthResult;

    /**
     * 旬List
     */
    private List<BizRiverMeadowDataVo> meadowList;

    /**
     * (河道 + 水库)旬List
     */
    private List<BizRsvrAndRiverMeadowDataVo> rsvrAndRivermeadowList;
}
