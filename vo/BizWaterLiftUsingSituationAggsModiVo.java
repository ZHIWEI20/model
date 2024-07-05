package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.resultManagement.model.vo.BizWaterLiftUsingStatisticalModiDataVo;
import com.shunwang.api.resultManagement.model.vo.BizWaterLiftUsingStatisticalModiSonDataVo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 库容运用概括修改Vo
 * @author: ZL
 * @createDate: 2023/3/2 10:35
 */
@Data
//BizWaterLiftUsingStatisticalModiSonDataVo
public class BizWaterLiftUsingSituationAggsModiVo {
    //BizWaterLiftUsingStatisticalModiDataVo - 新
    //BizWaterLiftUsingSituationAggsSonNode - 旧
    private List<BizWaterLiftUsingSituationAggsSonNode> result;
    /**
     * 总 - 库容合计
     */
    private BigDecimal capacityTotal;
    /**
     * 总 - 已用防洪库容
     */
    private BigDecimal totalDfw2;
    /**
     * 总 - 剩余防洪库容
     */
    private BigDecimal totalDiffw5;
    /**
     * 已用防洪库容占比
     */
    private String ratioUsed;

    /**
     * 剩余防洪库容占比
     */
    private String ratioResidue;
}
