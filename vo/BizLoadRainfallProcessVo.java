package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.ysq.model.po.BizStPptnRPo;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * @description: 雨量过程Vo
 * @author: GSL
 * @createDate: 2022/12/9 10:17
 */
@Data
public class BizLoadRainfallProcessVo {
    /**
     * 左边的图数据 显示每个时段降雨量  和 总降雨量 和时间
     */
    BizLoadRainfallProcessLeftData chartData;
    /**
     * 右边表格数据
     */
    private List<BizStPptnRPo> gridData;
}
