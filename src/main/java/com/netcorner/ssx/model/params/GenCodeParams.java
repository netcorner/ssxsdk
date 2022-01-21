package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class GenCodeParams {

    @ApiModelProperty(name = "ParentID", value = "所属模块组", required = true)
    private String parentID;

    @ApiModelProperty(name = "Table", value = "数据表", required = true)
    private String table;


    @ApiModelProperty(name = "ModuleName", value = "模块名", required = true)
    private String moduleName;


    @ApiModelProperty(name = "ModuleAsName", value = "模块别名", required = true)
    private String moduleAsName;

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleAsName() {
        return moduleAsName;
    }

    public void setModuleAsName(String moduleAsName) {
        this.moduleAsName = moduleAsName;
    }
}


