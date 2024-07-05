package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.monitorWarning.model.po.BizStRsvrFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStRvFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStWasRPo;
import lombok.Data;

import java.util.List;

/**
 * @description: 堰闸站水情Vo
 * @author: GSL
 * @createDate: 2022/12/6 21:16
 */
@Data
public class BizLoadHistoryWasVo {
    /**
     * 水情数据
     */
    List<BizStWasRPo> dataList;
    /**
     * 防洪信息
     */
    BizStRvFcchBPo bizStRvFcchBPo;

    /**
     * 求临时发布出来的结果
     */
    List<WaterLevelFlowVo> foreDataList;
}
