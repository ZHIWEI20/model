package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description: 水文站水位流量关系Vo
 * @author: GSL
 * @createDate: 2022/12/3 18:14
 */
@Data
public class BizRiverFlowProcessVo {
    /**
     * 水位流量数据
     */
    private List<BizRiverFlowProcessOne> flowProcessList;
    /**
     * 特殊值数据
     */
    private BizRiverFlowProcessTwo lOAD_RIVER_WRDto;

    /**
     * 预报数据
     */
    private List<WaterLevelFlowVo> foreDataList;
    /**
     * 最终数据
     */
    private List<WaterLevelFlowVo> finallyPublishList;
    /**
     * realTime
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private List<Date> realDate;
    //private Boolean lfdFlag;
    //private List<> lfdList;
    //private Boolean lfrFlag;
    //private List<> lfrList;
}
