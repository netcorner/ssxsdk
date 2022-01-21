package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * API地块操作接口
 */
public class ParceOfLandInviterApi  extends BaseApi {
    /**
     * 地块删除
     * @param ID 地块邀请
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLandInviter/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 地块列表
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.base.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLandInviter/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
