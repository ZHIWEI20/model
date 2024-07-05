package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水库日均值Bo
 * @author: GSL
 * @createDate: 2022/11/22 21:05
 */
@Data
@ApiModel("水库面板 水库日均值Bo")
public class BizPanelAvgBo {
    @ApiModelProperty("查询开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startDate;

    @ApiModelProperty("查询结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endDate;

    @ApiModelProperty("统计时段标志")
    private String stachar;

    @ApiModelProperty("站点编码")
    private String stcd;
}
