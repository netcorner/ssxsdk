package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RegOrgParams  {

    @ApiModelProperty(name = "appid", value = "微信的app ID", required = true, example = "wxb669a544363bbae7")
    private String appid;

    @ApiModelProperty(name = "phonenumber", value = "手机号码", required = true,example = "13645843335")
    private String phonenumber;

    @ApiModelProperty(name = "wxid", value = "微信的OpenID", required = true,example = "oZWqw004qaqRls6bt0qIB0f-Mx8U")
    private String wxid;

    @ApiModelProperty(name = "SystemID", value = "系统ID",example = "1")
    private int systemID=1;
    @ApiModelProperty(name = "EntID", value = "上级企业的ID(0为上级没有)",example = "0")
    private int entID=0;



    @ApiModelProperty(name = "unionid", value = "统一 ID", required = true)
    private String unionid;


    @ApiModelProperty(name = "AreaID", value = "街道或镇ID", required = true)
    private String areaID;

    @ApiModelProperty(name = "RoleID", value = "角色 ID", required = true,example = "1")
    private String roleID;


    @ApiModelProperty(name = "AreaName", value = "街道或镇名称", required = true)
    private String areaName;


    @ApiModelProperty(name = "Name", value = "组织名称", required = true)
    private String name;


    @ApiModelProperty(name = "Address", value = "组织地址", required = true)
    private String address;



    @ApiModelProperty(name = "Contact", value = "联系人, required = true")
    private String contact;


    @ApiModelProperty(name = "Description", value = "备注")
    private String description;


    @ApiModelProperty(name = "Cers", value = "证书列表，多个用逗号分开")
    private String photos;


    @ApiModelProperty(name = "RegLat", value = "注册时获取的纬度")
    private double regLat;

    @ApiModelProperty(name = "RegLon", value = "注册时获取的经度")
    private double regLon;

    @ApiModelProperty(name = "Lat", value = "企业位置纬度")
    private String lat;

    @ApiModelProperty(name = "Lon", value = "企业位置经度")
    private String lon;


    @ApiModelProperty(name = "ReleaseVer", value = "微信版本号")
    private String releaseVer;


    @ApiModelProperty(name = "Model", value = "手机机型")
    private String model;







    public int getEntID() {
        return entID;
    }

    public void setEntID(int entID) {
        entID = entID;
    }

    public int getSystemID() {
        return systemID;
    }

    public void setSystemID(int systemID) {
        this.systemID = systemID;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getAreaID() {
        return areaID;
    }

    public void setAreaID(String areaID) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
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


    public double getRegLat() {
        return regLat;
    }

    public void setRegLat(double regLat) {
        this.regLat = regLat;
    }

    public double getRegLon() {
        return regLon;
    }

    public void setRegLon(double regLon) {
        this.regLon = regLon;
    }

    public String getReleaseVer() {
        return releaseVer;
    }

    public void setReleaseVer(String releaseVer) {
        this.releaseVer = releaseVer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }
}
