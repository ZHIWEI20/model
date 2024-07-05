package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 库容运用统计
 */
@Data
public class BizWaterLiftUsingStatisticalVo {

    //站点编码
    private String stcd;

    //站点名称
    private String stnm;

    //河系名称
    private String hhnm;

    //待消落库容(亿m) == 已用防洪库容
    private BigDecimal downCp;

    //可用库容(亿m)
    private BigDecimal usableCp;

    //剩余防洪库容(亿m)
    private BigDecimal residueFldcp;

    //死水位以上蓄水量(亿m)
    private BigDecimal ddzUpW;

    //距正常蓄水位库容(亿m)
    private BigDecimal wCp;
}
