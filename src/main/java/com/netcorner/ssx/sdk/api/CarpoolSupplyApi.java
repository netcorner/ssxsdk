package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 顺风车产品API
 */
public class CarpoolSupplyApi  extends BaseApi {
    /**
     * 顺风车产品删除
     * @param ID 顺风车ID
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 顺风车列表分页
     * @return
     */
    public
        Object
    list(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/list";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 顺风车产品添加或修改保存
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.CarsupplyParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/save";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 顺风车产品列表分页
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 服务完成
     * @param ID 供应ID
     * @return
     */
    public
        Object
    complete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/complete";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 下线、上线
     * @param ID 供应ID
     * @return
     */
    public
        Object
    setStatus(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/setStatus";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 服务联系
     * @param DemandID 需求ID
     * @param SupplyID 供应ID
     * @param mode 模式
     * @return
     */
    public
        Object
    subscribe(

            String authHeader
 ,
            int arg0
,            int arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/subscribe";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 顺风车产品导出 excel
     * @return
     */
    public
        void
    export(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.ExportParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/export";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);


    }

    /**
     * 顺风车产品查看
     * @param ID 顺风车ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 顺风车产品支付报价获取联系人信息
     * @param Type 支付类型
     * @param GetUserID 支付项目
     * @return
     */
    public
        Object
    getmobile(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/getmobile";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 推荐给求购信息
     * @param DemandID 需求ID
     * @param SupplyID 供应ID
     * @return
     */
    public
        Object
    commend(

            String authHeader
 ,
            int arg0
,            int arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/commend";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 支付报价获取联系人信息
     * @param SupplyID 供应
     * @param TargetID 支付项目
     * @param Money 支付金额
     * @return
     */
    public
        Object
    pay(

            String authHeader
 ,
            String arg0
,            String arg1
,            int arg2

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/pay";
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
     * 顺风车批量保存
     * @return
     */
    public
        Object
    batchsave(

            String authHeader
 ,
            com.netcorner.ssx.model.params.BatchSupplyParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carpoolsupply/batchsave";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

}
