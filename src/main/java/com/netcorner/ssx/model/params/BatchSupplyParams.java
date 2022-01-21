package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class BatchSupplyParams {
        @ApiModelProperty(name = "entID", value = "企业ID(管理员进行修改使用带入)")
        private String entID;

        @ApiModelProperty(name = "id", value = "id")
        private String[] id;
        @ApiModelProperty(name = "label", value = "备注标签")
        private String[] label;
        @ApiModelProperty(name = "description", value = "备注")
        private String[] description;
        @ApiModelProperty(name = "serviceID", value = "服务 ID")
        private String[] serviceID;
        @ApiModelProperty(name = "serviceName", value = "服务名称")
        private String[] serviceName;
        @ApiModelProperty(name = "totalMoney", value = "服务名称")
        private String[] totalMoney;
        @ApiModelProperty(name = "photo", value = "服务名称")
        private String[] photo;

        public String getEntID() {
                return entID;
        }

        public void setEntID(String entID) {
                this.entID = entID;
        }

        public String[] getLabel() {
                return label;
        }

        public void setLabel(String[] label) {
                this.label = label;
        }

        public String[] getDescription() {
                return description;
        }

        public void setDescription(String[] description) {
                this.description = description;
        }

        public String[] getServiceID() {
                return serviceID;
        }

        public void setServiceID(String[] serviceID) {
                this.serviceID = serviceID;
        }

        public String[] getServiceName() {
                return serviceName;
        }

        public void setServiceName(String[] serviceName) {
                this.serviceName = serviceName;
        }

        public String[] getTotalMoney() {
                return totalMoney;
        }

        public void setTotalMoney(String[] totalMoney) {
                this.totalMoney = totalMoney;
        }

        public String[] getPhoto() {
                return photo;
        }

        public void setPhoto(String[] photo) {
                this.photo = photo;
        }

        public String[] getId() {
                return id;
        }

        public void setId(String[] id) {
                this.id = id;
        }
}
