package com.shunwang.api.monitorWarning.model.po;

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
 * @description: 水文水位站多站对比方案Po
 * @author: GSL
 * @createDate: 2023/8/16 11:33
 */
@ApiModel("多站对比方案表Po")
@TableName("BIZ_MULTI_COMPARE_PLAN")
@Data
public class BizMultiComparePlanPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("方案ID")
    @TableId("PLAN_ID")
    private Integer planId;

    @ApiModelProperty("测站编码")
    @TableField("STCD")
    private String stcd;

    @ApiModelProperty("测站名称")
    @TableField("STNM")
    private String stnm;

    @ApiModelProperty("对比站点数据")
    @TableField("STCD_JSON")
    private String stcdJson;

    @ApiModelProperty("方案名称")
    @TableField("PLAN_NAME")
    private String planName;

    @ApiModelProperty("创建人Id")
    @TableField("USER_ID")
    private Long userId;

    @ApiModelProperty("创建时间")
    @TableField("CREATE_TIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty("创建者昵称")
    @TableField("NICK_NAME")
    private String nickName;

    @ApiModelProperty("创建者单位")
    @TableField("USER_DEPT")
    private String userDept;
}
