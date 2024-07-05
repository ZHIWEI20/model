package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * @description: BizStorageComparisonVo中第二个对象
 * @author: GSL
 * @createDate: 2022/11/25 16:04
 */
@Data
public class BizStorageComparisonTwo {
    /**
     * 右侧表格主体信息
     */
    private List<HashMap<String,Object>> data;
    /**
     * 右侧表格头部信息
     */
    private List<BizStorageComparisonThree> header;
}
