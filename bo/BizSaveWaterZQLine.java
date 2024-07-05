package com.shunwang.api.monitorWarning.model.bo;

import lombok.Data;

/**
 * @description: 保存水文站水位流量关系List中的对象
 * @author: GSL
 * @createDate: 2023/1/11 11:12
 */
@Data
public class BizSaveWaterZQLine {
    /**
     * 点序号
     */
    private Integer ptno;
    /**
     * 水位
     */
    private Double z;
    /**
     * 流量
     */
    private Double q;
}
