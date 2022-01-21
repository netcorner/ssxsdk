package com.netcorner.ssx.sdk;

import com.qiniu.http.Client;
import com.qiniu.util.StringMap;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

/**
 * Created by shijiufeng on 2022/1/17.
 */
public class BaseApi{
    private static Logger logger = Logger.getLogger(BaseApi.class);
    private Object directUrl(boolean isArray,String method, String requestUrl, StringMap header, StringMap data){
        if(header==null) header=new StringMap();
        header.put("User-Agent", ApiDefine.USER_AGENT);
        Client client = new Client();
        try {
            com.qiniu.http.Response resp = client.get(requestUrl, header);

            if(method.equals("GET")) {
                resp = client.get(requestUrl, header);
            }else {
                resp = client.post(requestUrl,data, header);
            }
            if (resp.statusCode == 200) {
                if(isArray){
                    return JSONArray.fromObject(resp.bodyString());
                } else{
                    return JSONObject.fromObject(resp.bodyString());
                }
            }else{
                logger.error("==========》当前调用状态："+resp.statusCode);
            }
        } catch (Exception e) {
            logger.error("==========》http 请求出错："+e.toString());
        }
        return null;
    }
    protected JSONArray getArray(String method, String requestUrl, StringMap header, StringMap data){
        return (JSONArray)directUrl(true,method,requestUrl,header,data);
    }
    protected JSONObject getObject(String method, String requestUrl, StringMap header, StringMap data){
        return (JSONObject) directUrl(false,method,requestUrl,header,data);
    }
}
