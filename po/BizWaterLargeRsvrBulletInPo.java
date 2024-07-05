package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水情工情-最大水库
 * @author: ZL
 * @createDate: 2023/4/21 11:14
 */
@Data
@TableName("BIZ_WATER_LARGERSVR_BULLETIN")
@ApiModel("水情工情-最大水库测站信息Po")
public class BizWaterLargeRsvrBulletInPo {

    @ApiModelProperty("测站id")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("测站姓名")
    @TableField("STNM")
    private String stnm;

    @ApiModelProperty("排序")
    @TableField("SORT")
    private Integer sort;

    @ApiModelProperty("修改时间")
    @TableField("MODITIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date moditime;

    @ApiModelProperty("测站类别")
    @TableField("STTP")
    private String sttp;

    @ApiModelProperty("测站类型")
    @TableField("TYPE")
    private String type;
}
