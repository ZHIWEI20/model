package com.shunwang.api.monitorWarning.model.bo;

import lombok.Data;

/**
 * @description: 首页-雨情信息-预期面雨量查询Bo里的站点信息
 * @author: GSL
 * @createDate: 2023/2/20 17:46
 */
@Data
public class BizHomePageArealRainFallStcd {
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
}
