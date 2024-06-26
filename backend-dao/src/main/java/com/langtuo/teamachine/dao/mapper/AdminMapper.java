package com.langtuo.teamachine.dao.mapper;

import com.langtuo.teamachine.dao.annotation.GxTableShard;
import com.langtuo.teamachine.dao.annotation.MySQLScan;
import com.langtuo.teamachine.dao.po.AdminPO;
import com.langtuo.teamachine.dao.query.AdminQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@MySQLScan
@Repository
public interface AdminMapper {
    /**
     *
     * @param tenantCode
     * @param loginName
     * @return
     */
    AdminPO selectOne(@Param("tenantCode") String tenantCode, @Param("loginName") String loginName);

    /**
     *
     * @return
     */
    List<AdminPO> selectList(@Param("tenantCode") String tenantCode);

    /**
     *
     * @param query
     * @return
     */
    List<AdminPO> search(AdminQuery query);

    /**
     *
     * @param adminPO
     * @return
     */
    @GxTableShard(tableShardOpen = true, shardName = "table_new", columns = "version", defaultName = "table")
    int insert(AdminPO adminPO);

    /**
     *
     * @param adminPO
     * @return
     */
    int update(AdminPO adminPO);

    /**
     *
     * @param tenantCode
     * @param loginName
     * @return
     */
    int delete(@Param("tenantCode") String tenantCode, @Param("loginName") String loginName);
}
