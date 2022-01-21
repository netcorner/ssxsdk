package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RepairEditParams {

    @ApiModelProperty(name = "ID", value = "上报ID", required = true)
    private String iD;

    @ApiModelProperty(name = "RepairType", value = "上报类型", required = true)
    private String repairType;

    @ApiModelProperty(name = "Description", value = "备注")
    private String description;

    @ApiModelProperty(name = "PubLat", value = "发布纬度")
    private String pubLat;

    @ApiModelProperty(name = "PubLon", value = "发布经度")
    private String pubLon;
    @ApiModelProperty(name = "PubAddress", value = "选择的位置")
    private String pubAddress;

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubLat() {
        return pubLat;
    }

    public void setPubLat(String pubLat) {
        this.pubLat = pubLat;
    }

    public String getPubLon() {
        return pubLon;
    }

    public void setPubLon(String pubLon) {
        this.pubLon = pubLon;
    }

    public String getID() {
        return iD;
    }

    public void setID(String id) {
        this.iD = id;
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }
}
