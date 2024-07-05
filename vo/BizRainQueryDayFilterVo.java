package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @description: 站点雨情Vo
 * @author: GSL
 * @createDate: 2022/11/28 11:19
 */
@Data
public class BizRainQueryDayFilterVo {
    /**
     * 降雨值
     */
    private Double dyp;
    /**
     * 经度
     */
    private Double lgtd;
    /**
     * 纬度
     */
    private Double lttd;
    /**
     * 降雨状态 D0-D9
     */
    private String status;
    /**
     * 站点编码
     */
    private String stcd;
    /**
     * 站点名称
     */
    private String stnm;
    /**
     * 站点类型
     */
    private String sttp;
    /**
     * 显示级别
     */
    private String level;


}
