package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: ZL
 * @createDate: 2023/5/11 10:28
 */
@Data
public class TimeAndDataVo {

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private List<Date> dateList;

    private List<Double> doubleList;
}
