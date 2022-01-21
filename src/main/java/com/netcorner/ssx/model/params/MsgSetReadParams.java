package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class MsgSetReadParams {

    @ApiModelProperty(name = "ID", value = "消息ID", required = true)
    private int iD;


    @ApiModelProperty(name = "chatID", value = "会话用ID")
    private String chatID;

    @ApiModelProperty(name = "roomID", value = "郡组 ID")
    private String roomID;

    public int getID() {
        return iD;
    }

    public void setID(int id) {
        this.iD = id;
    }

    public String getChatID() {
        return chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
}
