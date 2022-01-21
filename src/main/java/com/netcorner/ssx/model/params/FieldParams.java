package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class FieldParams {

    @ApiModelProperty(name = "PropertyName", value = "字段名称", required = true)
    private  String propertyName;

    @ApiModelProperty(name = "Description", value = "标签显示名")
    private String description;


    @ApiModelProperty(name = "DefaultValue", value = "单值值")
    private String defaultValue;

    @ApiModelProperty(name = "FieldDisplay", value = "多值显示标签名")
    private String fieldDisplay;

    @ApiModelProperty(name = "FieldValue", value = "多值显示值")
    private String fieldValue;


    @ApiModelProperty(name = "ID", value = "ID(添加时不用传输，编辑时需要传递)")
    private int iD;

    @ApiModelProperty(name = "Type", value = "值类型（1单值,2多值）")
    private int type;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getFieldDisplay() {
        return fieldDisplay;
    }

    public void setFieldDisplay(String fieldDisplay) {
        this.fieldDisplay = fieldDisplay;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public int getID() {
        return iD;
    }

    public void setID(int id) {
        this.iD = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
