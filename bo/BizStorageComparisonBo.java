package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description: 蓄量对比Bo
 * @author: GSL
 * @createDate: 2022/11/25 15:40
 */
@Data
@ApiModel("蓄量对比Bo")
public class BizStorageComparisonBo {
    @ApiModelProperty("开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startDate;
    
    @ApiModelProperty("结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endDate;

    @ApiModelProperty("历史年份")
    private List<String> historyYears;

    @ApiModelProperty("站点编码")
    private String stcd;
}
