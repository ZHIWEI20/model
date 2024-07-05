package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 开始时间 和 结束时间 和时间类型
 * @author: GSL
 * @createDate: 2022/11/28 10:47
 */
@Data
@ApiModel("開始与結束時間Bo")
public class BizStAndEdTmAndTypeBo {
    /**
     * 开始tm
     */
    @ApiModelProperty("开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH")
    private Date startTm;
    /**
     * 结束tm
     */
    @ApiModelProperty("结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH")
    private Date endTm;
    /**
     * 时间类型
     */
    @ApiModelProperty("时间类型")
    private Integer timeType;
}
