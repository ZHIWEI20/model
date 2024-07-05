package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 险情险情输出Vo
 * @author: ZL
 * @createDate: 2022/12/26 15:19
 */
@Data
public class DangerousSituationInfoVo {
    /**
     * 险情
     */
    private Integer dangerousNum;
    /**
     * 湖泊以及支流提防
     */
    private Integer dangerousLackNum;
    /**
     * 出现灾情的水库数量
     */
    private Integer dangerousReservoirNum;

    /**
     * 灾情
     */
    /**
     * 受灾人口(万人)
     */
    private Integer floodHitPopulation;

    /**
     * 农作物受灾面积(公顷)
     */
    private Double affectedAreaOfCrops;
    /**
     * 经济损失(亿元)
     */
    private Double economicLoss;
}
