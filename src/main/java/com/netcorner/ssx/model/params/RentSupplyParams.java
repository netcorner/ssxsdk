package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class  RentSupplyParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "RentMoney", value = "租房金额（元/月）")
        private Integer rentMoney;
        /**
         * 得到 租房金额（元/月）
         * @return
         */
        public Integer getRentMoney() {
                return rentMoney;
        }
        /**
         * 设置 租房金额（元/月）
         * @param rentMoney
         */
        public void setRentMoney(Integer rentMoney) {
                this.rentMoney = rentMoney;
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
    

}
