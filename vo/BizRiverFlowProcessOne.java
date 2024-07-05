package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水文站水位流量关系Vo的list对象 用来装水位流量 信息
 * @author: GSL
 * @createDate: 2022/12/3 18:24
 */
@Data
public class BizRiverFlowProcessOne {
    /**
     * 测流方法
     */
    private String msqmt;
    /**
     * 流量
     */
    private Double q;
    /**
     * 时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;
    /**
     * 水势
     */
    private String wptn;
    /**
     * 距警戒
     */
    private Double wrz_diff;
    /**
     * 水位
     */
    private Double z;
}
