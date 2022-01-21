package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * API地块操作接口
 */
public class ParceOfLandApi  extends BaseApi {
    /**
     * 地块删除
     * @param ID 地块
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLand/del";
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
    list(

            String authHeader
 ,
            com.netcorner.ssx.base.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLand/list";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 添加地块
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.ParcelOfLandParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLand/add";
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

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLand/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 地块编辑
     * @return
     */
    public
        Object
    edit(

            String authHeader
 ,
            com.netcorner.ssx.model.params.ParcelOfLandEditParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLand/edit";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 得到企业地块信息
     * @param ID 地块
     * @param EntID 企业
     * @return
     */
    public
        Object
    detail(


            int arg0
,            int arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/parcelOfLand/detail";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 地块查看
     * @param ID 地块
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLand/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 地块查看（开放未授权用户）
     * @param ID 地块
     * @return
     */
    public
        Object
    look1(


            int arg0
,            int arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/parcelOfLand/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 地块申报
     * @param ID 地块
     * @return
     */
    public
        Object
    declare(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLand/declare";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 地块邀请
     * @param ID 地块
     * @return
     */
    public
        Object
    invite(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/parcelOfLand/invite";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

}
