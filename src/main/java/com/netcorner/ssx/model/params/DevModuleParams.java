package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class DevModuleParams {






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




        @ApiModelProperty(name = "Description", value = "描述")
        private String description;
        /**
         * 得到 描述
         * @return
         */
        public String getDescription() {
                return description;
        }
        /**
         * 设置 描述
         * @param description
         */
        public void setDescription(String description) {
                this.description = description;
        }




        @ApiModelProperty(name = "Icon", value = "图标")
        private String icon;
        /**
         * 得到 图标
         * @return
         */
        public String getIcon() {
                return icon;
        }
        /**
         * 设置 图标
         * @param icon
         */
        public void setIcon(String icon) {
                this.icon = icon;
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




        @ApiModelProperty(name = "ModuleName", value = "模块名")
        private String moduleName;
        /**
         * 得到 模块名
         * @return
         */
        public String getModuleName() {
                return moduleName;
        }
        /**
         * 设置 模块名
         * @param moduleName
         */
        public void setModuleName(String moduleName) {
                this.moduleName = moduleName;
        }




        @ApiModelProperty(name = "OptUrl", value = "模块URL")
        private String optUrl;
        /**
         * 得到 模块URL
         * @return
         */
        public String getOptUrl() {
                return optUrl;
        }
        /**
         * 设置 模块URL
         * @param optUrl
         */
        public void setOptUrl(String optUrl) {
                this.optUrl = optUrl;
        }




        @ApiModelProperty(name = "Sort", value = "排序")
        private Integer sort;
        /**
         * 得到 排序
         * @return
         */
        public Integer getSort() {
                return sort;
        }
        /**
         * 设置 排序
         * @param sort
         */
        public void setSort(Integer sort) {
                this.sort = sort;
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


}
