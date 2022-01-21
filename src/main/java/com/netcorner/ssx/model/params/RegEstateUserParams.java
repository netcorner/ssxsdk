package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RegEstateUserParams {

    @ApiModelProperty(name = "appid", value = "微信的app ID", required = true, example = "wxb669a544363bbae7")
    private String appid;

    @ApiModelProperty(name = "phonenumber", value = "手机号码", required = true,example = "13645843335")
    private String phonenumber;

    @ApiModelProperty(name = "wxid", value = "微信的OpenID", required = true,example = "oZWqw004qaqRls6bt0qIB0f-Mx8U")
    private String wxid;

    @ApiModelProperty(name = "SystemID", value = "系统ID",example = "1")
    private int systemID=1;



    @ApiModelProperty(name = "unionid", value = "统一 ID")
    private String unionid;



    @ApiModelProperty(name = "RoleID", value = "角色 ID", required = true,example = "1")
    private String roleID;


    @ApiModelProperty(name = "Name", value = "姓名", required = true)
    private String name;

    @ApiModelProperty(name = "NickName", value = "姓名", required = true)
    private String nickName;

    @ApiModelProperty(name = "AvatarUrl", value = "头像", required = true)
    private String avatarUrl;

    @ApiModelProperty(name = "Language", value = "语言", required = true)
    private String language;

    @ApiModelProperty(name = "City", value = "城市", required = true)
    private String city;

    @ApiModelProperty(name = "Province", value = "省份", required = true)
    private String province;

    @ApiModelProperty(name = "Country", value = "国家", required = true)
    private String country;

    @ApiModelProperty(name = "Gender", value = "姓名", required = true)
    private String gender;


    @ApiModelProperty(name = "RegLat", value = "注册时获取的纬度")
    private double regLat;

    @ApiModelProperty(name = "RegLon", value = "注册时获取的经度")
    private double regLon;

    @ApiModelProperty(name = "Lat", value = "登录时带的纬度")
    private String lat;

    @ApiModelProperty(name = "Lon", value = "登录时带的经度")
    private String lon;


    @ApiModelProperty(name = "ReleaseVer", value = "微信版本号")
    private String releaseVer;


    @ApiModelProperty(name = "Model", value = "手机机型")
    private String model;

    @ApiModelProperty(name = "SourceEntID", value = "企业的ID")
    private int sourceEntID;

    @ApiModelProperty(name = "Neighbourhood", value = "所在小区")
    private String neighbourhood;

    @ApiModelProperty(name = "AddrLat", value = "小区的纬度", required = true)
    private double addrLat;

    @ApiModelProperty(name = "AddrLng", value = "小区的经度")
    private double addrLng;

    @ApiModelProperty(name = "Address", value = "小区详细地址")
    private String  address;


    @ApiModelProperty(name = "DoorNum", value = "门牌号")
    private String  doorNum;

    @ApiModelProperty(name = "CarStoreNum", value = "车位号")
    private String  carStoreNum;

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public double getAddrLat() {
        return addrLat;
    }

    public void setAddrLat(double addrLat) {
        this.addrLat = addrLat;
    }

    public double getAddrLng() {
        return addrLng;
    }

    public void setAddrLng(double addrLng) {
        this.addrLng = addrLng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(String doorNum) {
        this.doorNum = doorNum;
    }

    public String getCarStoreNum() {
        return carStoreNum;
    }

    public void setCarStoreNum(String carStoreNum) {
        this.carStoreNum = carStoreNum;
    }

    public int getSourceEntID() {
        return sourceEntID;
    }

    public void setSourceEntID(int sourceEntID) {
        this.sourceEntID = sourceEntID;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
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

    public int getSystemID() {
        return systemID;
    }

    public void setSystemID(int systemID) {
        this.systemID = systemID;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
