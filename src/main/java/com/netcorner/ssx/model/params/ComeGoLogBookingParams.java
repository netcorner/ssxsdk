package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class ComeGoLogBookingParams {

        @ApiModelProperty(name = "UserID", value = "人员ID(访客为0)",required = true)
        private Integer userID;

        @ApiModelProperty(name = "EntID", value = "所在企业 ID",required = true)
        private Integer entID;

        @ApiModelProperty(name = "GetLat", value = "获取纬度",required = true)
        private String getLat;

        @ApiModelProperty(name = "GetLon", value = "获取经度",required = true)
        private String getLon;



        @ApiModelProperty(name = "Name", value = "姓名",required = true)
        private String name;



        @ApiModelProperty(name = "BookingType", value = "打卡类型",required = true)
        private String bookingType;

        @ApiModelProperty(name = "BookingTypeName", value = "打卡类型名称",required = true)
        private String bookingTypeName;


        @ApiModelProperty(name = "TargetLocation", value = "目的地")
        private String targetLocation;


        @ApiModelProperty(name = "Description", value = "备注")
        private String description;



        @ApiModelProperty(name = "Photo", value = "照片")
        private String photo;

        @ApiModelProperty(name = "Mobile", value = "手机号码")
        private String mobile;


        @ApiModelProperty(name = "OpenID", value = "微信 openid",required = true)
        private String openID;

        @ApiModelProperty(name = "AppID", value = "应用 ID",required = true)
        private String appID;

        @ApiModelProperty(name = "UnionID", value = "UnionID",required = true)
        private String unionID;
        @ApiModelProperty(name = "Type", value = "类型（1访客2员工）",required = true)
        private String type;


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


        public String getBookingType() {
                return bookingType;
        }

        public void setBookingType(String bookingType) {
                this.bookingType = bookingType;
        }

        public String getBookingTypeName() {
                return bookingTypeName;
        }

        public void setBookingTypeName(String bookingTypeName) {
                this.bookingTypeName = bookingTypeName;
        }

        public String getTargetLocation() {
                return targetLocation;
        }

        public void setTargetLocation(String targetLocation) {
                this.targetLocation = targetLocation;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getPhoto() {
                return photo;
        }

        public void setPhoto(String photo) {
                this.photo = photo;
        }

        public String getMobile() {
                return mobile;
        }

        public void setMobile(String mobile) {
                this.mobile = mobile;
        }

        public String getOpenID() {
                return openID;
        }

        public void setOpenID(String openID) {
                this.openID = openID;
        }

        public String getAppID() {
                return appID;
        }

        public void setAppID(String appID) {
                this.appID = appID;
        }

        public String getUnionID() {
                return unionID;
        }

        public void setUnionID(String unionID) {
                this.unionID = unionID;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

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
    
                

        

                

        

    

}
