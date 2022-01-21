package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 模块controller
 */
public class ModuleApi  extends BaseApi {
    /**
     * 模块删除
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/module/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 模块添加或修改保存
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.ModuleParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/module/save";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 列出所有模块
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/module/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 模块查看
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/module/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 得到顶层模块列表
     * @return
     */
    public
        Object
    getTopModules(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/module/getTopModules";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 模块打包
     * @return
     */
    public
        Object
    exportmodule(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/module/exportmodule";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 代码生成
     * @return
     */
    public
        Object
    gencode(

            String authHeader
 ,
            com.netcorner.ssx.model.params.GenCodeParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/module/gencode";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

}
