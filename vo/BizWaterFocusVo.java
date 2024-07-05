package com.shunwang.api.monitorWarning.model.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description:
 * @author: ZL
 * @createDate: 2023/9/25 9:34
 */
@Data
public class BizWaterFocusVo {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("id又称方案id")
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer userId;


    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @TableField(exist = false)
    private String stcd;

    @TableField(exist = false)
    private String stnm;

    @TableField(exist = false)
    private String type;

    @ApiModelProperty("是否关注 true表示关注 false表示不关注")
    private Boolean isConcern;

}
