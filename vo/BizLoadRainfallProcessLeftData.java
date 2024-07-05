package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @description: 雨量过程Vo左边图画数据
 * @author: GSL
 * @createDate: 2022/12/9 11:14
 */
@Data
public class BizLoadRainfallProcessLeftData {
    /**
     * 时段雨量
     */
    private List<Double> hQ;
    /**
     * 总雨量
     */
    private List<Double> hqSum;
    /**
     * 时间list
     */
    private List<String> tm;
}
