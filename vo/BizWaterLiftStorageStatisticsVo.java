package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BizWaterLiftStorageStatisticsVo {

    //站点编码
    private String stcd;

    //站点名称
    private String stnm;

    //河系名称
    private String hnnm;

    //当前库容/当前水位对应蓄水量
    private BigDecimal w;

    //汛限库容
    private BigDecimal fsltdw;

    //防洪库容
    private BigDecimal fldcp;

    //死库容
    private BigDecimal ddcp;

    //兴利库容
    private BigDecimal actcp;
}
