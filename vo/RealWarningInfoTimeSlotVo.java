package com.shunwang.api.monitorWarning.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: ZL
 * @createDate: 2023/8/1 18:18
 */
@Data
public class
RealWarningInfoTimeSlotVo {
    @ApiModelProperty("水库站点数据")
    private List<RealWarningInfoDataTimeSlotVo> rsvrList;

    @ApiModelProperty("河道站点数据")
    private List<RealWarningInfoDataTimeSlotVo> riverList;

    @ApiModelProperty("湖泊数据")
    private List<RealWarningInfoDataTimeSlotVo> lackList;

    @ApiModelProperty("超警戒")
    private List<RealWarningInfoDataTimeSlotVo> exceedAlertList;

    @ApiModelProperty("超保证")
    private List<RealWarningInfoDataTimeSlotVo> exceedGrzList;

    @ApiModelProperty("超历史最高")
    private List<RealWarningInfoDataTimeSlotVo> exceedHistoryList;

    @ApiModelProperty("超汛期")
    private List<RealWarningInfoDataTimeSlotVo> exceedXunXianList;

    @ApiModelProperty("超监管水库")
    private List<RealWarningInfoDataTimeSlotVo> ultraRegulatedReservoirs;

    @ApiModelProperty("超正常高")
    private List<RealWarningInfoDataTimeSlotVo> exceedNormzList;

    @ApiModelProperty("超坝顶高层")
    private List<RealWarningInfoDataTimeSlotVo> exceedDeMelList;

    @ApiModelProperty("超校验洪水位")
    private List<RealWarningInfoDataTimeSlotVo> exceedCkFlzList;

    @ApiModelProperty("超设计洪水位")
    private List<RealWarningInfoDataTimeSlotVo> exceedDsFlzList;
}
