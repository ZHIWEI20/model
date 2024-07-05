package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @description: 站点-水位流量处理Vo
 * @author: ZL
 * @createDate: 2023/7/17 15:28
 */
@Data
public class BizDealLinkageWaterLevelDataVo {
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站名字
     */
    private String stnm;
    /**
     * 站点分类 水库站 1 控制站 2
     */
    private Integer sttp;

    private List<String> ftime; // 时间

    /**
     * 若是水库 就是入库,出库,水位
     * 如若不是,就是水位,流量
     */
    private List<Object> rqList; // 入库流量
    private List<Object> rotqList; // 出库流量
    private List<Object> rhList; // 水位
}
