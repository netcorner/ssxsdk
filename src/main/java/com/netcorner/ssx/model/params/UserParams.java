package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class UserParams {

    @ApiModelProperty(name = "Name", value = "账户名称", required = true)
    private String name;

    @ApiModelProperty(name = "RealName", value = "姓名")
    private String realName;

    @ApiModelProperty(name = "Pwd", value = "初始密码（用户添加时有效）")
    private String pwd;

    @ApiModelProperty(name = "Mobile", value = "手机号码")
    private String mobile;

    @ApiModelProperty(name = "Description", value = "描述")
    private String description;


    @ApiModelProperty(name = "UserRoleID", value = " 用户角色 ID")
    private String userRoleID;

    @ApiModelProperty(name = "ID", value = "编辑保存时需传递 ID,添加不需要传递")
    private String iD;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return iD;
    }

    public void setID(String id) {
        this.iD = id;
    }

    public String getUserRoleID() {
        return userRoleID;
    }

    public void setUserRoleID(String userRoleID) {
        this.userRoleID = userRoleID;
    }
}
