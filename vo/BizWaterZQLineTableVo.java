package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水文站 水位流量关系曲线表格数据 Vo
 * @author: GSL
 * @createDate: 2022/12/1 10:26
 */
@Data
public class BizWaterZQLineTableVo {
    /**
     * tm
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;
    /**
     * z
     */
    private Double z;
    /**
     * 问
     */
    private Double q;
}
