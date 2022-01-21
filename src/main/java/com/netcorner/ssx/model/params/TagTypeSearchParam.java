package com.netcorner.ssx.model.params;

import com.netcorner.ssx.model.params.base.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/5/18.
 */
public class TagTypeSearchParam extends PaginationParam {
    @ApiModelProperty(name = "Type", value = "类型字符", example = "repair",required = true)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
