package com.shunwang.api.monitorWarning.model.vo;

import com.shunwang.api.monitorWarning.model.po.BizStRvFcchBPo;
import com.shunwang.api.monitorWarning.model.po.BizStStbprpBPo;
import lombok.Data;

import java.util.List;

/**
 * @description: 水文站测站信息Vo
 * @author: GSL
 * @createDate: 2022/11/30 21:15
 */
@Data
public class BizRiverLoadStationInfoVo {
    /**
     * 文件List
     */
    private List<String> fileList;
    /**
     * img列表
     */
    private List<String> imgList;
    /**
     * 图片前缀地址
     */
    private String stationImgPre;
    /**
     * 测站基本信息对象
     */
    private BizStStbprpBPo bizStStbprpBPo;
    /**
     * 防洪指标对象
     */
    private BizStRvFcchBPo bizStRvFcchBPo;
}
