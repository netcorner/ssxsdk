package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 标签管理API
 */
public class TagApi  extends BaseApi {
    /**
     * 标签管理删除
     * @param ID 标签管理ID
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/tag/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 标签管理添加或修改保存
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.TagParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/tag/save";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 标签管理列表分页
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/tag/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * $method.description
     * @return
     */
    public
        Object
    finder(


            com.netcorner.ssx.model.params.TagTypeSearchParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/tag/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 标签管理查看
     * @param ID 标签管理ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/tag/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
