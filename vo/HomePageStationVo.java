package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 首页站点展示的Vo
 * @author: GSL
 * @createDate: 2022/11/22 9:40
 */
@Data
public class HomePageStationVo {
    /**
     * addvcd 行政区划码
     */
    private String addvcd;
    //private String drp;
    /**
     * esstym 建站年月
     */
    private String esstym;
    /**
     * frgrd 报汛等级
     */
    private String frgrd;
    /**
     * hnnm 水系名称
     */
    private String hnnm;
    /**
     * lgtd 经度
     */
    private BigDecimal lgtd;
    /**
     * lttd 纬度
     */
    private BigDecimal lttd;
    /**
     * rvnm 河流名称
     */
    private String rvnm;
    /**
     * stcd 测站编码
     */
    private String stcd;
    /**
     * stnm 测站名称
     */
    private String stnm;
    /**
     * sttp 测站类型
     */
    private String sttp;
    /**
     * 显示层级等级
     */
    private String level;
    /**
     * 大小水库层级
     */
    private String reservoirType;
    /**
     * 简化名
     */
    private String simpleName;
}
