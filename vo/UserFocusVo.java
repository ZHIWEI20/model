package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: GSL
 * @createDate: 2022/11/22 16:14
 */
@Data
public class UserFocusVo {
    /**
     * 关注类型
     */
    private String followType;
    /**
     * 入流
     */
    private Number inq;
    /**
     * 站点类型
     */
    private String sttp;
    /**
     * key
     */
    private String key;
    /**
     * 出流
     */
    private Number otq;
    /**
     * 水位
     */
    private Double rh;
    /**
     * 流量
     */
    private Number rq;
    /**
     * 测站id
     */
    private String stcd;
    /**
     * 测站名称
     */
    private String stnm;
    /**
     * 时间
     */
    private String tm;
    /**
     * 类型
     */
    private String type;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户关注时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date focusTm;
}
