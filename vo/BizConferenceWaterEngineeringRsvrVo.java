package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 会商资料-水工程水情-水库水情Vo
 * @author: GSL
 * @createDate: 2022/12/14 9:05
 */
@Data
public class BizConferenceWaterEngineeringRsvrVo {
    /**
     * 库水位
     */
    private Double rz;
    /**
     * 入库流量
     */
    private Double inq;
    /**
     * 出库流量
     */
    private Double otq;
    /**
     * 蓄水量
     */
    private Double w;
    /**
     * 死水位
     */
    private Double ddz;
    /**
     * 死水位 水位差
     */
    private Double diffDdz;
    /**
     * 死水位 蓄量差
     */
    private Double diffDdw;
    /**
     * 汛限水位
     */
    private Double fsltdz;
    /**
     * 汛限水位 水位差
     */
    private Double diffFz;
    /**
     * 汛限水位蓄量差
     */
    private Double diffFw;
    /**
     * 正常高水位
     */
    private Double normz;
    /**
     * 正常高水位 水位差
     */
    private Double diffNz;
    /**
     * 正常高水位蓄量差
     */
    private Double diffNw;
    /**
     * 河系名称
     */
    private String hnnm;
    /**
     * 河流名称
     */
    private String rvnm;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站编码
     */
    private String stnm;
    /**
     * 库水势
     */
    private String wptn;
}
