package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 水位流量对应关系
 * @author: ZL
 * @createDate: 2023/3/2 17:18
 */
@Data
public class RzRQCorrespondingCurveVo {

    /**
     * 蓄水量
     */
    private Double w;
    /**
     * 水位
     */
    private Double rz;
    /**
     * 测站编码
     */
    private String stcd;
}
