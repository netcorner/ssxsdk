package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * API微信操作接口
 */
public class WechatApi  extends BaseApi {
    /**
     * 微信小程序解密微信数据
     * @param encrypdata 初加密的数据
     * @param ivdata ivdata
     * @param sessionkey sessionkey
     * @return
     */
    public
        Object
    deciphering(


            String arg0
,            String arg1
,            String arg2

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/deciphering";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);

        StringMap header=null;

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 创建微信公众号的底部菜单，内容为mpmenu.json 配置？？？
     * @return
     */
    public
        Object
    createmenu(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/createmenu";
        StringMap data = new StringMap();


        StringMap header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 验证公众号订阅事件，公众号中配置（用户关注公众号时会调用该事件）
     * @param signature 签名
     * @param nonce 随机字符
     * @param echostr 反馈字符
     * @param timestamp 时间戳
     * @return
     */
    public
        Object
    checkWechat(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/msg/subscribe";
        StringMap data = new StringMap();


        StringMap header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 用户关注公众号时，发送消息给用户
     * @return
     */
    public
        Object
    subscribeWechatEvent(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/msg/subscribe";
        StringMap data = new StringMap();


        StringMap header=null;

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 微信用户将jscode保存会话session中，并返回执行结果
     * @param jscode 微信获取的jscode
     * @param appid 微信小程序或公众账号的
     * @return
     */
    public
        Object
    jscode2session(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/jscode2session";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 得到微信验证票
     * @param appid 微信appid
     * @param noncestr 客户端加密码
     * @param timestamp1 验证戳
     * @param purl 要取得微信权限的
     * @return
     */
    public
        Object
    getWechatTicket(


            String arg0
,            String arg1
,            String arg2
,            String arg3

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/getticket";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);
        data.put("arg3", arg3);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 通过微信号+微信授权的手机号码登录
     * @param wxid 微信开放
     * @param mobile 手机号码
     * @param unionid 微信开放统一码
     * @param appid 小程序或公众号的appid
     * @param sessionkey 微信登录的会话key
     * @return
     */
    public
        Object
    wxLoginAction(


            String arg0
,            String arg1
,            String arg2
,            String arg3
,            String arg4

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/loginaction";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);
        data.put("arg3", arg3);
        data.put("arg4", arg4);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 微信授权认证, 得到微信 openid （测试使用）
     * @param code 微信授权的
     * @param state 登录状态
     * @return
     */
    public
        Object
    getopenid(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/getopenid";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 微信授权认证,微信反调接口
     * @param code 微信授权的
     * @param state 登录状态
     * @return
     */
    public
        Object
    wechatauth(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/loginauth";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 微信授权认证,微信反调接口
     * @param code 微信授权的
     * @param state 登录状态
     * @return
     */
    public
        Object
    saveauth(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/saveauth";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 未微信授权的用户，进行微信授权认证
     * @param code 微信授权的
     * @param state 登录状态
     * @return
     */
    public
        Object
    accreditation(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/wechat/accreditation";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 获取微信公众号的所有文章
     * @param page 第几页
     * @param size 每页条数
     * @return
     */
    public
        Object
    acticleList(


            int arg0
,            Integer arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/wechat/acticle/list";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 微信视频通话
     * @param roomid 视频房房间号
     * @param mpstate 小程序版本
     * @return
     */
    public
        Object
    videocall(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/videocall";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("POST",requestUrl,header,data);
    }

}
