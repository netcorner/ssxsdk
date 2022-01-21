package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 字典controller
 */
public class FieldApi  extends BaseApi {
    /**
     * 字段删除
     * @param ID 字段
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/field/del";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 得到key值数据配置字典
     * @return
     */
    public
        Object
    list(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/field/look";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 得到所有数据配置字典
     * @return
     */
    public
        Object
    list(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/field/list";
        StringMap data = new StringMap();


        StringMap header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 字段添加或修改保存
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.FieldParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/field/save";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 列出所有字段
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/field/finder";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 字段查看
     * @param ID 字段
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/field/look";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
