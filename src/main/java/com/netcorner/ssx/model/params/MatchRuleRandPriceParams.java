package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class MatchRuleRandPriceParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "ServiceName", value = "服务名称")
        private String serviceName;
        /**
         * 得到 服务名称
         * @return
         */
        public String getServiceName() {
                return serviceName;
        }
        /**
         * 设置 服务名称
         * @param serviceName
         */
        public void setServiceName(String serviceName) {
                this.serviceName = serviceName;
        }
    
                

        
        @ApiModelProperty(name = "Price", value = "价格")
        private Integer price;
        /**
         * 得到 价格
         * @return
         */
        public Integer getPrice() {
                return price;
        }
        /**
         * 设置 价格
         * @param price
         */
        public void setPrice(Integer price) {
                this.price = price;
        }
    

}
