package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.monitorWarning.model.po.BizStRsvrFcchBPo;
import lombok.Data;

import java.util.List;

/**
 * @description: 站点面板 水情动态演示Vo
 * @author: GSL
 * @createDate: 2022/11/23 16:54
 */
@Data
public class BizRsvrWaterDynamicVo {
    /**
     * 水库的汛限信息
     */
    private List<BizRsvrWaterDynamicOne> rsvrFsltdzList;
    /**
     * 水库（湖泊）的防洪指标、水文特征值等信息。
     */
    private BizStRsvrFcchBPo bizStRsvrFcchBPo;
}
