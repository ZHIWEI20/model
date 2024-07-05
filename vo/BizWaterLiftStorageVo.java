package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 水库蓄量情况
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BizWaterLiftStorageVo {

    //河系名称
    private String hnnm;

    //蓄水量
    private BigDecimal w;

    //待蓄水量
    private BigDecimal dw;

    //死水位量
    private BigDecimal ddcp;

    //总库容
    private BigDecimal ttcp;
    //测站编码
    private String stcd;



}
