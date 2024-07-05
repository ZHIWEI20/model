package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @description: 水文站旬月值对比Vo
 * @author: GSL
 * @createDate: 2022/11/30 16:19
 */
@Data
public class BizRsvrMonthCompareVo {
    private List<BizRsvrMonthOrMeadowData> dataList;

    private List<BizRsvrMonthOrMeadowData> historyList;

    private List<BizRiverMonthOrMeadowDataVo> monthList;

    private List<BizRsvrAndRiverMeadowDataVo> meadowList;
}
