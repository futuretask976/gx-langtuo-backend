package com.langtuo.teamachine.dao.po;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class CleanExceptRulePO {
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
    private String cleanRuleCode;

    /**
     * 清洁排除物料编码
     */
    private String exceptToppingCode;

    /**
     * 租户编码
     */
    private String tenantCode;
}
