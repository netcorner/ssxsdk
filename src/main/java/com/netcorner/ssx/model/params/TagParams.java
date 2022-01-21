package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class TagParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "Type", value = "类型")
        private String type;
        /**
         * 得到 类型
         * @return
         */
        public String getType() {
                return type;
        }
        /**
         * 设置 类型
         * @param type
         */
        public void setType(String type) {
                this.type = type;
        }
    
                

        
        @ApiModelProperty(name = "TagName", value = "名称")
        private String tagName;
        /**
         * 得到 名称
         * @return
         */
        public String getTagName() {
                return tagName;
        }
        /**
         * 设置 名称
         * @param tagName
         */
        public void setTagName(String tagName) {
                this.tagName = tagName;
        }
    
                

        
        @ApiModelProperty(name = "Model", value = "模块名称")
        private String model;
        /**
         * 得到 模块名称
         * @return
         */
        public String getModel() {
                return model;
        }
        /**
         * 设置 模块名称
         * @param model
         */
        public void setModel(String model) {
                this.model = model;
        }
    
                

        
        @ApiModelProperty(name = "UpdateTime", value = "")
        private Date updateTime;
        /**
         * 得到 
         * @return
         */
        public Date getUpdateTime() {
                return updateTime;
        }
        /**
         * 设置 
         * @param updateTime
         */
        public void setUpdateTime(Date updateTime) {
                this.updateTime = updateTime;
        }
    
                

        
        @ApiModelProperty(name = "UpdateUserID", value = "")
        private Integer updateUserID;
        /**
         * 得到 
         * @return
         */
        public Integer getUpdateUserID() {
                return updateUserID;
        }
        /**
         * 设置 
         * @param updateUserID
         */
        public void setUpdateUserID(Integer updateUserID) {
                this.updateUserID = updateUserID;
        }
    
                

        
        @ApiModelProperty(name = "AddUserID", value = "")
        private Integer addUserID;
        /**
         * 得到 
         * @return
         */
        public Integer getAddUserID() {
                return addUserID;
        }
        /**
         * 设置 
         * @param addUserID
         */
        public void setAddUserID(Integer addUserID) {
                this.addUserID = addUserID;
        }
    
                

        
        @ApiModelProperty(name = "AddTime", value = "")
        private Date addTime;
        /**
         * 得到 
         * @return
         */
        public Date getAddTime() {
                return addTime;
        }
        /**
         * 设置 
         * @param addTime
         */
        public void setAddTime(Date addTime) {
                this.addTime = addTime;
        }
    

}
