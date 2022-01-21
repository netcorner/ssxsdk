package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class ComeGoLogParams {


    
                

        
        @ApiModelProperty(name = "Address", value = "具体位置")
        private String address;
        /**
         * 得到 具体位置
         * @return
         */
        public String getAddress() {
                return address;
        }
        /**
         * 设置 具体位置
         * @param address
         */
        public void setAddress(String address) {
                this.address = address;
        }
    
                

        
        @ApiModelProperty(name = "City", value = "城市")
        private String city;
        /**
         * 得到 城市
         * @return
         */
        public String getCity() {
                return city;
        }
        /**
         * 设置 城市
         * @param city
         */
        public void setCity(String city) {
                this.city = city;
        }
    
                

        
        @ApiModelProperty(name = "Country", value = "国家")
        private String country;
        /**
         * 得到 国家
         * @return
         */
        public String getCountry() {
                return country;
        }
        /**
         * 设置 国家
         * @param country
         */
        public void setCountry(String country) {
                this.country = country;
        }
    
                

        
        @ApiModelProperty(name = "District", value = "地区")
        private String district;
        /**
         * 得到 地区
         * @return
         */
        public String getDistrict() {
                return district;
        }
        /**
         * 设置 地区
         * @param district
         */
        public void setDistrict(String district) {
                this.district = district;
        }
    
                

        
        @ApiModelProperty(name = "EntID", value = "所在企业 ID")
        private Integer entID;
        /**
         * 得到 所在企业 ID
         * @return
         */
        public Integer getEntID() {
                return entID;
        }
        /**
         * 设置 所在企业 ID
         * @param entID
         */
        public void setEntID(Integer entID) {
                this.entID = entID;
        }
    
                

        
        @ApiModelProperty(name = "EntName", value = "企业名称")
        private String entName;
        /**
         * 得到 企业名称
         * @return
         */
        public String getEntName() {
                return entName;
        }
        /**
         * 设置 企业名称
         * @param entName
         */
        public void setEntName(String entName) {
                this.entName = entName;
        }
    
                

        
        @ApiModelProperty(name = "GetLat", value = "获取纬度")
        private String getLat;
        /**
         * 得到 获取纬度
         * @return
         */
        public String getGetLat() {
                return getLat;
        }
        /**
         * 设置 获取纬度
         * @param getLat
         */
        public void setGetLat(String getLat) {
                this.getLat = getLat;
        }
    
                

        
        @ApiModelProperty(name = "GetLon", value = "获取经度")
        private String getLon;
        /**
         * 得到 获取经度
         * @return
         */
        public String getGetLon() {
                return getLon;
        }
        /**
         * 设置 获取经度
         * @param getLon
         */
        public void setGetLon(String getLon) {
                this.getLon = getLon;
        }
    
                

        
        @ApiModelProperty(name = "GetPassportTime", value = "获取通行证时间")
        private Date getPassportTime;
        /**
         * 得到 获取通行证时间
         * @return
         */
        public Date getGetPassportTime() {
                return getPassportTime;
        }
        /**
         * 设置 获取通行证时间
         * @param getPassportTime
         */
        public void setGetPassportTime(Date getPassportTime) {
                this.getPassportTime = getPassportTime;
        }
    
                

        
        @ApiModelProperty(name = "ID", value = "")
        private Integer iD;
        /**
         * 得到 
         * @return
         */
        public Integer getID() {
                return iD;
        }
        /**
         * 设置 
         * @param iD
         */
        public void setID(Integer iD) {
                this.iD = iD;
        }
    
                

        
        @ApiModelProperty(name = "Name", value = "姓名")
        private String name;
        /**
         * 得到 姓名
         * @return
         */
        public String getName() {
                return name;
        }
        /**
         * 设置 姓名
         * @param name
         */
        public void setName(String name) {
                this.name = name;
        }
    
                

        
        @ApiModelProperty(name = "Province", value = "省份")
        private String province;
        /**
         * 得到 省份
         * @return
         */
        public String getProvince() {
                return province;
        }
        /**
         * 设置 省份
         * @param province
         */
        public void setProvince(String province) {
                this.province = province;
        }
    
                

        
        @ApiModelProperty(name = "Status", value = "打卡是否有效（大于1为多次打卡有效并更新过时间（即3分钟内打了多少次数），1有效，0无效）")
        private Integer status;
        /**
         * 得到 打卡是否有效（大于1为多次打卡有效并更新过时间（即3分钟内打了多少次数），1有效，0无效）
         * @return
         */
        public Integer getStatus() {
                return status;
        }
        /**
         * 设置 打卡是否有效（大于1为多次打卡有效并更新过时间（即3分钟内打了多少次数），1有效，0无效）
         * @param status
         */
        public void setStatus(Integer status) {
                this.status = status;
        }
    
                

        
        @ApiModelProperty(name = "Township", value = "城镇")
        private String township;
        /**
         * 得到 城镇
         * @return
         */
        public String getTownship() {
                return township;
        }
        /**
         * 设置 城镇
         * @param township
         */
        public void setTownship(String township) {
                this.township = township;
        }
    
                

        
        @ApiModelProperty(name = "UserID", value = "人员ID")
        private Integer userID;
        /**
         * 得到 人员ID
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 人员ID
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }
    
                

        
        @ApiModelProperty(name = "UserPhoto", value = "头像")
        private String userPhoto;
        /**
         * 得到 头像
         * @return
         */
        public String getUserPhoto() {
                return userPhoto;
        }
        /**
         * 设置 头像
         * @param userPhoto
         */
        public void setUserPhoto(String userPhoto) {
                this.userPhoto = userPhoto;
        }
    
                

        
        @ApiModelProperty(name = "UserRoleID", value = "通行证ID")
        private Integer userRoleID;
        /**
         * 得到 通行证ID
         * @return
         */
        public Integer getUserRoleID() {
                return userRoleID;
        }
        /**
         * 设置 通行证ID
         * @param userRoleID
         */
        public void setUserRoleID(Integer userRoleID) {
                this.userRoleID = userRoleID;
        }
    

}
