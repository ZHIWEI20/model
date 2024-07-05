package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * @description: 水文站多站对比Vo
 * @author: GSL
 * @createDate: 2022/12/1 11:58
 */
@Data
public class BizRiverMultiStcdCompareVo {
    /**
     * 所有站点名称列表
     */
    List<String> legand;
    /**
     * 对比数据list
     */
    List<HashMap<String, Object>> list;
    /**
     * tm列表
     */
    List<String> tmList;
}
