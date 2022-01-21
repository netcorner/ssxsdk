package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 类目管理API
 */
public class CatApi  extends BaseApi {
    /**
     * 类目管理删除
     * @param ID 类目管理ID
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/cat/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 类目管理列表分页
     * @return
     */
    public
        Object
    list(


            com.netcorner.ssx.model.params.CatSearcParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/cat/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 类目管理添加或修改保存
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.CatParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/cat/save";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 类目管理列表分页
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.CatPagiationParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/cat/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 类目管理查看
     * @param ID 类目管理ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/cat/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
