package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水文站 水位流量散点图Vo中List装的类
 * @author: GSL
 * @createDate: 2022/12/1 17:52
 */
@Data
public class BizRiverZQScatterDiagram {
    /**
     * 测流方法
     */
    private String msqmt;
    /**
     * 时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;
    /**
     * 流量
     */
    private Double q;
    /**
     * 水位
     */
    private Double z;
}
