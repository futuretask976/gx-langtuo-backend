package com.langtuo.teamachine.web.controller;

import com.langtuo.teamachine.api.model.PageDTO;
import com.langtuo.teamachine.api.model.ShopDTO;
import com.langtuo.teamachine.api.request.ShopPutRequest;
import com.langtuo.teamachine.api.result.LangTuoResult;
import com.langtuo.teamachine.api.service.ShopMgtService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Resource
    private ShopMgtService shopMgtService;

    /**
     * url: http://localhost:8080/teamachine/shop/tenant_001/shop_001/get
     * @return
     */
    @GetMapping(value = "/{tenantcode}/{shopcode}/get")
    public LangTuoResult<ShopDTO> get(@PathVariable(name = "tenantcode") String tenantCode,
            @PathVariable(name = "shopcode") String shopCode) {
        LangTuoResult<ShopDTO> rtn = shopMgtService.get(tenantCode, shopCode);
        return rtn;
    }

    /**
     * url: http://localhost:8080/teamachine/shop/list?tenantCode=tenant_001
     * @return
     */
    @GetMapping(value = "/list")
    public LangTuoResult<List<ShopDTO>> list(@RequestParam("tenantCode") String tenantCode) {
        LangTuoResult<List<ShopDTO>> rtn = shopMgtService.list(tenantCode);
        return rtn;
    }

    /**
     * url: http://localhost:8080/teamachine/shop/search?tenantCode=tenant_001&shopName=&pageNum=1&pageSize=10
     * @return
     */
    @GetMapping(value = "/search")
    public LangTuoResult<PageDTO<ShopDTO>> search(@RequestParam("tenantCode") String tenantCode,
            @RequestParam("shopName") String shopName, @RequestParam("shopGroupName") String shopGroupName,
            @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        LangTuoResult<PageDTO<ShopDTO>> rtn = shopMgtService.search(tenantCode, shopName, shopGroupName, pageNum, pageSize);
        return rtn;
    }

    /**
     * url: http://localhost:8080/teamachine/shop/put
     * @return
     */
    @PutMapping(value = "/put")
    public LangTuoResult<Void> put(@RequestBody ShopPutRequest shopPutRequest) {
        LangTuoResult<Void> rtn = shopMgtService.put(shopPutRequest);
        return rtn;
    }

    /**
     * url: http://localhost:8080/teamachine/admin/role/delete
     * @return
     */
    @DeleteMapping(value = "/{tenantcode}/{shopcode}/delete")
    public LangTuoResult<Void> delete(@PathVariable(name = "tenantcode") String tenantCode,
            @PathVariable(name = "shopcode") String shopCode) {
        LangTuoResult<Void> rtn = shopMgtService.delete(tenantCode, shopCode);
        return rtn;
    }
}
