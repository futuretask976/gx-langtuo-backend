package com.langtuo.teamachine.dao.po;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class MachineModelPipelinePO {
    /**
     * 数据表id
     */
    private long id;

    /**
     * 数据表记录插入时间
     */
    private Date gmtCreated;

    /**
     * 数据表记录最近修改时间
     */
    private Date gmtModified;

    /**
     * 型号编码
     */
    private String modelCode;

    /**
     * 管道号
     */
    private Integer pipelineNum;

    /**
     * 是否支持加热，0：不支持，1：支持
     */
    private Integer enableWarm;

    /**
     * 是否支持冷藏，0：不支持，1：支持
     */
    private Integer enableFreeze;

    /**
     * 额外信息，格式：a:b;c:d
     */
    private Map<String, String> extraInfo;
}
