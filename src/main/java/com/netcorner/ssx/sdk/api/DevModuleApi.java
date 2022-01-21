package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 应用模块api
 */
public class DevModuleApi  extends BaseApi {
    /**
     * 应用模块删除
     * @param ID 应用模块ID
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 应用模块添加或修改保存
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.DevModuleParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/save";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 应用模块列表分页
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 驳回应用模块
     * @param ID 应用模块ID
     * @param Description 驳回理由
     * @return
     */
    public
        Object
    back(

            String authHeader
 ,
            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/back";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 上架应用模块
     * @param ID 应用模块ID
     * @param Description 上架说明
     * @return
     */
    public
        Object
    checked(

            String authHeader
 ,
            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/checked";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 应用模块导出 excel
     * @return
     */
    public
        void
    export(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.ExportParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/export";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);


    }

    /**
     * 应用模块查看
     * @param ID 应用模块ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 申请上架应用模块
     * @param ID 应用模块ID
     * @return
     */
    public
        Object
    grounding(

            String authHeader
 ,
            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/grounding";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 重启nginx
     * @return
     */
    public
        Object
    nginxRestart(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/devModule/nginxRestart";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

}
