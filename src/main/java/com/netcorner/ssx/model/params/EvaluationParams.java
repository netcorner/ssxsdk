package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EvaluationParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "TargetID", value = "被评价的对象")
        private Integer targetID;
        /**
         * 得到 被评价的对象
         * @return
         */
        public Integer getTargetID() {
                return targetID;
        }
        /**
         * 设置 被评价的对象
         * @param targetID
         */
        public void setTargetID(Integer targetID) {
                this.targetID = targetID;
        }
    
                

        
        @ApiModelProperty(name = "EvaluationUserID", value = "评价人")
        private Integer evaluationUserID;
        /**
         * 得到 评价人
         * @return
         */
        public Integer getEvaluationUserID() {
                return evaluationUserID;
        }
        /**
         * 设置 评价人
         * @param evaluationUserID
         */
        public void setEvaluationUserID(Integer evaluationUserID) {
                this.evaluationUserID = evaluationUserID;
        }
    
                

        
        @ApiModelProperty(name = "Grade", value = "打分（满意（+2），一般（0），不满意（-2））")
        private Integer grade;
        /**
         * 得到 打分（满意（+2），一般（0），不满意（-2））
         * @return
         */
        public Integer getGrade() {
                return grade;
        }
        /**
         * 设置 打分（满意（+2），一般（0），不满意（-2））
         * @param grade
         */
        public void setGrade(Integer grade) {
                this.grade = grade;
        }
    
                

        
        @ApiModelProperty(name = "Description", value = "评价文字备注")
        private String description;
        /**
         * 得到 评价文字备注
         * @return
         */
        public String getDescription() {
                return description;
        }
        /**
         * 设置 评价文字备注
         * @param description
         */
        public void setDescription(String description) {
                this.description = description;
        }
    
                

        
        @ApiModelProperty(name = "TagList", value = "标签汇总")
        private String tagList;
        /**
         * 得到 标签汇总
         * @return
         */
        public String getTagList() {
                return tagList;
        }
        /**
         * 设置 标签汇总
         * @param tagList
         */
        public void setTagList(String tagList) {
                this.tagList = tagList;
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
    
                

        
        @ApiModelProperty(name = "ServiceID", value = "服务的 项目 ID")
        private String serviceID;
        /**
         * 得到 服务的 项目 ID
         * @return
         */
        public String getServiceID() {
                return serviceID;
        }
        /**
         * 设置 服务的 项目 ID
         * @param serviceID
         */
        public void setServiceID(String serviceID) {
                this.serviceID = serviceID;
        }
    
                

        
        @ApiModelProperty(name = "TargetUserRoleID", value = "被评价的对象用户角色 ID")
        private Integer targetUserRoleID;
        /**
         * 得到 被评价的对象用户角色 ID
         * @return
         */
        public Integer getTargetUserRoleID() {
                return targetUserRoleID;
        }
        /**
         * 设置 被评价的对象用户角色 ID
         * @param targetUserRoleID
         */
        public void setTargetUserRoleID(Integer targetUserRoleID) {
                this.targetUserRoleID = targetUserRoleID;
        }
    
                

        
        @ApiModelProperty(name = "EvaluationUserRoleID", value = "评价人用户角色ID")
        private Integer evaluationUserRoleID;
        /**
         * 得到 评价人用户角色ID
         * @return
         */
        public Integer getEvaluationUserRoleID() {
                return evaluationUserRoleID;
        }
        /**
         * 设置 评价人用户角色ID
         * @param evaluationUserRoleID
         */
        public void setEvaluationUserRoleID(Integer evaluationUserRoleID) {
                this.evaluationUserRoleID = evaluationUserRoleID;
        }
    

}
