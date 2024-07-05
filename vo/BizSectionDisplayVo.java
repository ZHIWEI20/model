package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.monitorWarning.model.po.BizStRiverRPo;
import com.shunwang.api.monitorWarning.model.po.BizStRvFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStRvSectBPo;
import lombok.Data;

import java.util.List;

/**
 * @description: 断面展示Vo
 * @author: GSL
 * @createDate: 2022/11/29 10:19
 */
@Data
public class BizSectionDisplayVo {
    /**
     * 河道水情表Pos
     */
    private List<BizStRiverRPo> list;
    /**
     * 大断面测验成果表Pos
     */
    private List<BizStRvSectBPo> sections;
    /**
     * 河道站防洪指标表Po
     */
    private BizStRvFcchBPo stRvfcchVo;
}
