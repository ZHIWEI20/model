package com.shunwang.api.monitorWarning.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 站点文件Po
 * @author: GSL
 * @createDate: 2022/12/9 20:58
 */
@ApiModel("站点文件表")
@TableName("BIZ_CONFERENCE_FILE")
@Data
public class BizConferenceFilePo implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文件ID")
    @TableId("ID")
    private Long id;

    @ApiModelProperty("文件名称")
    @TableField("FILE_NAME")
    private String fileName;

    @ApiModelProperty("访问路径")
    @TableField("URL")
    private String url;

    @ApiModelProperty("文件类型")
    @TableField("FILE_TYPE")
    private String fileType;

    @ApiModelProperty("上传时间")
    @TableField("CREATE_TIME")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty("上传人")
    @TableField("UPLOAD_USER")
    private String uploadUser;

    @ApiModelProperty("上传人Id")
    @TableField("UPLOAD_ID")
    private Long uploadId;
}
