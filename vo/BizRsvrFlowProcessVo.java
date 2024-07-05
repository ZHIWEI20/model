package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shunwang.api.monitorWarning.model.po.BizStRsvrFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStRsvrRPo;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description: 站点面板 水库水位-入出库关系表Vo
 * @author: GSL
 * @createDate: 2022/11/23 10:01
 */
@Data
public class BizRsvrFlowProcessVo {
    /**
     * 水雨情水库数据List
     */
    private List<BizStRsvrRPo> list;
    /**
     * 库(湖)站防洪指标表信息
     */
    private BizStRsvrFcchBPo bizStRsvrFcchBPo;
    /**
     * 最大inq
     */
    private Double maxInq;
    /**
     * 最大inq时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date maxInqTime;
    /**
     * 最大otq
     */
    private Double maxOtq;
    /**
     * 最大otq时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date maxOtqTime;
    /**
     * 最大水位
     */
    private Double maxZ;
    /**
     * 最大水位time
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date maxZTime;
    /**
     * 最小inq
     */
    private Double minInq;
    /**
     * 最小inq时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date minInqTime;
    /**
     * 最小otq
     */
    private Double minOtq;
    /**
     * 最小otq时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date minOtqTime;
    /**
     * 最小水位
     */
    private Double minZ;
    /**
     * 最小水位time
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date minZTime;

    /**
     * 预报数据(临时发布)
     */
    private List<WaterLevelFlowVo> foreDataList;
    /**
     * 最终发布数据
     */
    private List<WaterLevelFlowVo> finallyPublishList;

    /**
     * 讯限水位
     */
    private TimeAndDataVo floodWaterLevels;
    /**
     * realTime
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private List<Date> realDate;
}
