package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class UserRoleSettingParams {



        @ApiModelProperty(name = "UserRoleID", value = "用户角色ID", required = true)
        private int userRoleID;

        @ApiModelProperty(name = "SettingKey", value = " 设置用户角色的 key", required = true)
        private String settingKey;

        @ApiModelProperty(name = "SettingValue", value = "设置用户角色的值", required = true)
        private String settingValue;


        public int getUserRoleID() {
                return userRoleID;
        }

        public void setUserRoleID(int userRoleID) {
                this.userRoleID = userRoleID;
        }

        public String getSettingKey() {
                return settingKey;
        }

        public void setSettingKey(String settingKey) {
                this.settingKey = settingKey;
        }

        public String getSettingValue() {
                return settingValue;
        }

        public void setSettingValue(String settingValue) {
                this.settingValue = settingValue;
        }
}
