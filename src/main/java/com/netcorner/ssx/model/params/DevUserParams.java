package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class DevUserParams {






        @ApiModelProperty(name = "AppID", value = "应用 ID")
        private String appID;
        /**
         * 得到 应用 ID
         * @return
         */
        public String getAppID() {
                return appID;
        }
        /**
         * 设置 应用 ID
         * @param appID
         */
        public void setAppID(String appID) {
                this.appID = appID;
        }




        @ApiModelProperty(name = "AppSecret", value = "应用加密值")
        private String appSecret;
        /**
         * 得到 应用加密值
         * @return
         */
        public String getAppSecret() {
                return appSecret;
        }
        /**
         * 设置 应用加密值
         * @param appSecret
         */
        public void setAppSecret(String appSecret) {
                this.appSecret = appSecret;
        }




        @ApiModelProperty(name = "Description", value = "应用描述")
        private String description;
        /**
         * 得到 应用描述
         * @return
         */
        public String getDescription() {
                return description;
        }
        /**
         * 设置 应用描述
         * @param description
         */
        public void setDescription(String description) {
                this.description = description;
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




        @ApiModelProperty(name = "Key", value = "key 值（唯一值，主站虚拟目录名称）")
        private String key;
        /**
         * 得到 key 值（唯一值，主站虚拟目录名称）
         * @return
         */
        public String getKey() {
                return key;
        }
        /**
         * 设置 key 值（唯一值，主站虚拟目录名称）
         * @param key
         */
        public void setKey(String key) {
                this.key = key;
        }




        @ApiModelProperty(name = "ServerIP", value = "应用服务 IP")
        private String serverIP;
        /**
         * 得到 应用服务 IP
         * @return
         */
        public String getServerIP() {
                return serverIP;
        }
        /**
         * 设置 应用服务 IP
         * @param serverIP
         */
        public void setServerIP(String serverIP) {
                this.serverIP = serverIP;
        }




        @ApiModelProperty(name = "ServerPort", value = "端口号")
        private Integer serverPort;
        /**
         * 得到 端口号
         * @return
         */
        public Integer getServerPort() {
                return serverPort;
        }
        /**
         * 设置 端口号
         * @param serverPort
         */
        public void setServerPort(Integer serverPort) {
                this.serverPort = serverPort;
        }




        @ApiModelProperty(name = "Status", value = "状态")
        private Integer status;
        /**
         * 得到 状态
         * @return
         */
        public Integer getStatus() {
                return status;
        }
        /**
         * 设置 状态
         * @param status
         */
        public void setStatus(Integer status) {
                this.status = status;
        }




        @ApiModelProperty(name = "UserID", value = "申请的用户 ID")
        private Integer userID;
        /**
         * 得到 申请的用户 ID
         * @return
         */
        public Integer getUserID() {
                return userID;
        }
        /**
         * 设置 申请的用户 ID
         * @param userID
         */
        public void setUserID(Integer userID) {
                this.userID = userID;
        }


}
