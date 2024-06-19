package com.langtuo.teamachine.dao.po;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class InvalidActRecordPO {
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
     * 清洁规则编码
     */
    private String machineCode;

    /**
     * 清洁排除物料编码
     */
    private String shopCode;

    /**
     * 失效时间，这里用String的原因是为了做索引幂等
     */
    private String invalidTime;

    /**
     * 物料名称
     */
    private String toppingCode;

    /**
     * 管道序号
     */
    private Integer pipelineNum;

    /**
     * 失效数量
     */
    private Integer invalidAmount;

    /**
     * 租户编码
     */
    private String tenantCode;

    /**
     * 额外信息
     */
    private Map<String,String> extraInfo;
}
