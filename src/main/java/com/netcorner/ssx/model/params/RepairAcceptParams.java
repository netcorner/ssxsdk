package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RepairAcceptParams {

    @ApiModelProperty(name = "ID", value = "上报ID", required = true)
    private String iD;


    @ApiModelProperty(name = "Description", value = "备注")
    private String description;

    @ApiModelProperty(name = "PubLat", value = "发布纬度", required = true)
    private Double pubLat;

    @ApiModelProperty(name = "PubLon", value = "发布经度", required = true)
    private Double pubLon;




    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPubLat() {
        return pubLat;
    }

    public void setPubLat(Double pubLat) {
        this.pubLat = pubLat;
    }

    public Double getPubLon() {
        return pubLon;
    }

    public void setPubLon(Double pubLon) {
        this.pubLon = pubLon;
    }

    public String getID() {
        return iD;
    }

    public void setID(String id) {
        this.iD = id;
    }
}
