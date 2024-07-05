package com.shunwang.api.monitorWarning.model.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @description:
 * @author: ZL
 * @createDate: 2023/5/16 17:36
 */
@Data
@ApiModel("水情工情-概化图配置Vo")
public class BizQuerySameStcdFigureVo {
    /**
     * 概化图id
     */
    private Integer id;
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
