package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

@Data
public class BizRiverMeadowData {
    //月份
    private String month;
    //最小水位多年平均
    private Double minHAvgMeadow;
    //最大水位多年平均
    private Double maxHAvgMeadow;
    //最大流量多年平均
    private Double maxQAvgMeadow;
    //最小流量多年平均
    private Double minQAvgMeadow;
    //平均流量多年平均
    private Double avgQAvgMeadow;
    //平均水位多年平均
    private Double avgHAvgMeadow;

    //最小水位统计年数
    private Long minHYearCount;
    //最大水位统计年数
    private Long maxHYearCount;
    //最大流量统计年数
    private Long maxQYearCount;
    //最小流量统计年数
    private Long minQYearCount;
    //平均水位统计年数
    private Long avgHYearCount;
    //平均流量统计年数
    private Long avgQYearCount;

    //最大流量最大值
    private Double maxQMaxMeadow;
    //最小流量最大值
    private Double minQMaxMeadow;
    //最大水位最大值
    private Double maxHMaxMeadow;
    //最小水位最大值
    private Double minHMaxMeadow;
    //平均流量最大值
    private Double avgQMaxMeadow;
    //平均水位最大值
    private Double avgHMaxMeadow;

    //最大流量出现时间
    private Integer maxQTimeMeadow;
    //最小流量出现时间
    private Integer minQTimeMeadow;
    //最大水位出现时间
    private Integer maxHTimeMeadow;
    //最小水位出现时间
    private Integer minHTimeMeadow;
    //平均流量出现时间
    private Integer avgQTimeMeadow;
    //平均水位出现时间
    private Integer avgHTimeMeadow;

    //最大流量最小值
    private Double maxQMinMeadow;
    //最小流量最小值
    private Double minQMinMeadow;
    //最大水位最小值
    private Double maxHMinMeadow;
    //最小水位最小值
    private Double minHMinMeadow;
    //平均流量最小值
    private Double avgQMinMeadow;
    //平均水位最小值
    private Double avgHMinMeadow;

    //最大流量出现年份
    private Integer maxQYearMeadow;
    //最小流量出现年份
    private Integer minQYearMeadow;
    //最大水位出现年份
    private Integer maxHYearMeadow;
    //最小水位出现年份
    private Integer minHYearMeadow;
    //平均流量出现年份
    private Integer avgQYearMeadow;
    //平均水位出现年份
    private Integer avgHYearMeadow;
}
