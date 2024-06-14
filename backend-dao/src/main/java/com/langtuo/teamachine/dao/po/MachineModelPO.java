package com.langtuo.teamachine.dao.po;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class MachineModelPO {
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
    private String machineCode;

    /**
     * 是否支持同时出料，0：不支持，1：支持
     */
    private Integer flowAllSupport;

    /**
     * 额外信息，格式：a:b;c:d
     */
    private Map<String, String> extraInfoMap;
}