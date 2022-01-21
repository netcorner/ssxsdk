package com.netcorner.ssx.sdk.api;

import com.netcorner.ssx.sdk.ApiDefine;
import com.netcorner.ssx.sdk.BaseApi;
import java.util.Map;import java.util.HashMap;


/**
 * Created by shijiufeng on 2022/1/15.
 * 服务类型规则API
 */
public class MatchRuleServiceTypeApi  extends BaseApi {
    /**
     * 服务类型规则删除
     * @param ID 服务类型规则ID
     * @return
     */
    public
        Object
    delete(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/matchRuleServiceType/del";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 服务类型规则添加或修改保存
     * @return
     */
    public
        Object
    save(

            String authHeader
 ,
            com.netcorner.ssx.model.params.MatchRuleServiceTypeParams arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/matchRuleServiceType/save";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("POST",requestUrl,header,data);
    }

    /**
     * 服务类型规则列表分页
     * @return
     */
    public
        Object
    finder(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.PaginationParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/matchRuleServiceType/finder";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

    /**
     * 服务类型规则导出 excel
     * @return
     */
    public
        void
    export(

            String authHeader
 ,
            com.netcorner.ssx.model.params.base.ExportParam arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/matchRuleServiceType/export";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);


    }

    /**
     * 服务类型规则查看
     * @param ID 服务类型规则ID
     * @return
     */
    public
        Object
    look(

            String authHeader
 ,
            int arg0

        ){

        String requestUrl = ApiDefine.HOST_BASE_URL+"/api/auth/matchRuleServiceType/look";
        Map<String,Object> data = new HashMap<>();

        data.put("arg0", arg0);

        Map<String,Object> header=null;
            header = new HashMap<>();
            header.put("authorize",authHeader);

            return getObject("GET",requestUrl,header,data);
    }

}
