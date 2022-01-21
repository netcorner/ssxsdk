package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/5/18.
 */
public class EvaluationSearchParam extends TagTypeSearchParam {
    @ApiModelProperty(name = "TargetID", value = "类型字符",required = true)
    private String targetID;

    public String getTargetID() {
        return targetID;
    }

    public void setTargetID(String targetID) {
        this.targetID = targetID;
    }
}
