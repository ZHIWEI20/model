package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @description: 水库/水文 站 入库流量计算 Vo
 * @author: GSL
 * @createDate: 2022/12/5 18:01
 */
@Data
public class BizWaterCalculationVo {
    /**
     * 左边表格里的详细数据
     */
    List<BizWaterCalculationLeftTail> leftTailData;
    /**
     * 左边表格顶部的数据
     */
    BizWaterCalculationLeftTop leftTailTop;
    /**
     * 右边图画的数据
     */
    List<BizWaterCalculationRight> rightData;
}
