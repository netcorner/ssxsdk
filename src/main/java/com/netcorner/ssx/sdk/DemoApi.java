package com.netcorner.ssx.sdk;

import com.netcorner.ssx.model.params.base.PaginationParam;
import com.netcorner.ssx.sdk.api.AppApi;
import com.netcorner.ssx.sdk.api.AppMarketApi;

/**
 * Created by shijiufeng on 2022/1/15.
 * 用户相关操作API
 */
public class DemoApi {


    public static void main(String[] args) {

        String appid="";
        String appsecret="";


        AppApi appMarketApi=new AppApi();
        PaginationParam paginationParam=new PaginationParam();
        System.out.println("appp:"+appMarketApi.finder());


        //需要获取用户授权头时调用方法
        Auth.getAuthHeader(appid,appsecret, new Auth.Callback() {
            @Override
            public void invoke(String header) {
                AppMarketApi appMarketApi=new AppMarketApi();
                PaginationParam paginationParam=new PaginationParam();
                System.out.println(appMarketApi.finder(header,paginationParam));
            }
        });
    }
}
