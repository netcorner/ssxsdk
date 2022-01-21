package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class AppMarketParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "Developer", value = "开发者")
        private String developer;
        /**
         * 得到 开发者
         * @return
         */
        public String getDeveloper() {
                return developer;
        }
        /**
         * 设置 开发者
         * @param developer
         */
        public void setDeveloper(String developer) {
                this.developer = developer;
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
    
                

        
        @ApiModelProperty(name = "Name", value = "名称")
        private String name;
        /**
         * 得到 名称
         * @return
         */
        public String getName() {
                return name;
        }
        /**
         * 设置 名称
         * @param name
         */
        public void setName(String name) {
                this.name = name;
        }
    
                

        
        @ApiModelProperty(name = "Type", value = "类型（1代码手机，2自动添加）")
        private Integer type;
        /**
         * 得到 类型（1代码手机，2自动添加）
         * @return
         */
        public Integer getType() {
                return type;
        }
        /**
         * 设置 类型（1代码手机，2自动添加）
         * @param type
         */
        public void setType(Integer type) {
                this.type = type;
        }
    

}
