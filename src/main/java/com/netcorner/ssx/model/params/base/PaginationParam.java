package com.netcorner.ssx.model.params.base;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class PaginationParam {

    @ApiModelProperty(value = "一页显示的条数（0不受限制，>0是显示指定条数），默认显示15条", name = "size", example = "15")
    private int size;

    @ApiModelProperty(value = "当前所在页", name = "page", example = "1")
    private int page;

    @ApiModelProperty(value = "排序字段名称", name = "order", example = "ID")
    private String order;

    @ApiModelProperty(value = "排序方式（0默认倒序，1顺序）", name = "way", example = "1")
    private int way;

    @ApiModelProperty(value = "搜索类型名", name = "searchtype")
    private String searchtype;
    @ApiModelProperty(value = "搜索类型值", name = "searchkey")
    private String searchkey;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getWay() {
        return way;
    }

    public void setWay(int way) {
        this.way = way;
    }

    public String getSearchtype() {
        return searchtype;
    }

    public void setSearchtype(String searchtype) {
        this.searchtype = searchtype;
    }

    public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }
}
