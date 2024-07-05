package com.shunwang.api.monitorWarning.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 水情超警-总-修改
 * @author: ZL
 * @createDate: 2023/5/30 16:54
 */
@Data
public class RealWarningInfoModiVo {

    @ApiModelProperty("水库站点数据")
    private List<RealWarningInfoDataByRiverVo> rsvrList;

    @ApiModelProperty("河道站点数据")
    private List<RealWarningInfoDataByRiverVo> riverList;

    @ApiModelProperty("湖泊数据")
    private List<RealWarningInfoDataByRiverVo> lackList;

    @ApiModelProperty("超警戒")
    private List<RealWarningInfoDataByRiverVo> exceedAlertList;

    @ApiModelProperty("超保证")
    private List<RealWarningInfoDataByRiverVo> exceedGrzList;

    @ApiModelProperty("超历史最高")
    private List<RealWarningInfoDataByRiverVo> exceedHistoryList;

     @ApiModelProperty("超汛期")
    private List<RealWarningInfoDataByRiverVo> exceedXunXianList;

     @ApiModelProperty("超监管水库")
    private List<RealWarningInfoDataByRiverVo> ultraRegulatedReservoirs;

     @ApiModelProperty("超正常高")
    private List<RealWarningInfoDataByRiverVo> exceedNormzList;

     @ApiModelProperty("超坝顶高层")
    private List<RealWarningInfoDataByRiverVo> exceedDeMelList;

     @ApiModelProperty("超校验洪水位")
    private List<RealWarningInfoDataByRiverVo> exceedCkFlzList;

     @ApiModelProperty("超设计洪水位-水库")
    private List<RealWarningInfoDataByRiverVo> exceedDsFlzList;
    //超警横幅
    @ApiModelProperty("超汛限-大中型水库")
    private int exceedNumberByLarge;

    @ApiModelProperty("超汛限-小型水库")
    private int exceedNumberBySmall;

    @ApiModelProperty("河道-超历史")
    private int exceedHistoryNumber;

    @ApiModelProperty("河道-超保证")
    private int exceedGrzNumber;

    @ApiModelProperty("河道-超警戒")
    private int exceedWrzNumber;

    @ApiModelProperty("河道-涉及河流条数")
    private int effectRiverNumber;
}
