package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RegHouseOrgParams extends RegOrgParams{
    @ApiModelProperty(name = "HouseAreas", value = "房源范围", required = true)
    private String houseAreas;

    @ApiModelProperty(name = "IdCard", value = "身份证号", required = true)
    private String idCard;

    @ApiModelProperty(name = "RealName", value = "姓名", required = true)
    private String realName;


    @ApiModelProperty(name = "LiveAddress", value = "家庭住址", required = true)
    private String liveAddress;

    @ApiModelProperty(name = "Nationality", value = "民族", required = true)
    private String nationality;

    @ApiModelProperty(name = "RealGender", value = "真实性别", required = true)
    private String  realGender;

    @ApiModelProperty(name = "IdCardPhoto", value = "身份证照片路径", required = true)
    private String  idCardPhoto;


    @ApiModelProperty(name = "CardPhoto", value = "名片路径", required = true)
    private String  cardPhoto;

    public String getHouseAreas() {
        return houseAreas;
    }

    public void setHouseAreas(String houseAreas) {
        this.houseAreas = houseAreas;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRealGender() {
        return realGender;
    }

    public void setRealGender(String realGender) {
        this.realGender = realGender;
    }

    public String getIdCardPhoto() {
        return idCardPhoto;
    }

    public void setIdCardPhoto(String idCardPhoto) {
        this.idCardPhoto = idCardPhoto;
    }

    public String getCardPhoto() {
        return cardPhoto;
    }

    public void setCardPhoto(String cardPhoto) {
        this.cardPhoto = cardPhoto;
    }
}
