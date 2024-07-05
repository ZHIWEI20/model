package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 我的关注面雨量Vo
 * @author: ZW
 * @createDate: 2023/4/12 11:00
 */
@Data
public class WatershedVo {

    //区域名
    private String areaName;

    //6小时面雨量
    private Double rainSum6h;

    //12小时面雨量
    private Double rainSum12h;

    //24小时面雨量
    private Double rainSum24h;

    //类别
    private Integer basinCategory;
}
