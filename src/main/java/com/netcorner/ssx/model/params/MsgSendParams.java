package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class MsgSendParams {

    @ApiModelProperty(name = "touid", value = "消息发送到的用户id", required = true)
    private int touid;

    @ApiModelProperty(name = "msgType", value = "消息类型")
    private int msgType;

    @ApiModelProperty(name = "msg", value = "消息内空")
    private String msg;

    @ApiModelProperty(name = "jmx", value = "是否鸡毛信")
    private  Boolean jmx;

    @ApiModelProperty(name = "appid", value = "微信 APPID")
    private String appid;

    @ApiModelProperty(name = "hasNotLastMsg", value = "发送时不在我的消息中显示")
    private String hasNotLastMsg;

    @ApiModelProperty(name = "targetID", value = "目标 ID")
    private String targetID;

    @ApiModelProperty(name = "name", value = "发送到用户的名称")
    private String name;

    public int getTouid() {
        return touid;
    }

    public void setTouid(int touid) {
        this.touid = touid;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getJmx() {
        return jmx;
    }

    public void setJmx(Boolean jmx) {
        this.jmx = jmx;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getHasNotLastMsg() {
        return hasNotLastMsg;
    }

    public void setHasNotLastMsg(String hasNotLastMsg) {
        this.hasNotLastMsg = hasNotLastMsg;
    }

    public String getTargetID() {
        return targetID;
    }

    public void setTargetID(String targetID) {
        this.targetID = targetID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
