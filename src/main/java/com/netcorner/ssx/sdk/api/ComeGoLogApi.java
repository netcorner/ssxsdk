package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 出入登记管理API
 */
public class ComeGoLogApi  extends BaseApi {
    /**
     * 出入登记管理列表分页
     * @return
     */
    public
        Object
    finder(


            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/comeGoLog/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 出入登记导出 excel
     * @return
     */
    public
        void
    export(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.ExportParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/comeGoLog/export";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);


    }

    /**
     * 出入登记管理查看
     * @param ID 出入登记管理ID
     * @return
     */
    public
        Object
    look(


            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/comeGoLog/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 出入登记
     * @param GetLat 纬度
     * @param GetLon 经度
     * @param EntID 企业
     * @return
     */
    public
        Object
    booking(

            String authHeader
 ,
            String arg0
,            String arg1
,            int arg2

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/comeGoLog/booking";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 出入登记
     * @return
     */
    public
        Object
    booking(


            com.netcorner.ssx.model.params.ComeGoLogBookingParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/comeGoLog/booking";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 获取上次在某个企业出入登记的信息
     * @param mobile 手机号码
     * @param entid 企业
     * @return
     */
    public
        Object
    getLastBooking(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/comeGoLog/getLastBooking";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 出入登记管理列表分页
     * @return
     */
    public
        Object
    authFinder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/comeGoLog/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 出入登记管理查看
     * @param ID 出入登记管理ID
     * @return
     */
    public
        Object
    authLook(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/comeGoLog/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
