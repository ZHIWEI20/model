package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水库面板  水情动态展示 Vo 的成员
 * @author: GSL
 * @createDate: 2022/11/23 17:31
 */
@Data
public class BizRsvrWaterDynamicOne {
    /**
     * 入流
     */
    private Double inq;
    /**
     * 出流
     */
    private Double otq;
    /**
     * 水位
     */
    private Double rz;
    /**
     * 站点编码
     */
    private String stcd;
    /**
     * 时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;
    /**
     * 蓄水量
     */
    private Double w;
    /**
     * 水势
     */
    private Integer waterPotential;
}
