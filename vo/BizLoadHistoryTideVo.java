package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.monitorWarning.model.po.BizStRvFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStTideRPo;
import lombok.Data;

import java.util.List;

/**
 * @description: 潮位站水情Vo
 * @author: GSL
 * @createDate: 2022/12/6 20:38
 */
@Data
public class BizLoadHistoryTideVo {
    /**
     * 水情数据
     */
    List<BizStTideRPo> dataList;
    /**
     *防洪信息
     */
    BizStRvFcchBPo bizStRvFcchBPo;
}
