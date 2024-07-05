package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description:
 * @author: ZL
 * @createDate: 2023/2/11 15:50
 */
@Data
public class DurLvo {
    /**
     * 分区代码
     */
    String qyid;
    /**
     * 降雨
     */
    DurLvoDataVo rain;
}
