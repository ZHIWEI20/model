package com.shunwang.api.monitorWarning.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 水文站报汛特征值Bo
 * @author: GSL
 * @createDate: 2022/12/2 12:11
 */
@Data
public class BizRiverEigenvalueBo {
    /**
     * 开始日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startDate;
    /**
     * 结束日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endDate;
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 数据类型
     */
    private String dataType;
}
