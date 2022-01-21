package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EvaluationEditParams {

    @ApiModelProperty(name = "ID", value = "ID", required = true)
    private String iD;


    @ApiModelProperty(name = "Grade", value = "打分（满意（+2），一般（0），不满意（-2））", required = true)
    private int grade;

    @ApiModelProperty(name = "Description", value = "评价文字备注", required = true)
    private String description;

    @ApiModelProperty(name = "TagList", value = "标签汇总(多个用逗号分开)")
    private String tagList;

    public String getID() {
        return iD;
    }

    public void setID(String id) {
        this.iD = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }
}
