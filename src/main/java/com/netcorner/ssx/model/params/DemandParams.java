package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class DemandParams {




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
    
                

        
        @ApiModelProperty(name = "Prov", value = "发布国家")
        private String prov;
        /**
         * 得到 发布国家
         * @return
         */
        public String getProv() {
                return prov;
        }
        /**
         * 设置 发布国家
         * @param prov
         */
        public void setProv(String prov) {
                this.prov = prov;
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
        private double addrLat;
        /**
         * 得到 发布小区纬度
         * @return
         */
        public double getAddrLat() {
                return addrLat;
        }
        /**
         * 设置 发布小区纬度
         * @param addrLat
         */
        public void setAddrLat(double addrLat) {
                this.addrLat = addrLat;
        }
    
                

        
        @ApiModelProperty(name = "AddrLng", value = "发布小区经度")
        private double addrLng;
        /**
         * 得到 发布小区经度
         * @return
         */
        public double getAddrLng() {
                return addrLng;
        }
        /**
         * 设置 发布小区经度
         * @param addrLng
         */
        public void setAddrLng(double addrLng) {
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
    

}
