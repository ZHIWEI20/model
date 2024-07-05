package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.monitorWarning.model.po.BizStRsvrFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStRsvrFsrBPo;
import com.shunwang.api.monitorWarning.model.po.BizStStbprpBPo;
import lombok.Data;

import java.util.List;

/**
 * @description: 水库站点面板工程特性Vo第一个成员
 * @author: GSL
 * @createDate: 2022/11/24 21:38
 */
@Data
public class BizRsvrEngineeringCharacteristicVo {
    /**
     * 工程特性站点主属性表
     */
    private BizStStbprpBPo stbprpB;
    /**
     * 工程特性 站点防洪指标表
     */
    private BizStRsvrFcchBPo stRsvrFcchBPo;
    /**
     * 汛限水位List
     */
    private List<BizStRsvrFsrBPo> bizStRsvrFsrBPoList;
}
