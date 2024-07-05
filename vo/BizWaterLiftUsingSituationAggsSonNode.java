package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.resultManagement.model.vo.BizWaterLiftUsingStatisticalModiDataVo;
import com.shunwang.api.resultManagement.model.vo.BizWaterLiftUsingStatisticalModiSonDataVo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 库容概括儿子数据
 * @author: ZL
 * @createDate: 2023/3/2 10:56
 */
@Data
public class BizWaterLiftUsingSituationAggsSonNode  {
      /**
     * 第一列:待消落库容 正数相加 / 负数相加
     */
    private BigDecimal dfw2;
    /**
     * 第四列: 死水位以上蓄水量
     */
    private BigDecimal diffW1;
    /**
     * 第五列 据正常蓄水位库容
     */
    private BigDecimal diffW3;
    /**
     * 第二列: 可用库容 正数相加 / 负数相加
     */
    private BigDecimal diffW4;
    /**
     * 第三列: 剩余防洪库容 正数相加 / 负数相加
     */
    private BigDecimal diffW5;
    /**
     * 父节点不需要赋值 为空
     */
    private String stcd;

    private List<BizWaterLiftUsingStatisticalModiSonDataVo> child;

    private String id;
    /**
     * 为-1 就是父节点
     */
    private String p_id;
    /**
     *
     */
    private String sitId;
    /**
     * 就是河流名
     */
    private String title;

    /**
     * diffW2 已用防洪库容
     */
    /**
     * diffW5 剩余防洪库容
     */
    /**
     * diffW6 库容合计
     */
    private BigDecimal diffW6;
    private BigDecimal diffW7;
}
