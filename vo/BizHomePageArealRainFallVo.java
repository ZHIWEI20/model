package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 首页-雨情信息-区域面雨量Vo
 * @author: GSL
 * @createDate: 2023/2/20 16:23
 */
@Data
public class BizHomePageArealRainFallVo {
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站名称
     */
    private String stnm;
    /**
     * lgtd 经度
     */
    private Double lgtd;
    /**
     * lttd 纬度
     */
    private Double lttd;
    /**
     * 总降雨量
     */
    private Double rainSum;
}
