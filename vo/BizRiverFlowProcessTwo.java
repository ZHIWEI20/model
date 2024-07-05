package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水文站水位流量关系Vo 第二个对象 用来装特殊水位流量出现的时间等
 * @author: GSL
 * @createDate: 2022/12/3 18:24
 */
@Data
public class BizRiverFlowProcessTwo {
    /**
     * 历史最低水位
     */
    private Double hlZ;
    /**
     * 历史最低水位出现时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hlZTm;
    /**
     * 查询时间内最大流量
     */
    private Double maxQ;
    /**
     * 查询时间内最大流量出现时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date maxQTm;
    /**
     * 查询时间内最大水位
     */
    private Double maxZ;
    /**
     * 查询时间内最大水位出现时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date maxZTm;
    /**
     * 查询时间内最小流量
     */
    private Double minQ;
    /**
     * 查询时间内最小流量出现时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date minQTm;
    /**
     * 查询时间内最低水位
     */
    private Double minZ;
    /**
     * 查询时间内最低水位出现时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date minZTm;
    /**
     * 实测最高水位
     */
    private Double obhtZ;
    /**
     * 实测最高水位出现时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date obhtZTm;
    /**
     * 实测最大流量
     */
    private Double obmxQ;
    /**
     * 实测最大流量出现时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date obmxQTm;
    /**
     * 警戒流量
     */
    private Double wrQ;
    /**
     * 警戒水位
     */
    private Double wrZ;
    /**
     * 保证水位
     */
    private Double grZ;
    /**
     * 低水位告警值
     */
    private Double laZ;
}
