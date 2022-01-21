package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


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
        StringMap data = new StringMap();


        StringMap header=null;

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
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
