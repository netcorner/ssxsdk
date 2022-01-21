package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;

import java.util.HashMap;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * API应用操作接口
 */
public class AppApi  extends BaseApi {
    /**
     * 获取应用列表
     * @return
     */
    public
        Object
    finder(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/app/select";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 获取某个用户是否拥有应用使用的权限
     * @return
     */
    public
        Object
    hasUserAppRole(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/app/hasUserAppRole";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
