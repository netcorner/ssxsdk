package com.netcorner.ssx.sdk;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.utils.OkHttpUtils;
import com.netcorner.ssx.utils.StringTools;

/**
 * Created by shijiufeng on 2022/1/15.
 */
public class Auth {
    private static Long currentTime,serviceTime;

    public static void validSourceURL(String sign,String timestamp,String userid){

    }



    /**
     * 获取授权信息
     * @param appid
     * @param appsecret
     * @param authCallback
     */
    public static void getAuthHeader(Object appid,String appsecret,Callback authCallback){
        appid=StringTools.decrypt(appid+"","netcorner");
        appsecret=StringTools.decrypt(appsecret,"netcorner");
        if(currentTime!=null){
            long t=System.currentTimeMillis()-serviceTime;
            if(t<90000){
                String header=getHeader(appid,appsecret);
                authCallback.invoke(header);
            }
        }

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getTimestamp";

        OkHttpUtils okHttpUtils=OkHttpUtils.builder().url(requestUrl);
        okHttpUtils.addHeader("User-Agent", ApiDefine.USER_AGENT);
        String jsonString=okHttpUtils.get().sync();
        currentTime=System.currentTimeMillis();
        serviceTime=Long.parseLong(jsonString);
        String header=getHeader(appid,appsecret);
        authCallback.invoke(header);
    }

    /**
     * 获取授权信息头后的调用接口
     */
    public interface Callback{
        void invoke(String header);
    }

    private static String getHeader(Object appid,String appsecret){
        String sign = StringTools.getMD5("userid=" + appid + "&timestamp=" + serviceTime + "&token=" + appsecret);
        sign = sign.toUpperCase();
        String header=appid+"|"+serviceTime+"|"+sign;
        return header;
    }
}
