package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: GSL
 * @createDate: 2022/11/22 15:50
 */
@Data
@ApiModel("用户关注表")
@TableName("BIZ_USER_FOCUS")
public class  BizUserFocusPo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    
    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Integer userId;
    
    @ApiModelProperty("关注的站点编码")
    @TableField("stcd")
    private String stcd;
    
    @ApiModelProperty("关注的站点名称")
    @TableField("stnm")
    private String stnm;

    @ApiModelProperty("关注的站点类型")
    @TableField("sttp")
    private String sttp;
    
    @ApiModelProperty("关注时间")
    @TableField("focus_tm")
    private Date focusTm;

    @ApiModelProperty("方案id")
    @TableField("fa_id")
    private Integer faId;
}
