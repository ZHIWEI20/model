package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 雨量过程Bo
 * @author: GSL
 * @createDate: 2022/12/9 10:13
 */
@ApiModel("雨量过程Bo")
@Data
public class BizLoadRainfallProcessBo {
    
    @ApiModelProperty("开始时间  yyyy-MM-dd HH:mm")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date startDate;
    
    @ApiModelProperty("结束时间  yyyy-MM-dd HH:mm")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date endDate;
    
    @ApiModelProperty("时段长")
    private Long interval;
    
    @ApiModelProperty("测站编码")
    private String stcd;
}
