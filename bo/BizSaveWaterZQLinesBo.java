package com.shunwang.api.monitorWarning.model.bo;

import lombok.Data;

import java.util.List;

/**
 * @description: 保存水文站水位流量关系Bo
 * @author: GSL
 * @createDate: 2023/1/11 11:07
 */
@Data
public class BizSaveWaterZQLinesBo {
    /**
     * 水位流量关系线List
     */
    private List<BizSaveWaterZQLine> list;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 曲线名称
     */
    private String lnnm;
    /**
     * 启用时间
     */
    private String bgTM;
    /**
     * 备注
     */
    private String comments;
}
