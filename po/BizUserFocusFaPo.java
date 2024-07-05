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
 * @author: wz
 * @createDate: 2022/11/22 15:50
 */
@Data
@ApiModel("用户关注方案表")
@TableName("BIZ_FOCUS_FA")
public class BizUserFocusFaPo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    
    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Integer userId;
    

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @TableField(exist = false)
    private String stcd;

    @TableField(exist = false)
    private String stnm;
}
