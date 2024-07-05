package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 传播时间概化图数据Vo
 * @author: GSL
 * @createDate: 2023/4/17 11:23
 */
@Data
public class BizQueryDiffuseFigureVo {
    /**
     * 方案ID
     */
    private Integer pid;
    /**
     * 河系名
     */
    private String rvnm;
    /**
     * 概化图
     */
    private String json;
}
