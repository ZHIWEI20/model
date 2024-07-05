package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 会商资料-重要水情表Vo
 * @author: GSL
 * @createDate: 2022/12/13 11:21
 */
@Data
public class BizImportantStationWaterInfoVo {
    /**
     * 流量差 第二天-第一天
     */
    private Double diffQ;
    /**
     * 水位差 第二天-第一天
     */
    private Double diffZ;
    /**
     * 水位
     */
    private Double z;
    /**
     * 流量
     */
    private Double q;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 河流名
     */
    private String rvnm;
    /**
     * 测站名称
     */
    private String stnm;
    /**
     * 测站类型
     */
    private String sttp;
    /**
     * 警戒
     */
    private Double alert;
    /**
     * 距警戒
     */
    private Double exceedAlert;
    /**
     * 保证
     */
    private Double grz;
    /**
     * 距保证
     */
    private Double exceedGrz;
}
