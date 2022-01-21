package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RoleParams {

    @ApiModelProperty(name = "RoleName", value = "角色名称", required = true)
    private  String roleName;

    @ApiModelProperty(name = "Description", value = "角色相关描述")
    private String description;


    @ApiModelProperty(name = "actionid", value = "角色选择的模块行为，多个用逗号分开")
    private String actionid;

    @ApiModelProperty(name = "ID", value = "ID(添加时不用传输，编辑时需要传递)")
    private int iD;

    @ApiModelProperty(name = "Level", value = "层级（0,1,2）")
    private int level;


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActionid() {
        return actionid;
    }

    public void setActionid(String actionid) {
        this.actionid = actionid;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
