package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class UserDepositLogsParams {


    
                

        
        @ApiModelProperty(name = "AddTime", value = "操作时间")
        private Date addTime;
        /**
         * 得到 操作时间
         * @return
         */
        public Date getAddTime() {
                return addTime;
        }
        /**
         * 设置 操作时间
         * @param addTime
         */
        public void setAddTime(Date addTime) {
                this.addTime = addTime;
        }
    
                

        
        @ApiModelProperty(name = "Body", value = "交易内容")
        private String body;
        /**
         * 得到 交易内容
         * @return
         */
        public String getBody() {
                return body;
        }
        /**
         * 设置 交易内容
         * @param body
         */
        public void setBody(String body) {
                this.body = body;
        }
    
                

        
        @ApiModelProperty(name = "DepositMoney", value = "充值金额（分）")
        private Integer depositMoney;
        /**
         * 得到 充值金额（分）
         * @return
         */
        public Integer getDepositMoney() {
                return depositMoney;
        }
        /**
         * 设置 充值金额（分）
         * @param depositMoney
         */
        public void setDepositMoney(Integer depositMoney) {
                this.depositMoney = depositMoney;
        }
    
                

        
        @ApiModelProperty(name = "DepositTime", value = "完成充值时间")
        private Date depositTime;
        /**
         * 得到 完成充值时间
         * @return
         */
        public Date getDepositTime() {
                return depositTime;
        }
        /**
         * 设置 完成充值时间
         * @param depositTime
         */
        public void setDepositTime(Date depositTime) {
                this.depositTime = depositTime;
        }
    
                

        
        @ApiModelProperty(name = "DepositWay", value = "充值方式(1微信,2支付宝)")
        private Integer depositWay;
        /**
         * 得到 充值方式(1微信,2支付宝)
         * @return
         */
        public Integer getDepositWay() {
                return depositWay;
        }
        /**
         * 设置 充值方式(1微信,2支付宝)
         * @param depositWay
         */
        public void setDepositWay(Integer depositWay) {
                this.depositWay = depositWay;
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
    
                

        
        @ApiModelProperty(name = "OpenID", value = "微信开放 ID")
        private String openID;
        /**
         * 得到 微信开放 ID
         * @return
         */
        public String getOpenID() {
                return openID;
        }
        /**
         * 设置 微信开放 ID
         * @param openID
         */
        public void setOpenID(String openID) {
                this.openID = openID;
        }
    
                

        
        @ApiModelProperty(name = "Status", value = "充值状态（1成功，0充值中，-1失败）")
        private Integer status;
        /**
         * 得到 充值状态（1成功，0充值中，-1失败）
         * @return
         */
        public Integer getStatus() {
                return status;
        }
        /**
         * 设置 充值状态（1成功，0充值中，-1失败）
         * @param status
         */
        public void setStatus(Integer status) {
                this.status = status;
        }
    
                

        
        @ApiModelProperty(name = "TradeNO", value = "交易流水号（支付平台提供的）")
        private String tradeNO;
        /**
         * 得到 交易流水号（支付平台提供的）
         * @return
         */
        public String getTradeNO() {
                return tradeNO;
        }
        /**
         * 设置 交易流水号（支付平台提供的）
         * @param tradeNO
         */
        public void setTradeNO(String tradeNO) {
                this.tradeNO = tradeNO;
        }
    
                

        
        @ApiModelProperty(name = "TransactionID", value = "交易 ID")
        private String transactionID;
        /**
         * 得到 交易 ID
         * @return
         */
        public String getTransactionID() {
                return transactionID;
        }
        /**
         * 设置 交易 ID
         * @param transactionID
         */
        public void setTransactionID(String transactionID) {
                this.transactionID = transactionID;
        }
    
                

        
        @ApiModelProperty(name = "UserID", value = "充值人")
        private Integer userID;
        /**
         * 得到 充值人
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 充值人
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }
    

}
