package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * API用户操作接口
 */
public class UserApi  extends BaseApi {
    /**
     * 用户琐定
     * @param userid 操作用户ID
     * @param ID 需要琐定或解琐的用户ID
     * @return
     */
    public
        Object
    lock(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/lock";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 用户删除
     * @param ID 被删除的用户
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 用户添加
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.UserParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/save";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 用户重置密码
     * @param ID 需要重置的用户ID
     * @return
     */
    public
        Object
    reset(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/reset";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 用户管理列表
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 用户查看
     * @param userid 用户ID
     * @param ID 当前查看的用户ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0
,            int arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 检测用户是否合法
     * @param userid 用户
     * @param timestamp 时间戳
     * @param sign 签名
     * @return
     */
    public
        Object
    validateToken(


            String arg0
,            String arg1
,            String arg2

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/validateUser";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 用户手机修改
     * @param oldPhone 旧手机号码
     * @param newPhone 新手机号码
     * @return
     */
    public
        Object
    setMobile(

            String authHeader
 ,
            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/setmobile";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 得到用户所有角色
     * @return
     */
    public
        Object
    getUserRoles(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/getuserroles";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 通过用户名和口令登录
     * @param userName 用户名
     * @param pwd 密码
     * @param type 类型
     * @return
     */
    public
        Object
    loginAction(


            String arg0
,            String arg1
,            int arg2

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/loginaction";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);

        Map<String,Object> header=null;

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 通过token登录跳转指定页面
     * @param directUrl 需要跳转的
     * @return
     */
    public
        Object
    loginbytokenaction(

            String authHeader
 ,
            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/directlogin";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 用户更多信息
     * @return
     */
    public
        Object
    getMoreInfo(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/getmoreinfo";
        Map<String,Object> data = new HashMap<>();


        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 判断登录用户是不是在指定的企业中
     * @return
     */
    public
        Object
    isEntUser(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/isEntUser";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 用户注销
     * @return
     */
    public
        Object
    logout(

            String authHeader
 ,
            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/logout";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 获取用户授权 header
     * @param userid 用户
     * @param password 密码
     * @return
     */
    public
        Object
    getUserAuthHeader(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/getUserAuthHeader";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 得到模块的行为
     * @param moduleid 模块ID
     * @return
     */
    public
        Object
    getmoduleactions(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/getmoduleactions";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 切换职位角色
     * @param ID 角色ID
     * @return
     */
    public
        Object
    convertrole(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/convertrole";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 用户密码修改
     * @param PasswordOld 原密码
     * @param Password 新密码
     * @param PasswordA 确认新密码
     * @return
     */
    public
        Object
    setpasswordaction(

            String authHeader
 ,
            String arg0
,            String arg1
,            String arg2

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/setpasswordaction";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 唯一名称是否不存在
     * @param Name 名称
     * @param ID 当前操作的用户
     * @param Type 类型
     * @return
     */
    public
        Object
    notexisit(


            String arg0
,            String arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/notexisit";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        Map<String,Object> header=null;

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 用户离职
     * @param userid 用户ID
     * @param ID 被删除的用户
     * @return
     */
    public
        Object
    dimission(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/dimission";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST, GET",requestUrl,header,data);
    }

    /**
     * 通过微信注册小区住户
     * @return
     */
    public
        Object
    regEstateUser(


            com.netcorner.ssx.model.params.RegEstateUserParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/regEstateUser";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 通过微信注册服务商
     * @return
     */
    public
        Object
    regEstateServiceUser(


            com.netcorner.ssx.model.params.RegEstateUserParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/regEstateServiceUser";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 通过微信注册人员租房客
     * @return
     */
    public
        Object
    regHouseDemand(


            com.netcorner.ssx.model.params.RegHouseDemandParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/regHouseDemand";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 通过微信注册房产中介
     * @return
     */
    public
        Object
    regHouseSupply(


            com.netcorner.ssx.model.params.RegHouseOrgParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/regHouseSupply";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 通过微信注册企业
     * @return
     */
    public
        Object
    wechatRegEnt(


            com.netcorner.ssx.model.params.RegOrgParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/regEnt";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * 通过微信注册企业
     * @return
     */
    public
        Object
    regStaff(


            com.netcorner.ssx.model.params.RegStaffParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/regStaff";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("$method.method",requestUrl,header,data);
    }

    /**
     * $method.description
     * @return
     */
    public
        Object
    userRoleSetting(

            String authHeader
 ,
            com.netcorner.ssx.model.params.UserRoleSettingParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/userRoleSetting";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * $method.description
     * @return
     */
    public
        Object
    getUserRoleSetting(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/user/getUserRoleSetting";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 检测用户key会话是否存在
     * @return
     */
    public
        Object
    checksession(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/checksession";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 检测存入用户会话
     * @return
     */
    public
        Object
    sessionin(


            String arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/sessionin";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 微信扫码登录
     * @return
     */
    public
        Object
    wechatLogin(


            String arg0
,            String arg1
,            String arg2
,            String arg3

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/user/wechatLogin";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);
        data.put("arg1", arg1);
        data.put("arg2", arg2);
        data.put("arg3", arg3);

        Map<String,Object> header=null;

            return getObject("GET",requestUrl,header,data);
    }

}
