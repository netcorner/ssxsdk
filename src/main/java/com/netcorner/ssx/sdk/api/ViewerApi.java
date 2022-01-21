package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


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
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
