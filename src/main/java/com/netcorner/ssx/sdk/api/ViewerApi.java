package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 信息阅读人员controller
 */
public class ViewerApi  extends BaseApi {
    /**
     * 信息阅读人员列表分页
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.base.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/viewer/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
