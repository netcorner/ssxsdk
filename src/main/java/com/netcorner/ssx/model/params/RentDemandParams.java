package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class RentDemandParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "AddrLat", value = "房源纬度")
        private String addrLat;
        /**
         * 得到 房源纬度
         * @return
         */
        public String getAddrLat() {
                return addrLat;
        }
        /**
         * 设置 房源纬度
         * @param addrLat
         */
        public void setAddrLat(String addrLat) {
                this.addrLat = addrLat;
        }
    
                

        
        @ApiModelProperty(name = "AddrLng", value = "房源经度")
        private String addrLng;
        /**
         * 得到 房源经度
         * @return
         */
        public String getAddrLng() {
                return addrLng;
        }
        /**
         * 设置 房源经度
         * @param addrLng
         */
        public void setAddrLng(String addrLng) {
                this.addrLng = addrLng;
        }
    
                

        
        @ApiModelProperty(name = "AddTime", value = "发布时间")
        private Date addTime;
        /**
         * 得到 发布时间
         * @return
         */
        public Date getAddTime() {
                return addTime;
        }
        /**
         * 设置 发布时间
         * @param addTime
         */
        public void setAddTime(Date addTime) {
                this.addTime = addTime;
        }
    
                

        
        @ApiModelProperty(name = "Area", value = "面积（平方）")
        private String area;
        /**
         * 得到 面积（平方）
         * @return
         */
        public String getArea() {
                return area;
        }
        /**
         * 设置 面积（平方）
         * @param area
         */
        public void setArea(String area) {
                this.area = area;
        }
    
                

        
        @ApiModelProperty(name = "City", value = "所在城市")
        private String city;
        /**
         * 得到 所在城市
         * @return
         */
        public String getCity() {
                return city;
        }
        /**
         * 设置 所在城市
         * @param city
         */
        public void setCity(String city) {
                this.city = city;
        }
    
                

        
        @ApiModelProperty(name = "Country", value = "所在国家")
        private String country;
        /**
         * 得到 所在国家
         * @return
         */
        public String getCountry() {
                return country;
        }
        /**
         * 设置 所在国家
         * @param country
         */
        public void setCountry(String country) {
                this.country = country;
        }
    
                

        
        @ApiModelProperty(name = "DeletedTime", value = "删除时间")
        private Date deletedTime;
        /**
         * 得到 删除时间
         * @return
         */
        public Date getDeletedTime() {
                return deletedTime;
        }
        /**
         * 设置 删除时间
         * @param deletedTime
         */
        public void setDeletedTime(Date deletedTime) {
                this.deletedTime = deletedTime;
        }
    
                

        
        @ApiModelProperty(name = "DeletedUserID", value = "删除人")
        private Integer deletedUserID;
        /**
         * 得到 删除人
         * @return
         */
        public Integer getDeletedUserID() {
                return deletedUserID;
        }
        /**
         * 设置 删除人
         * @param deletedUserID
         */
        public void setDeletedUserID(Integer deletedUserID) {
                this.deletedUserID = deletedUserID;
        }
    
                

        
        @ApiModelProperty(name = "Description", value = "描述")
        private String description;
        /**
         * 得到 描述
         * @return
         */
        public String getDescription() {
                return description;
        }
        /**
         * 设置 描述
         * @param description
         */
        public void setDescription(String description) {
                this.description = description;
        }
    
                

        
        @ApiModelProperty(name = "DistinceRance", value = "距离范围（KM）")
        private Integer distinceRance;
        /**
         * 得到 距离范围（KM）
         * @return
         */
        public Integer getDistinceRance() {
                return distinceRance;
        }
        /**
         * 设置 距离范围（KM）
         * @param distinceRance
         */
        public void setDistinceRance(Integer distinceRance) {
                this.distinceRance = distinceRance;
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
    
                

        
        @ApiModelProperty(name = "EntID", value = "发布所属单位")
        private Integer entID;
        /**
         * 得到 发布所属单位
         * @return
         */
        public Integer getEntID() {
                return entID;
        }
        /**
         * 设置 发布所属单位
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
    
                

        
        @ApiModelProperty(name = "IsDeleted", value = "是否删除")
        private Integer isDeleted;
        /**
         * 得到 是否删除
         * @return
         */
        public Integer getIsDeleted() {
                return isDeleted;
        }
        /**
         * 设置 是否删除
         * @param isDeleted
         */
        public void setIsDeleted(Integer isDeleted) {
                this.isDeleted = isDeleted;
        }
    
                

        
        @ApiModelProperty(name = "Neighbourhood", value = "小区名称")
        private String neighbourhood;
        /**
         * 得到 小区名称
         * @return
         */
        public String getNeighbourhood() {
                return neighbourhood;
        }
        /**
         * 设置 小区名称
         * @param neighbourhood
         */
        public void setNeighbourhood(String neighbourhood) {
                this.neighbourhood = neighbourhood;
        }
    
                

        
        @ApiModelProperty(name = "Province", value = "所在省份")
        private String province;
        /**
         * 得到 所在省份
         * @return
         */
        public String getProvince() {
                return province;
        }
        /**
         * 设置 所在省份
         * @param province
         */
        public void setProvince(String province) {
                this.province = province;
        }
    
                

        
        @ApiModelProperty(name = "RentMoney", value = "期望租金（元/月）")
        private String rentMoney;
        /**
         * 得到 期望租金（元/月）
         * @return
         */
        public String getRentMoney() {
                return rentMoney;
        }
        /**
         * 设置 期望租金（元/月）
         * @param rentMoney
         */
        public void setRentMoney(String rentMoney) {
                this.rentMoney = rentMoney;
        }
    
                

        
        @ApiModelProperty(name = "RentMonth", value = "租期（月）")
        private String rentMonth;
        /**
         * 得到 租期（月）
         * @return
         */
        public String getRentMonth() {
                return rentMonth;
        }
        /**
         * 设置 租期（月）
         * @param rentMonth
         */
        public void setRentMonth(String rentMonth) {
                this.rentMonth = rentMonth;
        }
    
                

        
        @ApiModelProperty(name = "RentWay", value = "租房方式")
        private String rentWay;
        /**
         * 得到 租房方式
         * @return
         */
        public String getRentWay() {
                return rentWay;
        }
        /**
         * 设置 租房方式
         * @param rentWay
         */
        public void setRentWay(String rentWay) {
                this.rentWay = rentWay;
        }
    
                

        
        @ApiModelProperty(name = "RoomInfo", value = "居住信息")
        private String roomInfo;
        /**
         * 得到 居住信息
         * @return
         */
        public String getRoomInfo() {
                return roomInfo;
        }
        /**
         * 设置 居住信息
         * @param roomInfo
         */
        public void setRoomInfo(String roomInfo) {
                this.roomInfo = roomInfo;
        }
    
                

        
        @ApiModelProperty(name = "SerialNum", value = " 流水ID")
        private String serialNum;
        /**
         * 得到  流水ID
         * @return
         */
        public String getSerialNum() {
                return serialNum;
        }
        /**
         * 设置  流水ID
         * @param serialNum
         */
        public void setSerialNum(String serialNum) {
                this.serialNum = serialNum;
        }
    
                

        
        @ApiModelProperty(name = "Status", value = "状态（0下线，1发布，2已成交,3完成评价）")
        private Integer status;
        /**
         * 得到 状态（0下线，1发布，2已成交,3完成评价）
         * @return
         */
        public Integer getStatus() {
                return status;
        }
        /**
         * 设置 状态（0下线，1发布，2已成交,3完成评价）
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
    
                

        
        @ApiModelProperty(name = "UpdateTime", value = "更新时间")
        private Date updateTime;
        /**
         * 得到 更新时间
         * @return
         */
        public Date getUpdateTime() {
                return updateTime;
        }
        /**
         * 设置 更新时间
         * @param updateTime
         */
        public void setUpdateTime(Date updateTime) {
                this.updateTime = updateTime;
        }
    
                

        
        @ApiModelProperty(name = "UpdateUserID", value = "更新人")
        private Integer updateUserID;
        /**
         * 得到 更新人
         * @return
         */
        public Integer getUpdateUserID() {
                return updateUserID;
        }
        /**
         * 设置 更新人
         * @param updateUserID
         */
        public void setUpdateUserID(Integer updateUserID) {
                this.updateUserID = updateUserID;
        }
    
                

        
        @ApiModelProperty(name = "UserID", value = "发布人")
        private Integer userID;
        /**
         * 得到 发布人
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 发布人
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }
    
                

        
        @ApiModelProperty(name = "UserName", value = "发布人姓名")
        private String userName;
        /**
         * 得到 发布人姓名
         * @return
         */
        public String getUserName() {
                return userName;
        }
        /**
         * 设置 发布人姓名
         * @param userName
         */
        public void setUserName(String userName) {
                this.userName = userName;
        }
    
                

        
        @ApiModelProperty(name = "UserPhoto", value = "发布人头像")
        private String userPhoto;
        /**
         * 得到 发布人头像
         * @return
         */
        public String getUserPhoto() {
                return userPhoto;
        }
        /**
         * 设置 发布人头像
         * @param userPhoto
         */
        public void setUserPhoto(String userPhoto) {
                this.userPhoto = userPhoto;
        }
    

}
