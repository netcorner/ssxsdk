package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class BuildingParams {


    
                

        
        @ApiModelProperty(name = "Address", value = "单位地址")
        private String address;
        /**
         * 得到 单位地址
         * @return
         */
        public String getAddress() {
                return address;
        }
        /**
         * 设置 单位地址
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
    
                

        
        @ApiModelProperty(name = "AreaID", value = "区域 ID")
        private String areaID;
        /**
         * 得到 区域 ID
         * @return
         */
        public String getAreaID() {
                return areaID;
        }
        /**
         * 设置 区域 ID
         * @param areaID
         */
        public void setAreaID(String areaID) {
                this.areaID = areaID;
        }
    
                

        
        @ApiModelProperty(name = "AreaName", value = "区域名称")
        private String areaName;
        /**
         * 得到 区域名称
         * @return
         */
        public String getAreaName() {
                return areaName;
        }
        /**
         * 设置 区域名称
         * @param areaName
         */
        public void setAreaName(String areaName) {
                this.areaName = areaName;
        }
    
                

        
        @ApiModelProperty(name = "Contact", value = "联系人")
        private String contact;
        /**
         * 得到 联系人
         * @return
         */
        public String getContact() {
                return contact;
        }
        /**
         * 设置 联系人
         * @param contact
         */
        public void setContact(String contact) {
                this.contact = contact;
        }
    
                

        
        @ApiModelProperty(name = "DeleteTime", value = "删除时间")
        private Date deleteTime;
        /**
         * 得到 删除时间
         * @return
         */
        public Date getDeleteTime() {
                return deleteTime;
        }
        /**
         * 设置 删除时间
         * @param deleteTime
         */
        public void setDeleteTime(Date deleteTime) {
                this.deleteTime = deleteTime;
        }
    
                

        
        @ApiModelProperty(name = "DeleteUserID", value = "删除用户")
        private Integer deleteUserID;
        /**
         * 得到 删除用户
         * @return
         */
        public Integer getDeleteUserID() {
                return deleteUserID;
        }
        /**
         * 设置 删除用户
         * @param deleteUserID
         */
        public void setDeleteUserID(Integer deleteUserID) {
                this.deleteUserID = deleteUserID;
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
    
                

        
        @ApiModelProperty(name = "IsDeleted", value = "是否删除（1，0）")
        private Integer isDeleted;
        /**
         * 得到 是否删除（1，0）
         * @return
         */
        public Integer getIsDeleted() {
                return isDeleted;
        }
        /**
         * 设置 是否删除（1，0）
         * @param isDeleted
         */
        public void setIsDeleted(Integer isDeleted) {
                this.isDeleted = isDeleted;
        }
    
                

        
        @ApiModelProperty(name = "Name", value = "单位名称")
        private String name;
        /**
         * 得到 单位名称
         * @return
         */
        public String getName() {
                return name;
        }
        /**
         * 设置 单位名称
         * @param name
         */
        public void setName(String name) {
                this.name = name;
        }
    
                

        
        @ApiModelProperty(name = "ParentID", value = "上级目录（0顶级，其他值为上级的企业 ID）")
        private Integer parentID;
        /**
         * 得到 上级目录（0顶级，其他值为上级的企业 ID）
         * @return
         */
        public Integer getParentID() {
                return parentID;
        }
        /**
         * 设置 上级目录（0顶级，其他值为上级的企业 ID）
         * @param parentID
         */
        public void setParentID(Integer parentID) {
                this.parentID = parentID;
        }
    
                

        
        @ApiModelProperty(name = "Photo", value = "首张照片")
        private String photo;
        /**
         * 得到 首张照片
         * @return
         */
        public String getPhoto() {
                return photo;
        }
        /**
         * 设置 首张照片
         * @param photo
         */
        public void setPhoto(String photo) {
                this.photo = photo;
        }
    
                

        
        @ApiModelProperty(name = "RegLat", value = "注册时的纬度")
        private String regLat;
        /**
         * 得到 注册时的纬度
         * @return
         */
        public String getRegLat() {
                return regLat;
        }
        /**
         * 设置 注册时的纬度
         * @param regLat
         */
        public void setRegLat(String regLat) {
                this.regLat = regLat;
        }
    
                

        
        @ApiModelProperty(name = "RegLon", value = "注册时的经度")
        private String regLon;
        /**
         * 得到 注册时的经度
         * @return
         */
        public String getRegLon() {
                return regLon;
        }
        /**
         * 设置 注册时的经度
         * @param regLon
         */
        public void setRegLon(String regLon) {
                this.regLon = regLon;
        }
    
                

        
        @ApiModelProperty(name = "RoleKey", value = "角色类型")
        private String roleKey;
        /**
         * 得到 角色类型
         * @return
         */
        public String getRoleKey() {
                return roleKey;
        }
        /**
         * 设置 角色类型
         * @param roleKey
         */
        public void setRoleKey(String roleKey) {
                this.roleKey = roleKey;
        }
    
                

        
        @ApiModelProperty(name = "RoomID", value = "聊天室 ID")
        private Integer roomID;
        /**
         * 得到 聊天室 ID
         * @return
         */
        public Integer getRoomID() {
                return roomID;
        }
        /**
         * 设置 聊天室 ID
         * @param roomID
         */
        public void setRoomID(Integer roomID) {
                this.roomID = roomID;
        }
    
                

        
        @ApiModelProperty(name = "UserID", value = "绑定注册的用户")
        private Integer userID;
        /**
         * 得到 绑定注册的用户
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 绑定注册的用户
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }
    

}
