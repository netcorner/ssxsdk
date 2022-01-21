package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EvaluationTagParams {

    @ApiModelProperty(name = "Type", value = "类型", required = true)
    private String type;

    @ApiModelProperty(name = "TargetID", value = "评价ID", required = true)
    private String targetID;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTargetID() {
        return targetID;
    }

    public void setTargetID(String targetID) {
        this.targetID = targetID;
    }
}
