package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水文站水位流量过程Bo
 * @author: GSL
 * @createDate: 2022/12/3 18:11
 */
@Data
@ApiModel("开始时间+结束时间+站点编码+时段长标志Bo")
public class BizRiverProcessBo {
    @ApiModelProperty("查询开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date startDate;

    @ApiModelProperty("查询结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date endDate;

    @ApiModelProperty("站点编码")
    private String stcd;

    @ApiModelProperty("时段长标志")
    private Integer step;
}
