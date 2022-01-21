package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class CatParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "AddUserID", value = "添加用户 ID")
        private Integer addUserID;
        /**
         * 得到 添加用户 ID
         * @return
         */
        public Integer getAddUserID() {
                return addUserID;
        }
        /**
         * 设置 添加用户 ID
         * @param addUserID
         */
        public void setAddUserID(Integer addUserID) {
                this.addUserID = addUserID;
        }
    
                

        
        @ApiModelProperty(name = "CatName", value = "分类名称")
        private String catName;
        /**
         * 得到 分类名称
         * @return
         */
        public String getCatName() {
                return catName;
        }
        /**
         * 设置 分类名称
         * @param catName
         */
        public void setCatName(String catName) {
                this.catName = catName;
        }
    
                

        
        @ApiModelProperty(name = "Description", value = "分类描述")
        private String description;
        /**
         * 得到 分类描述
         * @return
         */
        public String getDescription() {
                return description;
        }
        /**
         * 设置 分类描述
         * @param description
         */
        public void setDescription(String description) {
                this.description = description;
        }
    
                

        
        @ApiModelProperty(name = "EntID", value = "企业 ID(0为系统，其他为企业级 ID)")
        private Integer entID;
        /**
         * 得到 企业 ID(0为系统，其他为企业级 ID)
         * @return
         */
        public Integer getEntID() {
                return entID;
        }
        /**
         * 设置 企业 ID(0为系统，其他为企业级 ID)
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
    
                

        
        @ApiModelProperty(name = "ParentID", value = "分类父节点")
        private Integer parentID;
        /**
         * 得到 分类父节点
         * @return
         */
        public Integer getParentID() {
                return parentID;
        }
        /**
         * 设置 分类父节点
         * @param parentID
         */
        public void setParentID(Integer parentID) {
                this.parentID = parentID;
        }
    
                

        
        @ApiModelProperty(name = "Type", value = "分类种类 key")
        private String type;
        /**
         * 得到 分类种类 key
         * @return
         */
        public String getType() {
                return type;
        }
        /**
         * 设置 分类种类 key
         * @param type
         */
        public void setType(String type) {
                this.type = type;
        }
    

}
