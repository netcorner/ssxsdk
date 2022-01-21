package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * API工具操作接口
 */
public class UtilsApi  extends BaseApi {
    /**
     * 得到服务器时间
     * @return
     */
    public
        Object
    getTimestamp(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getTimestamp";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 获取经纬度所在城市、国家
     * @param ll 经纬度
     * @return
     */
    public
        Object
    getArea(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getArea";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 获取车牌信息
     * @param imgurl 车牌图片url
     * @return
     */
    public
        Object
    getCarNO(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getCarNO";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 获取图片是否有人脸
     * @param imgurl 人像图片url
     * @return
     */
    public
        Object
    getImageFace(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getImageFace";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 生成验证码
     * @return
     */
    public
        void
    getvcode(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getvcode";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;


    }

    /**
     * 验证码验证
     * @param vcode 输入的验证码字符
     * @return
     */
    public
        Object
    vrifyVcode(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/vrifyVcode";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 得到服务器时间,此步是为了兼容已上架应用，之后会删除，另
     * @return
     */
    public
        Object
    getTimestamp1(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/getTimestamp";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 获取身份证信息
     * @param imgurl imgurl
     * @return
     */
    public
        Object
    deciphering(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getIdCardInfo";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 把base64字符转成图片
     * @param base64 base64字符串
     * @param key 保存文件名
     * @return
     */
    public
        Object
    base64toimg(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/base64toimg";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 加密网址
     * @param url 待加密网址url
     * @return
     */
    public
        Object
    getshorturl(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getshorturl";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 解密短网址并跳转至真实的网址
     * @param key 加密的key
     * @param type 值为string返回网址字符串
     * @return
     */
    public
        Object
    directshorturl(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/s/{key}";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 通过短网址的Key，得到实际的网址
     * @param key 加密的key
     * @return
     */
    public
        Object
    geturl(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/ss/{key}";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 上传照片
     * @return
     */
    public
        Object
    uploadphoto(


            org.springframework.web.multipart.MultipartHttpServletRequest arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/uploadphoto";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 上传照片
     * @return
     */
    public
        Object
    editUploadPhoto(


            org.springframework.web.multipart.MultipartHttpServletRequest arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/editor/uploadphoto";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 上传视频
     * @return
     */
    public
        Object
    editUploadVideo(


            org.springframework.web.multipart.MultipartHttpServletRequest arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/editor/uploadvideo";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 获取七牛 token,需获获取用户授权信息
     * @return
     */
    public
        Object
    getQiniutoken(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/util/getqiniutoken";
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
    getAllUrl(



        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/getAllUrl";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

}
