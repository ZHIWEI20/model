package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.resultManagement.model.vo.AreaRainFallTimeVo;
import lombok.Data;
import lombok.Value;

import java.util.List;
import java.util.Map;

/**
 * @description: 分区面雨量Vo
 * @author: ZL
 * @createDate: 2023/2/10 20:29
 */
@Data
public class AreaRainFallVo {
    /**
     * 数据List
     */
    List<AreaRainFallTimeVo> listed;
    /**
     * 表头List
     */
    List<Map<String,Object>> tableList;
}
