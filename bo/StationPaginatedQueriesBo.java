package com.shunwang.api.monitorWarning.model.bo;

import lombok.Data;

import java.util.List;

/**
 * 2024-01-16 11:00:33
 *
 * @author zhaolin
 */
@Data
public class StationPaginatedQueriesBo {
    private int pageNum;
    private int pageSize;
    //站码
    private String stcd;
    //站名
    private String stnm;
    //站点类别
    private List<String> sttp;
    //站点级别
    private List<String> levels;
    //别名
    private String nickName;
}
