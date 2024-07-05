package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水文站水位流量散点图Bo
 * @author: GSL
 * @createDate: 2022/12/1 17:47
 */
@Data
public class BizRiverZQScatterDiagramBo {
    /**
     * 开始日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date startDate;
    /**
     * 结束日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date endDate;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站类型
     */
    private String type;
    /**
     * 时长筛选
     */
    private Integer step;
}
