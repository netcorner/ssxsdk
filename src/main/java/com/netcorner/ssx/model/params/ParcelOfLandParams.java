package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class ParcelOfLandParams{

    @ApiModelProperty(name = "AreaID", value = "所属街道 ID", required = true)
    private Integer areaID;
    @ApiModelProperty(name = "AreaName", value = "所属街道名称", required = true)
    private String areaName;
    @ApiModelProperty(name = "CenterLat", value = "项目所处地理位置中心点纬度", required = true)
    private Double centerLat;
    @ApiModelProperty(name = "CenterLon", value = "项目所处地理位置中心点经度", required = true)
    private Double centerLon;
    @ApiModelProperty(name = "Name", value = "地块名称", required = true)
    private String name;
    @ApiModelProperty(name = "ParcelOfLandArea", value = "地块面积", required = true)
    private String parcelOfLandArea;
    @ApiModelProperty(name = "ParcelOfLandRuleArea", value = "规划建筑面积", required = true)
    private String parcelOfLandRuleArea;
    @ApiModelProperty(name = "ProjectName", value = "项目名称", required = true)
    private String projectName;
    @ApiModelProperty(name = "Description", value = "备注")
    private String description;

    @ApiModelProperty(name = "lat", value = "项目出入口位置纬度，多个用逗号分开", required = true)
    private String  lat;
    @ApiModelProperty(name = "lon", value = "项目出入口位置经度，多个用逗号分开", required = true)
    private String lon;
    @ApiModelProperty(name = "blocks", value = "项目圈出的块的点，json", required = true)
    private String blocks;


    public void setCenterLat(Double centerLat) {
        this.centerLat = centerLat;
    }

    public void setCenterLon(Double centerLon) {
        this.centerLon = centerLon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getBlocks() {
        return blocks;
    }

    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    public Integer getAreaID() {
        return areaID;
    }

    public void setAreaID(Integer areaID) {
        this.areaID = areaID;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParcelOfLandArea() {
        return parcelOfLandArea;
    }

    public void setParcelOfLandArea(String parcelOfLandArea) {
        this.parcelOfLandArea = parcelOfLandArea;
    }

    public String getParcelOfLandRuleArea() {
        return parcelOfLandRuleArea;
    }

    public void setParcelOfLandRuleArea(String parcelOfLandRuleArea) {
        this.parcelOfLandRuleArea = parcelOfLandRuleArea;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
