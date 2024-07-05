package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 历史同期对比 Bo
 * @author: GSL
 * @createDate: 2022/11/29 16:28
 */
@ApiModel("历史同期对比 Bo")
@Data
public class BizHistoryCompareBo {
    @ApiModelProperty("开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    
    @ApiModelProperty("开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;
    
    @ApiModelProperty("测站编码")
    private String stcd;
    
    @ApiModelProperty("年份")
    private String year;
}
