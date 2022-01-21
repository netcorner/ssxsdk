package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EnterpriseBindParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "BindEntID1", value = "绑定企业1")
        private Integer bindEntID1;
        /**
         * 得到 绑定企业1
         * @return
         */
        public Integer getBindEntID1() {
                return bindEntID1;
        }
        /**
         * 设置 绑定企业1
         * @param bindEntID1
         */
        public void setBindEntID1(Integer bindEntID1) {
                this.bindEntID1 = bindEntID1;
        }
    
                

        
        @ApiModelProperty(name = "BindEntID2", value = "绑定企业2")
        private Integer bindEntID2;
        /**
         * 得到 绑定企业2
         * @return
         */
        public Integer getBindEntID2() {
                return bindEntID2;
        }
        /**
         * 设置 绑定企业2
         * @param bindEntID2
         */
        public void setBindEntID2(Integer bindEntID2) {
                this.bindEntID2 = bindEntID2;
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
    
                

        

                

        
        @ApiModelProperty(name = "BindEntName1", value = "绑定企业名称1")
        private String bindEntName1;
        /**
         * 得到 绑定企业名称1
         * @return
         */
        public String getBindEntName1() {
                return bindEntName1;
        }
        /**
         * 设置 绑定企业名称1
         * @param bindEntName1
         */
        public void setBindEntName1(String bindEntName1) {
                this.bindEntName1 = bindEntName1;
        }
    
                

        
        @ApiModelProperty(name = "BindEntName2", value = "绑定企业名称2")
        private String bindEntName2;
        /**
         * 得到 绑定企业名称2
         * @return
         */
        public String getBindEntName2() {
                return bindEntName2;
        }
        /**
         * 设置 绑定企业名称2
         * @param bindEntName2
         */
        public void setBindEntName2(String bindEntName2) {
                this.bindEntName2 = bindEntName2;
        }
    
                

        
        @ApiModelProperty(name = "Type", value = "绑定类型")
        private String type;
        /**
         * 得到 绑定类型
         * @return
         */
        public String getType() {
                return type;
        }
        /**
         * 设置 绑定类型
         * @param type
         */
        public void setType(String type) {
                this.type = type;
        }
    

}
