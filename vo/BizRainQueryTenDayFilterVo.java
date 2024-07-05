package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 雨晴查询 - 旬雨量查询Vo
 * @author: ZL
 * @createDate: 2022/11/29 9:18
 */
@Data
public class BizRainQueryTenDayFilterVo {
    /**
     * 降雨
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
     * 降雨状态 M0-M8
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
