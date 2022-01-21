package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 
 */
public class SmsApi  extends BaseApi {
    /**
     * 发送验证码
     * @param tel 手机号码
     * @return
     */
    public
        Object
    sendSmsCode(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/sms/sendcode";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 检测验证码是否准确
     * @param tel 手机号码
     * @param sms 手机验证码
     * @param vcode 图片验证码
     * @return
     */
    public
        Object
    validsms(


            String arg0
,            String arg1
,            String arg2

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/sms/validsms";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 通过手机短信登录
     * @param tel 手机号码
     * @param sms 手机验证码
     * @param vcode 图片验证码
     * @param type 类型
     * @return
     */
    public
        Object
    loginbysmsaction(


            String arg0
,            String arg1
,            String arg2
,            int arg3

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/sms/loginaction";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);
        data.put("arg3", arg3);

        StringMap header=null;

            return getObject("POST",requestUrl,header,data);
    }

}
