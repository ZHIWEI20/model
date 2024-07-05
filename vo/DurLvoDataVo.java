package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description:
 * @author: ZL
 * @createDate: 2023/2/11 15:51
 */
@Data
public class DurLvoDataVo {
    /**
     * 最大面雨量
     */
    private Double MAXp;
    /**
     * 最大面雨量站点编码
     */
    private String MAXstcd;
    /**
     * 最大面雨量站点站名
     */
    private String MAXstnm;
    /**
     * 面雨量
     */
    private Double p;
}
