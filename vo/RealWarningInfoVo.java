package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @description: 水情超警Vo
 * @author: ZL
 * @createDate: 2023/2/28 10:57
 */
@Data
public class RealWarningInfoVo {
    /**
     * 超警戒
     */
    private List<RealWarningInfoDataVo> exceedAlert;
    /**
     * 超警戒数目
     */
    private Integer exceedAlertNum;
    /**
     * 超保证
     */
    private List<RealWarningInfoDataVo> exceedGrz;
    /**
     * 超保证数量
     */
    private Integer exceedGrzNum;
    /**
     * 超历史最高
     */
    private List<RealWarningInfoDataVo> exceedHistory;
    /**
     * 超历史最高数量
     */
    private Integer exceedHistoryNum;
    /**
     * 超汛限
     */
    private List<RealWarningInfoDataVo> exceedFsLtDz;
    /**
     * 超汛限数量
     */
    private Integer exceedFsLtDzNum;
    /**
     * 所有数据
     */
    private List<RealWarningInfoDataVo> allData;
    /**
     * 强监管水库超讯详情
     */
    private List<RealWarningInfoDataVo> exceedFsLtDzByPowerSuperVise;

}
