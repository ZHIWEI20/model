package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 首页-查询报警站点Bo
 * @author: GSL
 * @createDate: 2023/3/2 10:04
 */
@Data
@ApiModel("查询报警站点Bo")
public class BizQueryDangerousStationBo {
    @ApiModelProperty("查询开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTm;

    @ApiModelProperty("查询结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTm;

    @ApiModelProperty("站点类型 RIVER or RSVR")
    private String stationCode;
}
