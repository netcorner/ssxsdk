package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RetrievedemandParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "Country", value = "发布城市")
        private String country;
        /**
         * 得到 发布城市
         * @return
         */
        public String getCountry() {
                return country;
        }
        /**
         * 设置 发布城市
         * @param country
         */
        public void setCountry(String country) {
                this.country = country;
        }
    
                

        
        @ApiModelProperty(name = "Province", value = "发布国家")
        private String province;
        /**
         * 得到 发布国家
         * @return
         */
        public String getProvince() {
                return province;
        }
        /**
         * 设置 发布国家
         * @param province
         */
        public void setProvince(String province) {
                this.province = province;
        }
    
                

        
        @ApiModelProperty(name = "City", value = "发布省份")
        private String city;
        /**
         * 得到 发布省份
         * @return
         */
        public String getCity() {
                return city;
        }
        /**
         * 设置 发布省份
         * @param city
         */
        public void setCity(String city) {
                this.city = city;
        }
    
                

        
        @ApiModelProperty(name = "District", value = "发布地区")
        private String district;
        /**
         * 得到 发布地区
         * @return
         */
        public String getDistrict() {
                return district;
        }
        /**
         * 设置 发布地区
         * @param district
         */
        public void setDistrict(String district) {
                this.district = district;
        }
    
                

        
        @ApiModelProperty(name = "Township", value = "发布城镇")
        private String township;
        /**
         * 得到 发布城镇
         * @return
         */
        public String getTownship() {
                return township;
        }
        /**
         * 设置 发布城镇
         * @param township
         */
        public void setTownship(String township) {
                this.township = township;
        }
    
                

        
        @ApiModelProperty(name = "Neighbourhood", value = "发布小区名称")
        private String neighbourhood;
        /**
         * 得到 发布小区名称
         * @return
         */
        public String getNeighbourhood() {
                return neighbourhood;
        }
        /**
         * 设置 发布小区名称
         * @param neighbourhood
         */
        public void setNeighbourhood(String neighbourhood) {
                this.neighbourhood = neighbourhood;
        }
    
                

        
        @ApiModelProperty(name = "Address", value = "发布小区具体位置")
        private String address;
        /**
         * 得到 发布小区具体位置
         * @return
         */
        public String getAddress() {
                return address;
        }
        /**
         * 设置 发布小区具体位置
         * @param address
         */
        public void setAddress(String address) {
                this.address = address;
        }
    
                

        
        @ApiModelProperty(name = "AddrLat", value = "发布小区纬度")
        private String addrLat;
        /**
         * 得到 发布小区纬度
         * @return
         */
        public String getAddrLat() {
                return addrLat;
        }
        /**
         * 设置 发布小区纬度
         * @param addrLat
         */
        public void setAddrLat(String addrLat) {
                this.addrLat = addrLat;
        }
    
                

        
        @ApiModelProperty(name = "AddrLng", value = "发布小区经度")
        private String addrLng;
        /**
         * 得到 发布小区经度
         * @return
         */
        public String getAddrLng() {
                return addrLng;
        }
        /**
         * 设置 发布小区经度
         * @param addrLng
         */
        public void setAddrLng(String addrLng) {
                this.addrLng = addrLng;
        }
    
                

        
        @ApiModelProperty(name = "UserID", value = "发布用户 ID")
        private Integer userID;
        /**
         * 得到 发布用户 ID
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 发布用户 ID
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }
    
                

        
        @ApiModelProperty(name = "ServiceID", value = "服务 ID")
        private Integer serviceID;
        /**
         * 得到 服务 ID
         * @return
         */
        public Integer getServiceID() {
                return serviceID;
        }
        /**
         * 设置 服务 ID
         * @param serviceID
         */
        public void setServiceID(Integer serviceID) {
                this.serviceID = serviceID;
        }
    
                

        
        @ApiModelProperty(name = "ServiceName", value = "服务名称")
        private String serviceName;
        /**
         * 得到 服务名称
         * @return
         */
        public String getServiceName() {
                return serviceName;
        }
        /**
         * 设置 服务名称
         * @param serviceName
         */
        public void setServiceName(String serviceName) {
                this.serviceName = serviceName;
        }
    
                

        
        @ApiModelProperty(name = "HopeDate", value = "期望日期")
        private String hopeDate;
        /**
         * 得到 期望日期
         * @return
         */
        public String getHopeDate() {
                return hopeDate;
        }
        /**
         * 设置 期望日期
         * @param hopeDate
         */
        public void setHopeDate(String hopeDate) {
                this.hopeDate = hopeDate;
        }
    
                

        
        @ApiModelProperty(name = "HopeTime", value = "期望时间")
        private String hopeTime;
        /**
         * 得到 期望时间
         * @return
         */
        public String getHopeTime() {
                return hopeTime;
        }
        /**
         * 设置 期望时间
         * @param hopeTime
         */
        public void setHopeTime(String hopeTime) {
                this.hopeTime = hopeTime;
        }
    
                

        
        @ApiModelProperty(name = "Description", value = "备注")
        private String description;
        /**
         * 得到 备注
         * @return
         */
        public String getDescription() {
                return description;
        }
        /**
         * 设置 备注
         * @param description
         */
        public void setDescription(String description) {
                this.description = description;
        }
    
                

        
        @ApiModelProperty(name = "AddTime", value = "添加时间")
        private Date addTime;
        /**
         * 得到 添加时间
         * @return
         */
        public Date getAddTime() {
                return addTime;
        }
        /**
         * 设置 添加时间
         * @param addTime
         */
        public void setAddTime(Date addTime) {
                this.addTime = addTime;
        }
    
                

        
        @ApiModelProperty(name = "EntName", value = "添加企业名称")
        private String entName;
        /**
         * 得到 添加企业名称
         * @return
         */
        public String getEntName() {
                return entName;
        }
        /**
         * 设置 添加企业名称
         * @param entName
         */
        public void setEntName(String entName) {
                this.entName = entName;
        }
    
                

        
        @ApiModelProperty(name = "EntID", value = "添加企业ID")
        private Integer entID;
        /**
         * 得到 添加企业ID
         * @return
         */
        public Integer getEntID() {
                return entID;
        }
        /**
         * 设置 添加企业ID
         * @param entID
         */
        public void setEntID(Integer entID) {
                this.entID = entID;
        }
    
                

        
        @ApiModelProperty(name = "UserName", value = "用户姓名")
        private String userName;
        /**
         * 得到 用户姓名
         * @return
         */
        public String getUserName() {
                return userName;
        }
        /**
         * 设置 用户姓名
         * @param userName
         */
        public void setUserName(String userName) {
                this.userName = userName;
        }
    
                

        
        @ApiModelProperty(name = "UserPhoto", value = "用户照片")
        private String userPhoto;
        /**
         * 得到 用户照片
         * @return
         */
        public String getUserPhoto() {
                return userPhoto;
        }
        /**
         * 设置 用户照片
         * @param userPhoto
         */
        public void setUserPhoto(String userPhoto) {
                this.userPhoto = userPhoto;
        }
    
                

        
        @ApiModelProperty(name = "Status", value = "状态")
        private Integer status;
        /**
         * 得到 状态
         * @return
         */
        public Integer getStatus() {
                return status;
        }
        /**
         * 设置 状态
         * @param status
         */
        public void setStatus(Integer status) {
                this.status = status;
        }
    
                

        
        @ApiModelProperty(name = "Type", value = "类型 key(auto 汽车，hair 理发，ecovery 加收，digit 数码,food 订餐,edu 教育)")
        private String type;
        /**
         * 得到 类型 key(auto 汽车，hair 理发，ecovery 加收，digit 数码,food 订餐,edu 教育)
         * @return
         */
        public String getType() {
                return type;
        }
        /**
         * 设置 类型 key(auto 汽车，hair 理发，ecovery 加收，digit 数码,food 订餐,edu 教育)
         * @param type
         */
        public void setType(String type) {
                this.type = type;
        }
    

}
