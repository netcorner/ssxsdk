package com.netcorner.ssx.base.model.params.base;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class ExportParam extends  PaginationParam{

    @ApiModelProperty(value = "导出文件名称", name = "title", example = "文档")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
