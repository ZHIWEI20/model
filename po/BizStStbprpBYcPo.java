package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (StStbprpBYc)实体类
 *
 * @author ZW
 * @since 2023-08-14 14:54:50
 */
@Data
@ApiModel("遥测站基本属性表")
@TableName("ST_STBPRP_B_YC")
public class BizStStbprpBYcPo implements Serializable {
    private static final long serialVersionUID = 783900134583341313L;

    @ApiModelProperty("测站编码")
    @TableId("STCD")
    private String stcd;

    @ApiModelProperty("测站名称")
    @TableField("STNM")
    private String stnm;

    /**
     * 	1水情遥测站、2短传站、3集合转发站、4中继站、5分中心站、6墒情站、7地下水站、8其他站。
     * 	如是多项则顺续填写。例如，浍塘沟即是水情遥测站，又是墒情站、地下水站，
     * 	则填写167，前后中间不准有空格或其他符号。
     */
    @ApiModelProperty("遥测站属性")
    @TableField("YCZSX")
    private String yczsx;

    @ApiModelProperty("RTU型号")
    @TableField("RTUXH")
    private String rtuxh;

    @ApiModelProperty("水位基值")
    @TableField("BASE")
    private Double base;

    @ApiModelProperty("最低可测水位值")
    @TableField("ZDKCSW")
    private Double zdkcsw;

    @ApiModelProperty("水位校差值")
    @TableField("MDPR")
    private Double mdpr;

    @ApiModelProperty("信道")
    @TableField("XD")
    private String xd;

    @ApiModelProperty("电池容量")
    @TableField("DCRL")
    private String dcrl;

    @ApiModelProperty("遥测项目")
    @TableField("YCXM")
    private String ycxm;

    @ApiModelProperty("遥测站码")
    @TableField("YCZM")
    private String yczm;

    @ApiModelProperty("分中心")
    @TableField("FZX")
    private String fzx;

    @ApiModelProperty("行政区码")
    @TableField("ADDVCD")
    private String addvcd;

    @ApiModelProperty("水文分区")
    @TableField("SWFQ")
    private String swfq;

    @ApiModelProperty("自定义分区")
    @TableField("ZDYFQ")
    private String zdyfq;

    @ApiModelProperty("流域编码")
    @TableField("RVCD")
    private String rvcd;

    @ApiModelProperty("库（湖）类型")
    @TableField("khlx")
    private Integer khlx;

    @ApiModelProperty("管理单位")
    @TableField("ADAG")
    private String adag;

    @ApiModelProperty("承建商")
    @TableField("cjs")
    private String cjs;

    @ApiModelProperty("遥测站建站时间")
    @TableField("YCZYM")
    private String yczym;

    @ApiModelProperty("旋转角度")
    @TableField("XZJD")
    private Double xzjd;

    @ApiModelProperty("所属项目")
    @TableField("SSXM")
    private String ssxm;

    @ApiModelProperty("县级站")
    @TableField("XIANZHAN")
    private String xianzhan;

    @ApiModelProperty("水库湖泊")
    @TableField("SKHP")
    private String skhp;

    @ApiModelProperty("显示级别")
    @TableField("SHOWLEVEL")
    private Integer showlevel;

    @ApiModelProperty("BATTIME")
    @TableField("BATTIME")
    private Date battime;

    @ApiModelProperty("FXDZX")
    @TableField("fxdzx")
    private String fxdzx;

    @ApiModelProperty("YHDEL")
    @TableField("YHDEL")
    private Double yhdel;

    @ApiModelProperty("ISFORECAST")
    @TableField("ISFORECAST")
    private Integer isforecast;

    @ApiModelProperty("YWDW")
    @TableField("YWDW")
    private String ywdw;

    @ApiModelProperty("ENNMCD")
    @TableField("ENNMCD")
    private String ennmcd;

    @ApiModelProperty("YHDZM")
    @TableField("YHDZM")
    private Integer yhdzm;

    @ApiModelProperty("ISSMS")
    @TableField("ISSMS")
    private Integer issms;

    @ApiModelProperty("ZCDJZH")
    @TableField("ZCDJZH")
    private String zcdjzh;
    /**
     * 水库最大坝高（指：坝基（不包括局部深槽）的最低点至坝顶的高度）
     */
    @ApiModelProperty("水库最大坝高")
    @TableField("SKZDBG")
    private Double skzdbg;
    /**
     * 水库病险标识（1：是病险水库，0：正常）20210726添加
     */
    @ApiModelProperty("水库病险标识")
    @TableField("SKBXBZ")
    private Integer skbxbz;
    /**
     * 水库类型（平原水库就是反调节水库）（1=山区水库,2=丘陵区水库,3=平原区水库,4=暂未划分）
     */
    @ApiModelProperty("水库类型")
    @TableField("SKRSTP")
    private Integer skrstp;

}

