package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 枯水报警Vo
 * @author: ZL
 * @createDate: 2022/11/30 19:45
 */
@Data
public class BizLowWaterAlarmVo {
    /**
     * 层级
     */
    private String levels;
    /**
     * 时段最高水位
     */
    private String compare;
    /**
     * 历史最低库水位
     */
    private Double hlrz;
    /**
     * 历史最小流量
     */
    private Double hmninq;
    /**
     * 入库流量
     */
    private Double inq;
    /**
     * 低水位告警值
     */
    private Double laz;

    /**
     * 经度
     */
    private Double lgtd;
    /**
     * 纬度
     */
    private Double lttd;
    /**
     * 水库:水位
     * 河流:水位
     */
    private Double rz;
    /**
     *
     */
    private String status;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站姓名
     */
    private String stnm;
    /**
     * 测站类别
     */
    private String sttp;
    /**
     * 测站时间
     */
    private String tm;
    /**
     * 流量
     */
    private Double q;
    /**
     * 历史最大入流
     */
    private Double hmxinq;
    /**
     * 历史最高库水位
     */
    private Double hhrz;

}
