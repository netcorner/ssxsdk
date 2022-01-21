package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * API上报操作接口
 */
public class RepairApi  extends BaseApi {
    /**
     * 上报
     * @return
     */
    public
        Object
    add(

            String authHeader
 ,
            com.netcorner.ssx.model.params.RepairParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/add";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 上报删除
     * @param ID 上报
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 受理
     * @param ID 上报ID
     * @param Description 受理备注
     * @param PubLat 纬度
     * @param PubLon 经度
     * @return
     */
    public
        Object
    accept(

            String authHeader
 ,
            com.netcorner.ssx.model.params.RepairAcceptParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/accept";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 上报列表
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.base.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 退回
     * @param ID 上报ID
     * @return
     */
    public
        Object
    back(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/back";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 修改上报
     * @return
     */
    public
        Object
    edit(

            String authHeader
 ,
            com.netcorner.ssx.model.params.RepairEditParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/edit";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 统计工作量
     * @return
     */
    public
        Object
    stat(

            String authHeader
 ,
            com.netcorner.ssx.base.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/stat";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 流转(企业
     * @param ID 上报ID
     * @param ReplyDescription 上报回复信息
     * @param PubLat 纬度
     * @param PubLon 经度
     * @return
     */
    public
        Object
    reply(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/reply";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 导出 excel
     * @return
     */
    public
        void
    export(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.ExportParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/export";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);


    }

    /**
     * 上报查看
     * @param ID 上报ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 独立上报事件
     * @return
     */
    public
        Object
    addAlong(

            String authHeader
 ,
            com.netcorner.ssx.model.params.RepairParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/addAlong";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 流转（个人）
     * @param ID 上报ID
     * @param AcceptUserID 流转用户
     * @param AcceptRealName 流转用户名称
     * @param AppointDescription 派遣备注信息
     * @param PubLat 纬度
     * @param PubLon 经度
     * @return
     */
    public
        Object
    appoint(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/appoint";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 流转(企业
     * @param ID 上报ID
     * @param AcceptEntID 流转企业
     * @param AcceptEntName 流转企业名称
     * @param AppointDescription 派遣备注信息
     * @param PubLat 纬度
     * @param PubLon 经度
     * @return
     */
    public
        Object
    appointent(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/appointent";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 导出统计工作量
     * @return
     */
    public
        void
    exportStat(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.ExportParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/exportStat";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);


    }

    /**
     * 受理后修改上报状态
     * @return
     */
    public
        Object
    editStatus(

            String authHeader
 ,
            com.netcorner.ssx.model.params.RepairStatusParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/repair/editStatus";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

}
