package com.shunwang.api.monitorWarning.model.vo;

import lombok.Data;

/**
 * @description: 传播时间-参数配置-自身配置对象
 * @author: GSL
 * @createDate: 2023/4/17 18:13
 */
@Data
public class BizDiffuseSelfInfoVo {
    /**
     * 测站编码
     */
    private String stcd;
    /**
     * 测站名称
     */
    private String stnm;
    /**
     * 测站类型
     */
    private String sttp;
    /**
     * 河流名称
     */
    private String rvnm;
    //后续有需要的 再加
}
