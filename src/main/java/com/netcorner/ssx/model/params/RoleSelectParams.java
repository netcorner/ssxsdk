package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RoleSelectParams {

    @ApiModelProperty(name = "SystemID", value = "系统 ID", required = true)
    private int systemID;

    @ApiModelProperty(name = "invite", value = "是否邀请（1是，0否（或不填））")
    private int invite;

    public int getSystemID() {
        return systemID;
    }

    public void setSystemID(int systemID) {
        this.systemID = systemID;
    }

    public int getInvite() {
        return invite;
    }

    public void setInvite(int invite) {
        this.invite = invite;
    }
}
