package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class DevDocParams {






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




        @ApiModelProperty(name = "SDKPath", value = "保存sdk路径")
        private String sDKPath;
        /**
         * 得到 保存sdk路径
         * @return
         */
        public String getSDKPath() {
                return sDKPath;
        }
        /**
         * 设置 保存sdk路径
         * @param sDKPath
         */
        public void setSDKPath(String sDKPath) {
                this.sDKPath = sDKPath;
        }




        @ApiModelProperty(name = "DocPath", value = "保存doc路径")
        private String docPath;
        /**
         * 得到 保存doc路径
         * @return
         */
        public String getDocPath() {
                return docPath;
        }
        /**
         * 设置 保存doc路径
         * @param docPath
         */
        public void setDocPath(String docPath) {
                this.docPath = docPath;
        }




        @ApiModelProperty(name = "DemoPath", value = "保存doc路径")
        private String demoPath;
        /**
         * 得到 保存doc路径
         * @return
         */
        public String getDemoPath() {
                return demoPath;
        }
        /**
         * 设置 保存doc路径
         * @param demoPath
         */
        public void setDemoPath(String demoPath) {
                this.demoPath = demoPath;
        }




        @ApiModelProperty(name = "AddUserID", value = "添加人")
        private Integer addUserID;
        /**
         * 得到 添加人
         * @return
         */
        public Integer getAddUserID() {
                return addUserID;
        }
        /**
         * 设置 添加人
         * @param addUserID
         */
        public void setAddUserID(Integer addUserID) {
                this.addUserID = addUserID;
        }




        @ApiModelProperty(name = "AddTime", value = " 添加时间")
        private Date addTime;
        /**
         * 得到  添加时间
         * @return
         */
        public Date getAddTime() {
                return addTime;
        }
        /**
         * 设置  添加时间
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


}
