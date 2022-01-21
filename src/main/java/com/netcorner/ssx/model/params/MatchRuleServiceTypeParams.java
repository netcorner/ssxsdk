package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class MatchRuleServiceTypeParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "MatchRuleID", value = "配对规则类型 ID")
        private Integer matchRuleID;
        /**
         * 得到 配对规则类型 ID
         * @return
         */
        public Integer getMatchRuleID() {
                return matchRuleID;
        }
        /**
         * 设置 配对规则类型 ID
         * @param matchRuleID
         */
        public void setMatchRuleID(Integer matchRuleID) {
                this.matchRuleID = matchRuleID;
        }
    
                

        
        @ApiModelProperty(name = "ServiceID", value = "服务类型")
        private String serviceID;
        /**
         * 得到 服务类型
         * @return
         */
        public String getServiceID() {
                return serviceID;
        }
        /**
         * 设置 服务类型
         * @param serviceID
         */
        public void setServiceID(String serviceID) {
                this.serviceID = serviceID;
        }
    
                

        
        @ApiModelProperty(name = "MatchWay", value = "配对方式（1关键词，2POI类型）")
        private Integer matchWay;
        /**
         * 得到 配对方式（1关键词，2POI类型）
         * @return
         */
        public Integer getMatchWay() {
                return matchWay;
        }
        /**
         * 设置 配对方式（1关键词，2POI类型）
         * @param matchWay
         */
        public void setMatchWay(Integer matchWay) {
                this.matchWay = matchWay;
        }
    

}
