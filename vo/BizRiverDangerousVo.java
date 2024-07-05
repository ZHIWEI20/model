package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 河道站 报警站点Vo
 * @author: GSL
 * @createDate: 2023/3/2 10:20
 */
@Data
public class BizRiverDangerousVo {
    /**
     * 保证水位
     */
    private Double grZ;
    /**
     * 实测最高水位
     */
    private Double obhtZ;
    /**
     * 警戒水位
     */
    private Double wrZ;
    /**
     * 报警等级
     */
    private String status;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tm;
    /**
     * 水位
     */
    private Double z;
}
