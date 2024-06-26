package com.langtuo.teamachine.api.service;

import com.langtuo.teamachine.api.model.AdminRoleDTO;
import com.langtuo.teamachine.api.model.PageDTO;
import com.langtuo.teamachine.api.request.AdminRolePutRequest;
import com.langtuo.teamachine.api.result.LangTuoResult;

public interface AdminRoleMgtService {
    /**
     *
     * @param tenantCode
     * @return
     */
    LangTuoResult<AdminRoleDTO> get(String tenantCode, String roleCode);

    /**
     *
     * @return
     */
    LangTuoResult<PageDTO<AdminRoleDTO>> search(String tenantCode, String roleName, int pageNum, int pageSize);

    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    LangTuoResult<PageDTO<AdminRoleDTO>> list(int pageNum, int pageSize);

    /**
     *
     * @param adminRolePutRequest
     * @return
     */
    LangTuoResult<Void> put(AdminRolePutRequest adminRolePutRequest);

    /**
     *
     * @param tenantCode
     * @return
     */
    LangTuoResult<Void> delete(String tenantCode, String roleCode);
}
