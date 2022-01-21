package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 企业管理API
 */
public class EnterpriseHouseApi  extends BaseApi {
    /**
     * 修改房产中介企业信息
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.RegHouseOrgEditParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/house/enterprise/edit";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

}
