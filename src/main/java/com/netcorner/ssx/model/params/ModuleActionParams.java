package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class ModuleActionParams {


    @ApiModelProperty(name = "ModuleID", value = "模块ID", required = true)
    private int moduleID;

    @ApiModelProperty(name = "ModuleOperateName", value = "模块名称", required = true)
    private  String moduleOperateName;

    @ApiModelProperty(name = "Code", value = "操作 URL（模块组可以为空）")
    private String code;
    @ApiModelProperty(name = "Sort", value = "排序数值（默认为0）")
    private int sort;

    @ApiModelProperty(name = "Icon", value = "图标")
    private String icon;



    @ApiModelProperty(name = "Description", value = "模块行为描述")
    private String description;








    @ApiModelProperty(name = "ID", value = "ID(添加时不用传输，编辑时需要传递)")
    private int iD;

    public int getModuleID() {
        return moduleID;
    }

    public void setModuleID(int moduleID) {
        this.moduleID = moduleID;
    }

    public String getModuleOperateName() {
        return moduleOperateName;
    }

    public void setModuleOperateName(String moduleOperateName) {
        this.moduleOperateName = moduleOperateName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getID() {
        return iD;
    }

    public void setID(int id) {
        this.iD = id;
    }
}
