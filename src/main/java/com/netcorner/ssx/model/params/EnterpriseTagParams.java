package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EnterpriseTagParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "AddUserID", value = "添加人")
        private Integer addUserID;
        /**
         * 得到 添加人
         * @return
         */
        public Integer getAddUserID() {
                return addUserID;
        }
        /**
         * 设置 添加人
         * @param addUserID
         */
        public void setAddUserID(Integer addUserID) {
                this.addUserID = addUserID;
        }
    
                

        
        @ApiModelProperty(name = "Description", value = "绑定备注")
        private String description;
        /**
         * 得到 绑定备注
         * @return
         */
        public String getDescription() {
                return description;
        }
        /**
         * 设置 绑定备注
         * @param description
         */
        public void setDescription(String description) {
                this.description = description;
        }
    
                

        
        @ApiModelProperty(name = "EntID", value = "企业 ID")
        private Integer entID;
        /**
         * 得到 企业 ID
         * @return
         */
        public Integer getEntID() {
                return entID;
        }
        /**
         * 设置 企业 ID
         * @param entID
         */
        public void setEntID(Integer entID) {
                this.entID = entID;
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
    
                

        
        @ApiModelProperty(name = "TagID", value = "标签 ID")
        private Integer tagID;
        /**
         * 得到 标签 ID
         * @return
         */
        public Integer getTagID() {
                return tagID;
        }
        /**
         * 设置 标签 ID
         * @param tagID
         */
        public void setTagID(Integer tagID) {
                this.tagID = tagID;
        }
    

}
