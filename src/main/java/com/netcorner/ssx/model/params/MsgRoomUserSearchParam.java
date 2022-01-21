package com.netcorner.ssx.model.params;

import com.netcorner.ssx.model.params.base.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/5/18.
 */
public class MsgRoomUserSearchParam extends PaginationParam {
    @ApiModelProperty(name = "roomID", value = "群ID", required = true)
    private String roomID;

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
}
