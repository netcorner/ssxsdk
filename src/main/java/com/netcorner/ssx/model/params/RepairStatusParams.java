package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RepairStatusParams {

    @ApiModelProperty(name = "ID", value = "上报ID", required = true)
    private String iD;


    @ApiModelProperty(name = "Status", value = "状态 ID", required = true)
    private int status;


    @ApiModelProperty(name = "Description", value = "备注")
    private String description;

    @ApiModelProperty(name = "PubLat", value = "发布纬度", required = true)
    private double pubLat;

    @ApiModelProperty(name = "PubLon", value = "发布经度", required = true)
    private double pubLon;


    @ApiModelProperty(name = "ExeDescription", value = "费用")
    private String ExeDescription;

    @ApiModelProperty(name = "Photos", value = "照片，多个用逗号分开")
    private String photos;

    public String getExeDescription() {
        return ExeDescription;
    }

    public void setExeDescription(String ExeDescription) {
        this.ExeDescription = ExeDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPubLat() {
        return pubLat;
    }

    public void setPubLat(double pubLat) {
        this.pubLat = pubLat;
    }

    public double getPubLon() {
        return pubLon;
    }

    public void setPubLon(double pubLon) {
        this.pubLon = pubLon;
    }

    public String getID() {
        return iD;
    }

    public void setID(String id) {
        this.iD = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }
}
