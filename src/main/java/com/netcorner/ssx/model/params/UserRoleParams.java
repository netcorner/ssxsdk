package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class UserRoleParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "UserID", value = "用户ID")
        private Integer userID;
        /**
         * 得到 用户ID
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 用户ID
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }
    
                

        
        @ApiModelProperty(name = "RoleID", value = "角色ID")
        private Integer roleID;
        /**
         * 得到 角色ID
         * @return
         */
        public Integer getRoleID() {
                return roleID;
        }
        /**
         * 设置 角色ID
         * @param roleID
         */
        public void setRoleID(Integer roleID) {
                this.roleID = roleID;
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
    
                

        
        @ApiModelProperty(name = "IPLimit", value = "限定的 ID 登录用户，空为不限制，多个用逗号分开")
        private String iPLimit;
        /**
         * 得到 限定的 ID 登录用户，空为不限制，多个用逗号分开
         * @return
         */
        public String getIPLimit() {
                return iPLimit;
        }
        /**
         * 设置 限定的 ID 登录用户，空为不限制，多个用逗号分开
         * @param iPLimit
         */
        public void setIPLimit(String iPLimit) {
                this.iPLimit = iPLimit;
        }
    
                

        
        @ApiModelProperty(name = "AsName", value = "别名")
        private String asName;
        /**
         * 得到 别名
         * @return
         */
        public String getAsName() {
                return asName;
        }
        /**
         * 设置 别名
         * @param asName
         */
        public void setAsName(String asName) {
                this.asName = asName;
        }
    
                

        
        @ApiModelProperty(name = "EntName", value = "所在企业名称")
        private String entName;
        /**
         * 得到 所在企业名称
         * @return
         */
        public String getEntName() {
                return entName;
        }
        /**
         * 设置 所在企业名称
         * @param entName
         */
        public void setEntName(String entName) {
                this.entName = entName;
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
