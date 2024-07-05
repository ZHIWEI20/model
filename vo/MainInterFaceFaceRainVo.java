package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.common.enums.ConstantEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @description: 主界面面雨量的显示
 * @author: ZL
 * @createDate: 2023/5/22 10:15
 */
@Data
@ApiModel("主界面雨量显示")
public class MainInterFaceFaceRainVo {
    @ApiModelProperty("分区")
    private String partition;

    @ApiModelProperty("分区Id")
    private String qyId;

    @ApiModelProperty("面雨量")
    private String faceRain;

    @ApiModelProperty("流域")
    private String drainageBasin;

    @ApiModelProperty("路径")
    private List<String> path;

}
