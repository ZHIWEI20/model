package com.shunwang.api.monitorWarning.model.bo;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @description: 旬月值对比Bo
 * @author: GSL
 * @createDate: 2022/11/30 15:23
 */
@Data
public class BizMonthCompareBo {
    /**
     * 要查询的数据类型 6种  MAXH MINH AVGH MAXQ MINQ AVGQ  没有区别 反正一次性全部查出来
     */
    private String dataType;
    /**
     * 历史年份 结束年份
     */
    private Integer endYear;
    /**
     * 历史年份 开始年份
     */
    private Integer startYear;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 旬or月？ 旬：MEADOW 月：MONTH
     */
    private String timeType;
    /**
     * 当前年份
     */
    private Integer year;
}
