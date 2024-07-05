package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: ZW
 * @createDate: 2023/4/11 15:50
 */
@Data
@ApiModel("流域关注表")
@TableName("BIZ_WATERSHED_FOCUS")
public class BizWatershedFocusPo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("关注的站点名称")
    @TableField("stnm")
    private String stnm;

    @ApiModelProperty("关注时间")
    @TableField("focus_tm")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date focusTm;

    @ApiModelProperty("方案id")
    @TableField("fa_id")
    private Integer faId;

    @ApiModelProperty("方案类别 0为水情搜索,1为统计表查看")
    @TableField("BASIN_CATEGORY")
    private Integer basinCategory;

}
