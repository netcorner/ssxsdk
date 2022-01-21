package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class ModuleParams {

    @ApiModelProperty(name = "ModuleName", value = "模块名称", required = true)
    private  String moduleName;

    @ApiModelProperty(name = "OptUrl", value = "操作 URL（模块组可以为空）")
    private String optUrl;


    @ApiModelProperty(name = "Icon", value = "图标")
    private String icon;



    @ApiModelProperty(name = "Description", value = "模块描述")
    private String description;



    @ApiModelProperty(name = "IsHide", value = "是否隐藏0不隐藏,1隐藏")
    private int isHide;

    @ApiModelProperty(name = "OptType", value = "操作类型（0默认，1快捷操作,2主页）")
    private int optType;

    @ApiModelProperty(name = "ParentID", value = "上层模块 ID（默认0，为顶层）")
    private int parentID;

    @ApiModelProperty(name = "Sort", value = "排序数值（默认为0）")
    private int sort;

    @ApiModelProperty(name = "ID", value = "ID(添加时不用传输，编辑时需要传递)")
    private int iD;


    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getOptUrl() {
        return optUrl;
    }

    public void setOptUrl(String optUrl) {
        this.optUrl = optUrl;
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

    public int getIsHide() {
        return isHide;
    }

    public void setIsHide(int isHide) {
        this.isHide = isHide;
    }

    public int getOptType() {
        return optType;
    }

    public void setOptType(int optType) {
        this.optType = optType;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getID() {
        return iD;
    }

    public void setID(int id) {
        this.iD = id;
    }
}
