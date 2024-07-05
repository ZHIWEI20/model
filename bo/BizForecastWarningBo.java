package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 预警生成Bo
 * @author: ZL
 * @createDate: 2023/7/18 16:29
 */
@Data
@ApiModel("预警生成Bo")
public class BizForecastWarningBo {

    @ApiModelProperty("测站编码")
    private String stcd;

    @ApiModelProperty("现在的时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date nowTime;

    @ApiModelProperty("单位名称")
    private String unitName;
}
