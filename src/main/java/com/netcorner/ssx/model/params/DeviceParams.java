package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class DeviceParams {


    
                

        
        @ApiModelProperty(name = "Address", value = "设备位置")
        private String address;
        /**
         * 得到 设备位置
         * @return
         */
        public String getAddress() {
                return address;
        }
        /**
         * 设置 设备位置
         * @param address
         */
        public void setAddress(String address) {
                this.address = address;
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
    
                

        
        @ApiModelProperty(name = "AddUserPhoto", value = "添加人照片")
        private String addUserPhoto;
        /**
         * 得到 添加人照片
         * @return
         */
        public String getAddUserPhoto() {
                return addUserPhoto;
        }
        /**
         * 设置 添加人照片
         * @param addUserPhoto
         */
        public void setAddUserPhoto(String addUserPhoto) {
                this.addUserPhoto = addUserPhoto;
        }
    
                

        
        @ApiModelProperty(name = "AddUserRealName", value = "添加人姓名")
        private String addUserRealName;
        /**
         * 得到 添加人姓名
         * @return
         */
        public String getAddUserRealName() {
                return addUserRealName;
        }
        /**
         * 设置 添加人姓名
         * @param addUserRealName
         */
        public void setAddUserRealName(String addUserRealName) {
                this.addUserRealName = addUserRealName;
        }
    
                

        
        @ApiModelProperty(name = "Brand", value = "设备品牌")
        private String brand;
        /**
         * 得到 设备品牌
         * @return
         */
        public String getBrand() {
                return brand;
        }
        /**
         * 设置 设备品牌
         * @param brand
         */
        public void setBrand(String brand) {
                this.brand = brand;
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
    
                

        
        @ApiModelProperty(name = "DeviceSource", value = "设备来源")
        private String deviceSource;
        /**
         * 得到 设备来源
         * @return
         */
        public String getDeviceSource() {
                return deviceSource;
        }
        /**
         * 设置 设备来源
         * @param deviceSource
         */
        public void setDeviceSource(String deviceSource) {
                this.deviceSource = deviceSource;
        }
    
                

        
        @ApiModelProperty(name = "DeviceType", value = "设备类型")
        private String deviceType;
        /**
         * 得到 设备类型
         * @return
         */
        public String getDeviceType() {
                return deviceType;
        }
        /**
         * 设置 设备类型
         * @param deviceType
         */
        public void setDeviceType(String deviceType) {
                this.deviceType = deviceType;
        }
    
                

        
        @ApiModelProperty(name = "EntID", value = "添加人组织 ID")
        private Integer entID;
        /**
         * 得到 添加人组织 ID
         * @return
         */
        public Integer getEntID() {
                return entID;
        }
        /**
         * 设置 添加人组织 ID
         * @param entID
         */
        public void setEntID(Integer entID) {
                this.entID = entID;
        }
    
                

        
        @ApiModelProperty(name = "EntName", value = "企业名")
        private String entName;
        /**
         * 得到 企业名
         * @return
         */
        public String getEntName() {
                return entName;
        }
        /**
         * 设置 企业名
         * @param entName
         */
        public void setEntName(String entName) {
                this.entName = entName;
        }
    
                

        
        @ApiModelProperty(name = "FilledTime", value = "补充时间")
        private Date filledTime;
        /**
         * 得到 补充时间
         * @return
         */
        public Date getFilledTime() {
                return filledTime;
        }
        /**
         * 设置 补充时间
         * @param filledTime
         */
        public void setFilledTime(Date filledTime) {
                this.filledTime = filledTime;
        }
    
                

        
        @ApiModelProperty(name = "FilledUserID", value = "补充人")
        private Integer filledUserID;
        /**
         * 得到 补充人
         * @return
         */
        public Integer getFilledUserID() {
                return filledUserID;
        }
        /**
         * 设置 补充人
         * @param filledUserID
         */
        public void setFilledUserID(Integer filledUserID) {
                this.filledUserID = filledUserID;
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
    
                

        
        @ApiModelProperty(name = "IP", value = "IP地址")
        private String iP;
        /**
         * 得到 IP地址
         * @return
         */
        public String getIP() {
                return iP;
        }
        /**
         * 设置 IP地址
         * @param iP
         */
        public void setIP(String iP) {
                this.iP = iP;
        }
    
                

        
        @ApiModelProperty(name = "IsFilled", value = "是否有补充信息")
        private Integer isFilled;
        /**
         * 得到 是否有补充信息
         * @return
         */
        public Integer getIsFilled() {
                return isFilled;
        }
        /**
         * 设置 是否有补充信息
         * @param isFilled
         */
        public void setIsFilled(Integer isFilled) {
                this.isFilled = isFilled;
        }
    
                

        
        @ApiModelProperty(name = "IsOffSNUsed", value = "已注销的编码是否已经复用了（1是，0否）")
        private Integer isOffSNUsed;
        /**
         * 得到 已注销的编码是否已经复用了（1是，0否）
         * @return
         */
        public Integer getIsOffSNUsed() {
                return isOffSNUsed;
        }
        /**
         * 设置 已注销的编码是否已经复用了（1是，0否）
         * @param isOffSNUsed
         */
        public void setIsOffSNUsed(Integer isOffSNUsed) {
                this.isOffSNUsed = isOffSNUsed;
        }
    
                

        
        @ApiModelProperty(name = "Lat", value = "设备纬度")
        private String lat;
        /**
         * 得到 设备纬度
         * @return
         */
        public String getLat() {
                return lat;
        }
        /**
         * 设置 设备纬度
         * @param lat
         */
        public void setLat(String lat) {
                this.lat = lat;
        }
    
                

        
        @ApiModelProperty(name = "Lng", value = "设备经度")
        private String lng;
        /**
         * 得到 设备经度
         * @return
         */
        public String getLng() {
                return lng;
        }
        /**
         * 设置 设备经度
         * @param lng
         */
        public void setLng(String lng) {
                this.lng = lng;
        }
    
                

        
        @ApiModelProperty(name = "MAC", value = "MAC地址")
        private String mAC;
        /**
         * 得到 MAC地址
         * @return
         */
        public String getMAC() {
                return mAC;
        }
        /**
         * 设置 MAC地址
         * @param mAC
         */
        public void setMAC(String mAC) {
                this.mAC = mAC;
        }
    
                

        
        @ApiModelProperty(name = "Model", value = "设备编号")
        private String model;
        /**
         * 得到 设备编号
         * @return
         */
        public String getModel() {
                return model;
        }
        /**
         * 设置 设备编号
         * @param model
         */
        public void setModel(String model) {
                this.model = model;
        }
    
                

        
        @ApiModelProperty(name = "NetType", value = "网络类型")
        private String netType;
        /**
         * 得到 网络类型
         * @return
         */
        public String getNetType() {
                return netType;
        }
        /**
         * 设置 网络类型
         * @param netType
         */
        public void setNetType(String netType) {
                this.netType = netType;
        }
    
                

        
        @ApiModelProperty(name = "Photo", value = "设备照片")
        private String photo;
        /**
         * 得到 设备照片
         * @return
         */
        public String getPhoto() {
                return photo;
        }
        /**
         * 设置 设备照片
         * @param photo
         */
        public void setPhoto(String photo) {
                this.photo = photo;
        }
    
                

        
        @ApiModelProperty(name = "Photo2", value = "设备照片2")
        private String photo2;
        /**
         * 得到 设备照片2
         * @return
         */
        public String getPhoto2() {
                return photo2;
        }
        /**
         * 设置 设备照片2
         * @param photo2
         */
        public void setPhoto2(String photo2) {
                this.photo2 = photo2;
        }
    
                

        
        @ApiModelProperty(name = "ProductiveTime", value = "生产时间")
        private String productiveTime;
        /**
         * 得到 生产时间
         * @return
         */
        public String getProductiveTime() {
                return productiveTime;
        }
        /**
         * 设置 生产时间
         * @param productiveTime
         */
        public void setProductiveTime(String productiveTime) {
                this.productiveTime = productiveTime;
        }
    
                

        
        @ApiModelProperty(name = "SN", value = "设备序列号")
        private String sN;
        /**
         * 得到 设备序列号
         * @return
         */
        public String getSN() {
                return sN;
        }
        /**
         * 设置 设备序列号
         * @param sN
         */
        public void setSN(String sN) {
                this.sN = sN;
        }
    
                

        
        @ApiModelProperty(name = "Status", value = "状态（0注销，1在用）")
        private Integer status;
        /**
         * 得到 状态（0注销，1在用）
         * @return
         */
        public Integer getStatus() {
                return status;
        }
        /**
         * 设置 状态（0注销，1在用）
         * @param status
         */
        public void setStatus(Integer status) {
                this.status = status;
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
    
                

        
        @ApiModelProperty(name = "UserAndLocation", value = "使用者及位置")
        private String userAndLocation;
        /**
         * 得到 使用者及位置
         * @return
         */
        public String getUserAndLocation() {
                return userAndLocation;
        }
        /**
         * 设置 使用者及位置
         * @param userAndLocation
         */
        public void setUserAndLocation(String userAndLocation) {
                this.userAndLocation = userAndLocation;
        }
    
                

        
        @ApiModelProperty(name = "UserID", value = "添加人")
        private Integer userID;
        /**
         * 得到 添加人
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 添加人
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }
    
                

        
        @ApiModelProperty(name = "UseType", value = "使用类型")
        private String useType;
        /**
         * 得到 使用类型
         * @return
         */
        public String getUseType() {
                return useType;
        }
        /**
         * 设置 使用类型
         * @param useType
         */
        public void setUseType(String useType) {
                this.useType = useType;
        }
    

}
