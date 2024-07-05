package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 传播时间-参数配置中的关联信息Vo
 * @author: GSL
 * @createDate: 2023/4/17 16:38
 */
@Data
public class BizDiffuseCorrelationVo {
    /**
     * 上下游站类型
     */
    private Integer type;
    /**
     * 传播时间
     */
    private Double travel;
    /**
     * 里程
     */
    private Double mileage;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站名称
     */
    private String stnm;
}
