package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 开发者操作API接口
 */
public class DevelopApi  extends BaseApi {
    /**
     * 获取开发者参数信息
     * @return
     */
    public
        Object
    save(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/develop/save";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 获取开发者参数信息
     * @return
     */
    public
        Object
    look(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/develop/look";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
