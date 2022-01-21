package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 评价管理API
 */
public class EvaluationApi  extends BaseApi {
    /**
     * 评价
     * @return
     */
    public
        Object
    add(

            String authHeader
 ,
            com.netcorner.ssx.model.params.EvaluationParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/evaluation/add";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 评价管理删除
     * @param ID 评价管理ID
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/evaluation/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 列出评价
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.EvaluationSearchParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/evaluation/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 获取某人的被评价的TOP3的标签
     * @return
     */
    public
        Object
    toptags(

            String authHeader
 ,
            com.netcorner.ssx.model.params.EvaluationTagParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/evaluation/toptags";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 修改评价
     * @return
     */
    public
        Object
    edit(

            String authHeader
 ,
            com.netcorner.ssx.model.params.EvaluationEditParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/evaluation/edit";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 查看评价详细
     * @param ID 评价
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/evaluation/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
