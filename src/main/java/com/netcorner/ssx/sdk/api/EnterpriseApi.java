package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import com.qiniu.util.StringMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 企业管理API
 */
public class EnterpriseApi  extends BaseApi {
    /**
     * 企业搬离
     * @param ID 企业应用授权ID
     * @return
     */
    public
        Object
    remove(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/remove";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 企业管理删除
     * @param ID 企业ID
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/del";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 企业添加
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.EnterpriseAddParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/save";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 企业管理列表分页
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/finder";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 选择企业管理列表分页
     * @return
     */
    public
        Object
    choose(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/choose";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 企业修改保存
     * @return
     */
    public
        Object
    edit(

            String authHeader
 ,
            com.netcorner.ssx.model.params.EnterpriseParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/edit";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 得到企业出入证
     * @return
     */
    public
        Object
    getGates(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/getpassort";
        StringMap data = new StringMap();


        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 得到用户的企业信息
     * @return
     */
    public
        Object
    getselfinfo(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/getselfinfo";
        StringMap data = new StringMap();


        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 通过手机获取该用户的所有企业
     * @return
     */
    public
        Object
    getEntInfoByMobile(


            String arg0
,            int arg1

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/enterprise/getEntInfoByMobile";
        StringMap data = new StringMap();

        data.put("arg0", arg0);
        data.put("arg1", arg1);

        StringMap header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 导入企业
     * @return
     */
    public
        Object
    importExcel(

            String authHeader
 ,
            com.netcorner.ssx.model.params.EnterpriseImportParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/importExcel";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 企业撤回搬离
     * @param ID 企业应用授权ID
     * @return
     */
    public
        Object
    cancelRemove(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/cancelRemove";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 企业管理查看
     * @param ID 企业ID
     * @return
     */
    public
        Object
    lookByUser(


            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/enterprise/look";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 企业统计
     * @return
     */
    public
        Object
    stat(

            String authHeader


        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/stat";
        StringMap data = new StringMap();


        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 企业管理查看
     * @param ID 企业ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/enterprise/look";
        StringMap data = new StringMap();

        data.put("arg0", arg0);

        StringMap header=null;
            header = new StringMap();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
