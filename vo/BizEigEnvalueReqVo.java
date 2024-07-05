package com.shunwang.api.monitorWarning.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 频率估计Vo
 * @author: ZL
 * @createDate: 2023/4/19 10:30
 */
@Data
@ApiModel("频率估计Vo")
public class BizEigEnvalueReqVo {

    /**
     * 偏态系数
     */
    private BigDecimal Cs;

    /**
     * 样本均值
     */
    private BigDecimal Cv;

    /**
     * 变差系数
     */
    private BigDecimal Ex;

    private List<Double[]>  lineData;

    private List<BizFreqencyByxAxisVo> markData;

    private List<Integer> SampleData;
    /**
     * 散点x,y坐标集合
     */
    private List<Double[]> scatterData;

    /**
     * 坐标变标
     */
    private List<Double> showData;

    /**
     * 实际的坐标
     */
    private List<Double> xData;

    /**
     * 散点x坐标
     */
    private List<Double> scatterXDate;
}
