package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 充值记录
 */
public class UserCreditScoreLogApi  extends BaseApi {
    /**
     * 信用分列表
     * @return
     */
    public
        Object
    finder(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/userCreditScoreLog/finder";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 充值详细
     * @return
     */
    public
        Object
    look(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/userCreditScoreLog/look";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * $method.description
     * @return
     */
    public
        Object
    getUserCredit(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/userCreditScoreLog/getUserCredit";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
