package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description: 墒情旱情-墒情简报返回对象
 * @author: GSL
 * @createDate: 2023/5/10 11:56
 */
@Data
public class BizSoilSituationBulletinVo {
    /**
     * 路径
     */
    private String url;
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 文件日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date fileDate;
    /**
     * 第一段落
     */
    private String firstStage;
}
