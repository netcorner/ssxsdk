package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class CarsupplyParams {



        @ApiModelProperty(name = "TargetCountry", value = "发布目的地城市")
        private String targetCountry;
        @ApiModelProperty(name = "TargetProv", value = "发布目的地国家")
        private String targetProv;
        @ApiModelProperty(name = "TargetCity", value = "发布目的地省份")
        private String targetCity;
        @ApiModelProperty(name = "TargetDistrict", value = "发布目的地地区")
        private String targetDistrict;
        @ApiModelProperty(name = "TargetTownship", value = "发布目的地城镇")
        private String targetTownship;
        @ApiModelProperty(name = "TargetNeighbourhood", value = "发布目的地小区名称")
        private String targetNeighbourhood;
        @ApiModelProperty(name = "TargetAddress", value = "发布目的地小区具体位置")
        private String targetAddress;
        @ApiModelProperty(name = "TargetAddrLat", value = "发布目的地小区纬度")
        private double targetAddrLat;
        @ApiModelProperty(name = "TargetAddrLng", value = "发布目的地小区经度")
        private double targetAddrLng;

        public String getTargetCountry() {
                return targetCountry;
        }

        public void setTargetCountry(String targetCountry) {
                this.targetCountry = targetCountry;
        }

        public String getTargetProv() {
                return targetProv;
        }

        public void setTargetProv(String targetProv) {
                this.targetProv = targetProv;
        }

        public String getTargetCity() {
                return targetCity;
        }

        public void setTargetCity(String targetCity) {
                this.targetCity = targetCity;
        }

        public String getTargetDistrict() {
                return targetDistrict;
        }

        public void setTargetDistrict(String targetDistrict) {
                this.targetDistrict = targetDistrict;
        }

        public String getTargetTownship() {
                return targetTownship;
        }

        public void setTargetTownship(String targetTownship) {
                this.targetTownship = targetTownship;
        }

        public String getTargetNeighbourhood() {
                return targetNeighbourhood;
        }

        public void setTargetNeighbourhood(String targetNeighbourhood) {
                this.targetNeighbourhood = targetNeighbourhood;
        }

        public String getTargetAddress() {
                return targetAddress;
        }

        public void setTargetAddress(String targetAddress) {
                this.targetAddress = targetAddress;
        }

        public double getTargetAddrLat() {
                return targetAddrLat;
        }

        public void setTargetAddrLat(double targetAddrLat) {
                this.targetAddrLat = targetAddrLat;
        }

        public double getTargetAddrLng() {
                return targetAddrLng;
        }

        public void setTargetAddrLng(double targetAddrLng) {
                this.targetAddrLng = targetAddrLng;
        }

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
    
                

        
        @ApiModelProperty(name = "AddrLat", value = "纬度")
        private String addrLat;
        /**
         * 得到 纬度
         * @return
         */
        public String getAddrLat() {
                return addrLat;
        }
        /**
         * 设置 纬度
         * @param addrLat
         */
        public void setAddrLat(String addrLat) {
                this.addrLat = addrLat;
        }
    
                

        
        @ApiModelProperty(name = "AddrLng", value = "经度")
        private String addrLng;
        /**
         * 得到 经度
         * @return
         */
        public String getAddrLng() {
                return addrLng;
        }
        /**
         * 设置 经度
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
    
                

        
        @ApiModelProperty(name = "DemandTotal", value = "配对的需求数")
        private Integer demandTotal;
        /**
         * 得到 配对的需求数
         * @return
         */
        public Integer getDemandTotal() {
                return demandTotal;
        }
        /**
         * 设置 配对的需求数
         * @param demandTotal
         */
        public void setDemandTotal(Integer demandTotal) {
                this.demandTotal = demandTotal;
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
    
                

        
        @ApiModelProperty(name = "Photo", value = "第一张图片")
        private String photo;
        /**
         * 得到 第一张图片
         * @return
         */
        public String getPhoto() {
                return photo;
        }
        /**
         * 设置 第一张图片
         * @param photo
         */
        public void setPhoto(String photo) {
                this.photo = photo;
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
    
                

        
        @ApiModelProperty(name = "TotalMoney", value = "金额")
        private Integer totalMoney;
        /**
         * 得到 金额
         * @return
         */
        public Integer getTotalMoney() {
                return totalMoney;
        }
        /**
         * 设置 金额
         * @param totalMoney
         */
        public void setTotalMoney(Integer totalMoney) {
                this.totalMoney = totalMoney;
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
