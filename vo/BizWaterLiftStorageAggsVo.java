package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.List;

/**
 * 水库蓄量情况聚合vo
 */
@Data
public class BizWaterLiftStorageAggsVo {

    //水库蓄量情况
    private List<BizWaterLiftStorageVo> waterLiftStorageVos;

    //蓄水量总数
    private String sumW;

    //待蓄水量总数
    private String sumDw;

    //蓄水量占比
    private String ratioW;

    //待蓄水量占比
    private String ratioDw;
}
