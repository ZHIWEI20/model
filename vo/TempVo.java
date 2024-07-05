package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: ZL
 * @createDate: 2023/8/3 12:00
 */
@Data
public class TempVo {
    /**
     * 时间List
     */
    private List<Date> tmList;
    /**
     * 数据List
     */
    private List<Double> dataList;
}
