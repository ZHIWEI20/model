package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description: 水文站多站对比Bo
 * @author: GSL
 * @createDate: 2022/12/1 11:55
 */
@Data
public class BizMultiStcdCompareBo {

    @ApiModelProperty("开始日期")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date startDate;


    @ApiModelProperty("结束日期")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date endDate;
    

    @ApiModelProperty("站点编码List")
    private List<String> stcds;
}
