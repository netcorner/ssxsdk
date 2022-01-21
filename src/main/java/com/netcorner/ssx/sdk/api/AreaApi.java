package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * API区域操作接口
 */
public class AreaApi  extends BaseApi {
    /**
     * 获取区域列表
     * @return
     */
    public
        Object
    finder(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/area/select";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

}
