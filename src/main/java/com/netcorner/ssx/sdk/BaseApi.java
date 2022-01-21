package com.netcorner.ssx.sdk;

import com.alibaba.fastjson.JSON;
import com.netcorner.ssx.utils.OkHttpUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;import java.util.HashMap;

/**
 * Created by shijiufeng on 2022/1/17.
 */
public class BaseApi{
    private Object directUrl(boolean isArray,String method, String requestUrl, Map header, Map data){
        if(header==null) header=new HashMap();
        header.put("User-Agent", ApiDefine.USER_AGENT);

        OkHttpUtils okHttpUtils=OkHttpUtils.builder().url(requestUrl);
        okHttpUtils.setHeaderMap(header);
        okHttpUtils.setParamMap(data);

        String jsonString;
        if(method.equals("GET")) {
            jsonString=okHttpUtils.get().sync();
        }else {
            jsonString=okHttpUtils.post(false).sync();
        }
        if(isArray){
            return JSON.parseArray(jsonString, List.class);
        } else{
            return JSON.parseObject(jsonString, Map.class);
        }
    }
    protected List<Map<String,Object>> getArray(String method, String requestUrl, Map header, Map data){
        return (List)directUrl(true,method,requestUrl,header,data);
    }
    protected Map<String,Object> getObject(String method, String requestUrl, Map header, Map data){
        return (Map) directUrl(false,method,requestUrl,header,data);
    }
}
