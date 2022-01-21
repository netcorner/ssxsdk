package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EnterpriseTagBindParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "TagedID", value = "被绑定绑定标签 ID")
        private Integer tagedID;
        /**
         * 得到 被绑定绑定标签 ID
         * @return
         */
        public Integer getTagedID() {
                return tagedID;
        }
        /**
         * 设置 被绑定绑定标签 ID
         * @param tagedID
         */
        public void setTagedID(Integer tagedID) {
                this.tagedID = tagedID;
        }
    
                

        
        @ApiModelProperty(name = "TagedName", value = "被绑定绑定标签 ID")
        private String tagedName;
        /**
         * 得到 被绑定绑定标签 ID
         * @return
         */
        public String getTagedName() {
                return tagedName;
        }
        /**
         * 设置 被绑定绑定标签 ID
         * @param tagedName
         */
        public void setTagedName(String tagedName) {
                this.tagedName = tagedName;
        }
    
                

        
        @ApiModelProperty(name = "TagID", value = "绑定标签 ID")
        private Integer tagID;
        /**
         * 得到 绑定标签 ID
         * @return
         */
        public Integer getTagID() {
                return tagID;
        }
        /**
         * 设置 绑定标签 ID
         * @param tagID
         */
        public void setTagID(Integer tagID) {
                this.tagID = tagID;
        }
    
                

        
        @ApiModelProperty(name = "TagName", value = "绑定标签 名称")
        private String tagName;
        /**
         * 得到 绑定标签 名称
         * @return
         */
        public String getTagName() {
                return tagName;
        }
        /**
         * 设置 绑定标签 名称
         * @param tagName
         */
        public void setTagName(String tagName) {
                this.tagName = tagName;
        }
    
                

        
        @ApiModelProperty(name = "UserID", value = "添加用户")
        private Integer userID;
        /**
         * 得到 添加用户
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 添加用户
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }
    

}
