package com.netcorner.ssx.model.params;

import com.netcorner.ssx.model.params.base.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/5/18.
 */
public class MsgSearchParam extends PaginationParam {
    @ApiModelProperty(name = "chatID", value = "会话用户ID", required = true)
    private String chatID;

    public String getChatID() {
        return chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }
}
