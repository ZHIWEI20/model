package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 库容运用概况
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BizWaterLiftUsingSituationVo {

    //河系名称
    private String hnnm;

    //当前库容
    private BigDecimal w;

    //汛限库容
    private BigDecimal fsltdw;

    //防洪高水位对应库容
    private BigDecimal fldcp;

    //库容合计
    private BigDecimal ttcp;

    //已用防洪库容
    private BigDecimal usedFldcp;

    //剩余防洪库容
    private BigDecimal residueFldcp;
}
