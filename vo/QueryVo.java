package com.shunwang.api.monitorWarning.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shunwang.api.resultManagement.model.vo.BizStForeCastFpoSelectVo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @description: 建造者模式查询Vo
 * @author: ZL
 * @createDate: 2023/7/18 19:49
 */
@Data
public class QueryVo {
    private String stcd;
    private String unitName;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fymDh;
    //水位List
    private List<BigDecimal> valueList;
    //时间List
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private List<Date> tmList;
    //距警戒线
    private List<BigDecimal> rangeAlertLine;
    //水势
    private List<String> waterPotential;
    //流量
    private List<BigDecimal> qList;
    //降雨计划,无就填0
    private String rainFall;

    private String userName;
    //方案代码
    private Integer uId;
    //是否是水库
    private Boolean isRR;
    //是否是模型计算
    private Boolean isModel;


    public QueryVo(QueryVo.Builder builder) {
        this.stcd = builder.stcd;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.unitName = builder.unitName;
        this.fymDh = builder.fymDh;
        this.valueList = builder.valueList;
        this.tmList = builder.tmList;
        this.rangeAlertLine = builder.rangeAlertLine;
        this.waterPotential = builder.waterPotential;
        this.qList = builder.qList;
        this.rainFall = builder.rainFall;
        this.userName = builder.userName;
        this.uId = builder.uId;
        this.isRR = builder.isRR;
        this.isModel = builder.isModel;
    }

    public static QueryVo.Builder builder() {
        return new QueryVo.Builder();
    }

    public static class Builder {
        private String stcd;
        private String unitName;
        private Date beginTime;
        private Date endTime;

        private Date fymDh;

        private List<BigDecimal> valueList;

        private List<Date> tmList;

        private List<BigDecimal> rangeAlertLine;

        private List<String> waterPotential;

        private List<BigDecimal> qList;

        private String userName;

        private String rainFall;

        private Integer uId;

        private Boolean isRR;

        private Boolean isModel;

        public QueryVo.Builder isModel(Boolean isModel) {
            this.isModel = isModel;
            return this;
        }

        public QueryVo.Builder isRR(Boolean isRR) {
            this.isRR = isRR;
            return this;
        }

        public QueryVo.Builder uId(Integer uId) {
            this.uId = uId;
            return this;
        }
        public QueryVo.Builder userName(String userName) {
            this.userName = userName;
            return this;
        }
        public QueryVo.Builder rainFall(String rainFall) {
            this.rainFall = rainFall;
            return this;
        }

        public QueryVo.Builder qList(List<BigDecimal> qList) {
            this.qList = qList;
            return this;
        }
        public QueryVo.Builder rangeAlertLine(List<BigDecimal> rangeAlertLine) {
            this.rangeAlertLine = rangeAlertLine;
            return this;
        }

        public QueryVo.Builder waterPotential(List<String> waterPotential) {
            this.waterPotential = waterPotential;
            return this;
        }

        public QueryVo.Builder stcd(String stcd) {
            this.stcd = stcd;
            return this;
        }

        public QueryVo.Builder beginTime(Date beginTime) {
            this.beginTime = beginTime;
            return this;
        }


        public QueryVo.Builder endTime(Date endTime) {
            this.endTime = endTime;
            return this;
        }

        public QueryVo.Builder unitName(String unitName) {
            this.unitName = unitName;
            return this;
        }

        public QueryVo.Builder fymDh(Date fymDh) {
            this.fymDh = fymDh;
            return this;
        }

        public QueryVo.Builder tmList(List<Date> tmList) {
            this.tmList = tmList;
            return this;
        }

        public QueryVo.Builder valueList(List<BigDecimal> valueList) {
            this.valueList = valueList;
            return this;
        }

        public QueryVo build() {
            return new QueryVo(this);
        }

    }
}
