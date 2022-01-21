package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 私信群controller
 */
public class MsgRoomApi  extends BaseApi {
    /**
     * 得到我的所有群
     * @return
     */
    public
        Object
    getGroups(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/room/mine";
        StringMap data = new StringMap();


        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 消息的读取状态
     * @return
     */
    public
        Object
    msgreadstatus(

            String authHeader
 ,
            com.netcorner.ssx.model.params.MsgSearchParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/room/msgreadstatus";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 查看我的群聊组
     * @return
     */
    public
        Object
    lookGroup(

            String authHeader
 ,
            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/room/detail";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 得到群所有用户
     * @return
     */
    public
        Object
    userfinder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.MsgRoomUserSearchParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/msg/room/userfinder";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
