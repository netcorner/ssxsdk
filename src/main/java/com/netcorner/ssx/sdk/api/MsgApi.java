package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 私信controller
 */
public class MsgApi  extends BaseApi {
    /**
     * 获取联系人的聊天记录
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.MsgSearchParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 发送消息
     * @return
     */
    public
        Object
    send(

            String authHeader
 ,
            com.netcorner.ssx.model.params.MsgSendParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/send";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 建立socket会话
     * @return
     */
    public
        Object
    createSession(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/createsession";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 发送群消息
     * @return
     */
    public
        Object
    sendgroup(

            String authHeader
 ,
            com.netcorner.ssx.model.params.MsgSendParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/sendgroup";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 收件列表
     * @param msg 是否需要消息个人统计
     * @return
     */
    public
        Object
    lastmsg(

            String authHeader
 ,
            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/lastmsg";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 消息读取设置
     * @return
     */
    public
        Object
    setread(

            String authHeader
 ,
            com.netcorner.ssx.model.params.MsgSetReadParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/setread";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 我的通讯录
     * @return
     */
    public
        Object
    getContacts(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/getContacts";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 用户消息分页列表
     * @return
     */
    public
        Object
    searchpage(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/searchpage";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 得到好友联系人
     * @param chatID 发消息人
     * @return
     */
    public
        Object
    getContact(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/getContact";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
