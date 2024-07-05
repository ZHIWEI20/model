package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 引调水情表中Project对应的表
 * @author: ZL
 * @createDate: 2023/2/9 10:32
 */
@ApiModel("引调水情表调用")
@TableName("BIZ_WATER_DIVERSION")
@Data
public class BizWaterDiversionPo {

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("项目名字")
    @TableField("PROJECT")
    private String project;

    @ApiModelProperty("排序")
    @TableField("SORT")
    private Integer sort;

    @ApiModelProperty("修改时间")
    @TableField("MIDITIME")
    private Date midiTime;

}
