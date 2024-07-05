package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水库面板 水位-蓄水量过程线Bo
 * @author: GSL
 * @createDate: 2022/11/22 19:52
 */
@Data
@ApiModel("开始时间+结束时间+站点编码+时段长标志Bo")
public class BizRsvrProcessBo {
    @ApiModelProperty("查询开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    @ApiModelProperty("查询结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;
    
    @ApiModelProperty("站点编码")
    private String stcd;

    @ApiModelProperty("时段长标志")
    private Integer step;
}
