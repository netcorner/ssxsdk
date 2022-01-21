package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


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
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
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
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;

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
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
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
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
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
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
