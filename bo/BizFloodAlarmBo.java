package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 洪水报警Bo
 * @author: ZL
 * @createDate: 2022/11/29 11:44
 */
@Data
@ApiModel("洪水报警bo")
public class BizFloodAlarmBo {

    @ApiModelProperty("8点时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eightstr;

    @ApiModelProperty("开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sttm;

    @ApiModelProperty("结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date edtm;

    @ApiModelProperty("类型 1为洪水报警-水库 2为洪水报警-河道 3为枯水报警-水库 4为枯水报警-河道 5为水位变幅:水位变幅 + 水库 6为水位变幅:水位变幅 + 河道 7为水位变幅:最大变幅 + 水库 8为最大变幅 + 河道")
    private Integer type;

    @ApiModelProperty(" '0'表示全省 史河,淠河,滁河 新安江")
    private String rvNmType;
}
