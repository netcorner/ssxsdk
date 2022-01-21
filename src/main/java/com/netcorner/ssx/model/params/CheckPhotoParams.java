package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class CheckPhotoParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "AddUserName", value = "添加人名称")
        private String addUserName;
        /**
         * 得到 添加人名称
         * @return
         */
        public String getAddUserName() {
                return addUserName;
        }
        /**
         * 设置 添加人名称
         * @param addUserName
         */
        public void setAddUserName(String addUserName) {
                this.addUserName = addUserName;
        }
    
                

        
        @ApiModelProperty(name = "CheckedRate", value = "检出率")
        private String checkedRate;
        /**
         * 得到 检出率
         * @return
         */
        public String getCheckedRate() {
                return checkedRate;
        }
        /**
         * 设置 检出率
         * @param checkedRate
         */
        public void setCheckedRate(String checkedRate) {
                this.checkedRate = checkedRate;
        }
    
                

        
        @ApiModelProperty(name = "CheckedTotal", value = "被检出的张数")
        private Integer checkedTotal;
        /**
         * 得到 被检出的张数
         * @return
         */
        public Integer getCheckedTotal() {
                return checkedTotal;
        }
        /**
         * 设置 被检出的张数
         * @param checkedTotal
         */
        public void setCheckedTotal(Integer checkedTotal) {
                this.checkedTotal = checkedTotal;
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
    
                

        
        @ApiModelProperty(name = "EntID", value = "添加所属单位")
        private Integer entID;
        /**
         * 得到 添加所属单位
         * @return
         */
        public Integer getEntID() {
                return entID;
        }
        /**
         * 设置 添加所属单位
         * @param entID
         */
        public void setEntID(Integer entID) {
                this.entID = entID;
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
    
                

        
        @ApiModelProperty(name = "Title", value = "标题")
        private String title;
        /**
         * 得到 标题
         * @return
         */
        public String getTitle() {
                return title;
        }
        /**
         * 设置 标题
         * @param title
         */
        public void setTitle(String title) {
                this.title = title;
        }
    
                

        
        @ApiModelProperty(name = "Total", value = "上传张数")
        private Integer total;
        /**
         * 得到 上传张数
         * @return
         */
        public Integer getTotal() {
                return total;
        }
        /**
         * 设置 上传张数
         * @param total
         */
        public void setTotal(Integer total) {
                this.total = total;
        }
    
                

        
        @ApiModelProperty(name = "Type", value = "类型（1人脸，2牌照）")
        private Integer type;
        /**
         * 得到 类型（1人脸，2牌照）
         * @return
         */
        public Integer getType() {
                return type;
        }
        /**
         * 设置 类型（1人脸，2牌照）
         * @param type
         */
        public void setType(Integer type) {
                this.type = type;
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
    

}
