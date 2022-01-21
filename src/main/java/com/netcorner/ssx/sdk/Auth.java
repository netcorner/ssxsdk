package com.netcorner.ssx.sdk;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.utils.StringTools;
import com.qiniu.http.Client;
import org.apache.log4j.Logger;

/**
 * Created by shijiufeng on 2022/1/15.
 */
public class Auth {
    private static Long currentTime,serviceTime;
    private static Logger logger = Logger.getLogger(ApiDefine.class);

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
        Client client = new Client();
        try {
            com.qiniu.http.Response resp = client.get(requestUrl, null);
            if (resp.statusCode == 200) {
                currentTime=System.currentTimeMillis();
                serviceTime=Long.parseLong(resp.bodyString());
                String header=getHeader(appid,appsecret);
                authCallback.invoke(header);
                return;
            }else{
                logger.error("==========》当前调用状态为："+resp.statusCode);
            }
        } catch (Exception e) {
            logger.error("错误==========》"+e.toString());
        }
        try {
            throw new Exception("执行错误！");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
