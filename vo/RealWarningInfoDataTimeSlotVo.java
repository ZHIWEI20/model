package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @description: 水情工情-时间段查询
 * @author: ZL
 * @createDate: 2023/8/1 18:14
 */
@Data
public class RealWarningInfoDataTimeSlotVo {
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站名称
     */
    private String stnm;
    /**
     * 河流
     */
    private String river;
    /**
     * 时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;
    /**
     * 水位
     */
    private BigDecimal rz;
    /**
     * 超警值
     */
    private BigDecimal exceedAlertValue;


    private List<BigDecimal> xunXianValue;
    /**
     * 坝顶高程
     */
    private BigDecimal daMel;
    /**
     * 校验洪水位
     */
    private BigDecimal ckFlz;
    /**
     * 设计洪水位
     */
    private BigDecimal dsFlz;

    /**
     * 特征值
     */
    private BigDecimal featuresValue;
    /**
     * 状态
     */
    private String status;
    /**
     * 类别
     */
    private String sttpName;
    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * lgtd 经度
     */
    private BigDecimal lgtd;
    /**
     * lttd 纬度
     */
    private BigDecimal lttd;

    /**
     * 类型是不是大型水库 L为大型水库,M为中型水库,S为小型水库,D为湖泊站点
     *
     * @param exceedAlertValue
     */
    private String rsvrType;

    /**
     * 判断是不是水库 ture 表示是 false表示不是
     *
     * @param exceedAlertValue
     */
    private Boolean isRR;

    /**
     * 超特征天数
     */
    private List<Integer> exceedDays;
    /**
     * 超汛期开始-结束
     */
    private List<String> exceedTms;
    /**
     * 超特征值 List
     */
    private List<BigDecimal> exceedValueList;
    /**
     * 超特征的类别
     */
    private String exceedSymBolType;
}
