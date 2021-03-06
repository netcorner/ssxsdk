package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 支付接口
 */
public class PayApi  extends BaseApi {
    /**
     * 微信充值获取请求参数
     * @param title 充值标题
     * @param openid 充值的微信
     * @param totalFee 充值金额
     * @return
     */
    public
        Object
    wxpay(

            String authHeader
 ,
            String arg0
,            String arg1
,            float arg2

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/wxpay";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 微信支付后的回调通知接口
     * @return
     */
    public
        void
    notity(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wxpay/notity";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;


    }

    /**
     * $method.description
     * @return
     */
    public
        Object
    alipay(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/alipay";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * $method.description
     * @return
     */
    public
        void
    alipayNotify(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/alipay/notify";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);


    }

    /**
     * $method.description
     * @return
     */
    public
        void
    transferPay(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/pay";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;


    }

}
