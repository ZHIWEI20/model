package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.common.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 重要站水情表
 */
@Data
public class BizZStationWaterVo {


    //河流名称
    @Excel(name = "河流名称")
    private String rvnm;

    //站点编码
    @Excel(name = "站点编码")
    private String stcd;

    //站点名称
    @Excel(name = "站点名称")
    private String stnm;

    //水位
    @Excel(name = "水位(m)")
    private BigDecimal rz;

    //水势
    @Excel(name = "水势")
    private String rwptn;

    //入库流量
    @Excel(name = "相应/入库流量(m³/s)")
    private BigDecimal inq;

}
