package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EnterpriseAppParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "AddUserID", value = "添加人员 ID")
        private Integer addUserID;
        /**
         * 得到 添加人员 ID
         * @return
         */
        public Integer getAddUserID() {
                return addUserID;
        }
        /**
         * 设置 添加人员 ID
         * @param addUserID
         */
        public void setAddUserID(Integer addUserID) {
                this.addUserID = addUserID;
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
    
                

        
        @ApiModelProperty(name = "MarketAppID", value = "应用ID")
        private Integer marketAppID;
        /**
         * 得到 应用ID
         * @return
         */
        public Integer getMarketAppID() {
                return marketAppID;
        }
        /**
         * 设置 应用ID
         * @param marketAppID
         */
        public void setMarketAppID(Integer marketAppID) {
                this.marketAppID = marketAppID;
        }
    

}
