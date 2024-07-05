package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.monitorWarning.model.po.BizStRsvrFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStRsvrFsrBPo;
import com.shunwang.api.monitorWarning.model.po.BizStRvFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStStbprpBPo;
import lombok.Data;

import java.util.List;

/**
 * @description: 知识图谱对象Vo
 * @author: GSL
 * @createDate: 2023/8/29 17:10
 */
@Data
public class BizKonwledgeDomainVo {
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站类型
     */
    private String sttp;
    /**
     * 显示层级等级
     */
    private String level;
    /**
     * 大小水库层级
     */
    private String reservoirType;
    /**
     * 简化名
     */
    private String simpleName;
    /**
     * 测站信息对象
     */
    private BizStStbprpBPo stStbprpBPo;
    /**
     * 水文水位站 防洪指标对象
     */
    private BizStRvFcchBPo stRvFcchBPo;
    /**
     * 水库站 站点防洪指标表
     */
    private BizStRsvrFcchBPo stRsvrFcchBPo;
    /**
     * 水库站 汛限水位List
     */
    private List<BizStRsvrFsrBPo> stRsvrFsrBPoList;
}
