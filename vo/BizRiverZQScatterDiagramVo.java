package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @description: 水文站水位流量散点图Vo
 * @author: GSL
 * @createDate: 2022/12/1 17:51
 */
@Data
public class BizRiverZQScatterDiagramVo {
    /**
     * 所有数据List
     */
    private List<BizRiverZQScatterDiagram> list;
    /**
     * msqmt为5的 list
     */
    private List<BizRiverZQScatterDiagram> scData;
    /**
     * msqmt为1的list
     */
    private List<BizRiverZQScatterDiagram> xyData;
}
