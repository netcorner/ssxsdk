package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 洗车补胎API
 */
public class CarSupplyApi  extends BaseApi {
    /**
     * 洗车补胎删除
     * @param ID 洗车补胎ID
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/del";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 洗车补胎列表分页
     * @return
     */
    public
        Object
    list(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/list";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 洗车补胎添加或修改保存
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.CarsupplyParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/save";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 洗车补胎列表分页
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/finder";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
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

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/setStatus";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 预约服务
     * @param DemandID 需求ID
     * @param SupplyID 供应ID
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

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/subscribe";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 洗车补胎导出 excel
     * @return
     */
    public
        void
    export(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.ExportParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/export";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);


    }

    /**
     * 洗车补胎查看
     * @param ID 洗车补胎ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/look";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 支付报价获取联系人信息
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

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/getmobile";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 取消预约服务
     * @param DemandID 需求ID
     * @param SupplyID 供应ID
     * @return
     */
    public
        Object
    cancelSubscribe(

            String authHeader
 ,
            int arg0
,            int arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/subscribe/cancel";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
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

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/commend";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;
            header = new StringMap();
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

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/pay";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 洗车补胎批量保存
     * @return
     */
    public
        Object
    batchsave(

            String authHeader
 ,
            com.netcorner.ssx.model.params.BatchSupplyParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/carsupply/batchsave";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

}