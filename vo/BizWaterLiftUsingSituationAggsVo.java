package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 库容运用概况聚合VO
 */
@Data
public class BizWaterLiftUsingSituationAggsVo {

    //库容运用概况
    private List<BizWaterLiftUsingSituationVo> waterLiftUsingSituationVos;

    //已用防洪库容总数
    private String sumUsed;

    //剩余防洪库容总数
    private String sumResidue;

    //已用防洪库容占比
    private String ratioUsed;

    //剩余防洪库容占比
    private String ratioResidue;
}
