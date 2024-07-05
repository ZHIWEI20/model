package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shunwang.common.utils.StringUtils;
import lombok.Data;
import org.springframework.security.core.parameters.P;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 水雨情摘要DataVo
 * @author: ZL
 * @createDate: 2023/2/28 14:45
 */
@Data
public class RealWarningInfoDataVo {

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
    private Double rz;
    /**
     * 超警值
     */
    private Double exceedAlertValue;
    /**
     * 特征值
     */
    private Double featuresValue;
    /**
     * 状态
     */
    private String status;
    /**
     * 类别
     */
    private String sttpName;
    /**
     * 超警时长
     */
    private Double exceedAlertTimeSlot;
    /**
     * 排序
     */
    private Integer orderNum;
    /**
     * 0表示超警戒 1表示保证水位 2.超历史最高
     *RR  3 表示超汛限  4为超保证
     */
    private Integer flag;

    /**
     * lgtd 经度
     */
    private BigDecimal lgtd;
    /**
     * lttd 纬度
     */
    private BigDecimal lttd;

    /**
     * 类型是不是大型水库 L为大型水库,M为中型水库,S为小型水库
     * @param exceedAlertValue
     */
    private String rsvrType;

    /**
     * 判断是不是水库 ture 表示是 false表示不是
     * @param exceedAlertValue
     */
    private Boolean isRR;
}
