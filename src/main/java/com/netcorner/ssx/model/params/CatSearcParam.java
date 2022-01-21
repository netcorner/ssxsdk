package com.netcorner.ssx.model.params;

import com.netcorner.ssx.model.params.base.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/5/18.
 */
public class CatSearcParam {
    @ApiModelProperty(name = "type", value = "类型", required = true)
    private String type;

    @ApiModelProperty(name = "ParentID", value = "上级节点 ID")
    private String parentID;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }
}
