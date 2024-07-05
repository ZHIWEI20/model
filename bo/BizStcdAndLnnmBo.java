package com.shunwang.api.monitorWarning.model.bo;

import lombok.Data;

/**
 * @description: lnnm和stcd  Bo
 * @author: GSL
 * @createDate: 2022/12/1 10:24
 */
@Data
public class BizStcdAndLnnmBo {
    /**
     * 曲线名称
     */
    private String lnnm;
    /**
     * 测站编码
     */
    private String stcd;
}
