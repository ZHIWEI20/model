package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水库出库流量计算Vo
 * @author: GSL
 * @createDate: 2022/11/30 10:22
 */
@ApiModel("水库出库流量计算Vo")
@Data
public class BizRsvrOutQCalcVo {
    @ApiModelProperty("汛限水位")
    private Double fsltdz;
    
    @ApiModelProperty("入流")
    private Double inq;
    
    @ApiModelProperty("出流")
    private Double otq;
    
    @ApiModelProperty("水位")
    private Double rz;
    
    @ApiModelProperty("蓄水量")
    private Double w;
    
    @ApiModelProperty("测流方法")
    private String msqmt;
    
    @ApiModelProperty("测站编码")
    private String stcd;
    
    @ApiModelProperty("时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;
    
}
