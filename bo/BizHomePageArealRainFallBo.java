package com.shunwang.api.monitorWarning.model.bo;

import lombok.Data;

import java.util.List;

/**
 * @description: 首页-雨情信息-区域面雨量查询Bo
 * @author: GSL
 * @createDate: 2023/2/20 16:20
 */
@Data
public class BizHomePageArealRainFallBo {
    /**
     * 区域内的站点属性List
     */
    private List<BizHomePageArealRainFallStcd> stcdsBo;
    /**
     * 开始时间
     */
    private String st;
    /**
     * 结束时间
     */
    private String et;
    /**
     * 分区名称
     */
    private String areaName;
    /**
     * 方案id
     */
    private Integer faId;
    /**
     * 方案类别 0为水情搜索,1为统计表查看
     */
    private Integer basinCategory;
}
