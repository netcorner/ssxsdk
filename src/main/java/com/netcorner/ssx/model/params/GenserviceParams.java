package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class GenserviceParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "ModuleAsName", value = "模块英文名")
        private String moduleAsName;
        /**
         * 得到 模块英文名
         * @return
         */
        public String getModuleAsName() {
                return moduleAsName;
        }
        /**
         * 设置 模块英文名
         * @param moduleAsName
         */
        public void setModuleAsName(String moduleAsName) {
                this.moduleAsName = moduleAsName;
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
    
                

        
        @ApiModelProperty(name = "MatchRuleKey", value = "供求配对规则key")
        private String matchRuleKey;
        /**
         * 得到 供求配对规则key
         * @return
         */
        public String getMatchRuleKey() {
                return matchRuleKey;
        }
        /**
         * 设置 供求配对规则key
         * @param matchRuleKey
         */
        public void setMatchRuleKey(String matchRuleKey) {
                this.matchRuleKey = matchRuleKey;
        }
    
                

        
        @ApiModelProperty(name = "GetServiceUserRuleKey", value = "服务商采集规则key")
        private String getServiceUserRuleKey;
        /**
         * 得到 服务商采集规则key
         * @return
         */
        public String getGetServiceUserRuleKey() {
                return getServiceUserRuleKey;
        }
        /**
         * 设置 服务商采集规则key
         * @param getServiceUserRuleKey
         */
        public void setGetServiceUserRuleKey(String getServiceUserRuleKey) {
                this.getServiceUserRuleKey = getServiceUserRuleKey;
        }
    
                

        
        @ApiModelProperty(name = "FormLabel", value = "表单信息头标签名（空值即不显示）")
        private String formLabel;
        /**
         * 得到 表单信息头标签名（空值即不显示）
         * @return
         */
        public String getFormLabel() {
                return formLabel;
        }
        /**
         * 设置 表单信息头标签名（空值即不显示）
         * @param formLabel
         */
        public void setFormLabel(String formLabel) {
                this.formLabel = formLabel;
        }
    
                

        
        @ApiModelProperty(name = "ServiceIDLabel", value = "服务类型标签（空值即不显示）")
        private String serviceIDLabel;
        /**
         * 得到 服务类型标签（空值即不显示）
         * @return
         */
        public String getServiceIDLabel() {
                return serviceIDLabel;
        }
        /**
         * 设置 服务类型标签（空值即不显示）
         * @param serviceIDLabel
         */
        public void setServiceIDLabel(String serviceIDLabel) {
                this.serviceIDLabel = serviceIDLabel;
        }
    
                

        
        @ApiModelProperty(name = "ServiceIDRequired", value = "服务类型是否为必填项（1必填，0可选）")
        private Integer serviceIDRequired;
        /**
         * 得到 服务类型是否为必填项（1必填，0可选）
         * @return
         */
        public Integer getServiceIDRequired() {
                return serviceIDRequired;
        }
        /**
         * 设置 服务类型是否为必填项（1必填，0可选）
         * @param serviceIDRequired
         */
        public void setServiceIDRequired(Integer serviceIDRequired) {
                this.serviceIDRequired = serviceIDRequired;
        }
    
                

        
        @ApiModelProperty(name = "ServiceIDCatID", value = "服务类型分类 ID")
        private String serviceIDCatID;
        /**
         * 得到 服务类型分类 ID
         * @return
         */
        public String getServiceIDCatID() {
                return serviceIDCatID;
        }
        /**
         * 设置 服务类型分类 ID
         * @param serviceIDCatID
         */
        public void setServiceIDCatID(String serviceIDCatID) {
                this.serviceIDCatID = serviceIDCatID;
        }
    
                

        
        @ApiModelProperty(name = "ServiceIDLabel2", value = "服务类型按钮请选择标签名")
        private String serviceIDLabel2;
        /**
         * 得到 服务类型按钮请选择标签名
         * @return
         */
        public String getServiceIDLabel2() {
                return serviceIDLabel2;
        }
        /**
         * 设置 服务类型按钮请选择标签名
         * @param serviceIDLabel2
         */
        public void setServiceIDLabel2(String serviceIDLabel2) {
                this.serviceIDLabel2 = serviceIDLabel2;
        }
    
                

        
        @ApiModelProperty(name = "HopeDateLabel", value = "期望时间（空值即不显示）")
        private String hopeDateLabel;
        /**
         * 得到 期望时间（空值即不显示）
         * @return
         */
        public String getHopeDateLabel() {
                return hopeDateLabel;
        }
        /**
         * 设置 期望时间（空值即不显示）
         * @param hopeDateLabel
         */
        public void setHopeDateLabel(String hopeDateLabel) {
                this.hopeDateLabel = hopeDateLabel;
        }
    
                

        
        @ApiModelProperty(name = "HopeDateRequired", value = "期望时间是否为必填项（1必填，0可选）")
        private Integer hopeDateRequired;
        /**
         * 得到 期望时间是否为必填项（1必填，0可选）
         * @return
         */
        public Integer getHopeDateRequired() {
                return hopeDateRequired;
        }
        /**
         * 设置 期望时间是否为必填项（1必填，0可选）
         * @param hopeDateRequired
         */
        public void setHopeDateRequired(Integer hopeDateRequired) {
                this.hopeDateRequired = hopeDateRequired;
        }
    
                

        
        @ApiModelProperty(name = "HopeDateDefaultValueLabel", value = "期望时间默认选中的标签值名称")
        private String hopeDateDefaultValueLabel;
        /**
         * 得到 期望时间默认选中的标签值名称
         * @return
         */
        public String getHopeDateDefaultValueLabel() {
                return hopeDateDefaultValueLabel;
        }
        /**
         * 设置 期望时间默认选中的标签值名称
         * @param hopeDateDefaultValueLabel
         */
        public void setHopeDateDefaultValueLabel(String hopeDateDefaultValueLabel) {
                this.hopeDateDefaultValueLabel = hopeDateDefaultValueLabel;
        }
    
                

        
        @ApiModelProperty(name = "AddressLabel", value = "所在位置（空值即不显示）")
        private String addressLabel;
        /**
         * 得到 所在位置（空值即不显示）
         * @return
         */
        public String getAddressLabel() {
                return addressLabel;
        }
        /**
         * 设置 所在位置（空值即不显示）
         * @param addressLabel
         */
        public void setAddressLabel(String addressLabel) {
                this.addressLabel = addressLabel;
        }
    
                

        
        @ApiModelProperty(name = "AddressRequired", value = "所在位置是否为必填项（1必填，0可选）")
        private Integer addressRequired;
        /**
         * 得到 所在位置是否为必填项（1必填，0可选）
         * @return
         */
        public Integer getAddressRequired() {
                return addressRequired;
        }
        /**
         * 设置 所在位置是否为必填项（1必填，0可选）
         * @param addressRequired
         */
        public void setAddressRequired(Integer addressRequired) {
                this.addressRequired = addressRequired;
        }
    
                

        
        @ApiModelProperty(name = "AddressLabel2", value = "所在位置按钮文字标签名")
        private String addressLabel2;
        /**
         * 得到 所在位置按钮文字标签名
         * @return
         */
        public String getAddressLabel2() {
                return addressLabel2;
        }
        /**
         * 设置 所在位置按钮文字标签名
         * @param addressLabel2
         */
        public void setAddressLabel2(String addressLabel2) {
                this.addressLabel2 = addressLabel2;
        }
    
                

        
        @ApiModelProperty(name = "DescriptionLabel", value = "描述标签（空值即不显示）")
        private String descriptionLabel;
        /**
         * 得到 描述标签（空值即不显示）
         * @return
         */
        public String getDescriptionLabel() {
                return descriptionLabel;
        }
        /**
         * 设置 描述标签（空值即不显示）
         * @param descriptionLabel
         */
        public void setDescriptionLabel(String descriptionLabel) {
                this.descriptionLabel = descriptionLabel;
        }
    
                

        
        @ApiModelProperty(name = "DescriptionRequired", value = "描述是否为必填项（1必填，0可选）")
        private Integer descriptionRequired;
        /**
         * 得到 描述是否为必填项（1必填，0可选）
         * @return
         */
        public Integer getDescriptionRequired() {
                return descriptionRequired;
        }
        /**
         * 设置 描述是否为必填项（1必填，0可选）
         * @param descriptionRequired
         */
        public void setDescriptionRequired(Integer descriptionRequired) {
                this.descriptionRequired = descriptionRequired;
        }
    
                

        
        @ApiModelProperty(name = "PhotoLabel", value = "照片标签名（空值即不显示）")
        private String photoLabel;
        /**
         * 得到 照片标签名（空值即不显示）
         * @return
         */
        public String getPhotoLabel() {
                return photoLabel;
        }
        /**
         * 设置 照片标签名（空值即不显示）
         * @param photoLabel
         */
        public void setPhotoLabel(String photoLabel) {
                this.photoLabel = photoLabel;
        }
    
                

        
        @ApiModelProperty(name = "PhotoRequired", value = "照片是否为必填项（1必填，0可选）")
        private Integer photoRequired;
        /**
         * 得到 照片是否为必填项（1必填，0可选）
         * @return
         */
        public Integer getPhotoRequired() {
                return photoRequired;
        }
        /**
         * 设置 照片是否为必填项（1必填，0可选）
         * @param photoRequired
         */
        public void setPhotoRequired(Integer photoRequired) {
                this.photoRequired = photoRequired;
        }
    
                

        
        @ApiModelProperty(name = "PhotoSize", value = "照片张数")
        private Integer photoSize;
        /**
         * 得到 照片张数
         * @return
         */
        public Integer getPhotoSize() {
                return photoSize;
        }
        /**
         * 设置 照片张数
         * @param photoSize
         */
        public void setPhotoSize(Integer photoSize) {
                this.photoSize = photoSize;
        }
    
                

        
        @ApiModelProperty(name = "ServiceWayIDLabel", value = "服务方式标签（空值即不显示）")
        private String serviceWayIDLabel;
        /**
         * 得到 服务方式标签（空值即不显示）
         * @return
         */
        public String getServiceWayIDLabel() {
                return serviceWayIDLabel;
        }
        /**
         * 设置 服务方式标签（空值即不显示）
         * @param serviceWayIDLabel
         */
        public void setServiceWayIDLabel(String serviceWayIDLabel) {
                this.serviceWayIDLabel = serviceWayIDLabel;
        }
    
                

        
        @ApiModelProperty(name = "ServiceWayIDRequired", value = "服务方式是否为必填项（1必填，0可选）")
        private Integer serviceWayIDRequired;
        /**
         * 得到 服务方式是否为必填项（1必填，0可选）
         * @return
         */
        public Integer getServiceWayIDRequired() {
                return serviceWayIDRequired;
        }
        /**
         * 设置 服务方式是否为必填项（1必填，0可选）
         * @param serviceWayIDRequired
         */
        public void setServiceWayIDRequired(Integer serviceWayIDRequired) {
                this.serviceWayIDRequired = serviceWayIDRequired;
        }
    
                

        
        @ApiModelProperty(name = "ServiceWayIDCatID", value = "服务方式分类 ID")
        private String serviceWayIDCatID;
        /**
         * 得到 服务方式分类 ID
         * @return
         */
        public String getServiceWayIDCatID() {
                return serviceWayIDCatID;
        }
        /**
         * 设置 服务方式分类 ID
         * @param serviceWayIDCatID
         */
        public void setServiceWayIDCatID(String serviceWayIDCatID) {
                this.serviceWayIDCatID = serviceWayIDCatID;
        }
    
                

        
        @ApiModelProperty(name = "ServiceWayIDLabel2", value = "服务方式按钮请选择标签名")
        private String serviceWayIDLabel2;
        /**
         * 得到 服务方式按钮请选择标签名
         * @return
         */
        public String getServiceWayIDLabel2() {
                return serviceWayIDLabel2;
        }
        /**
         * 设置 服务方式按钮请选择标签名
         * @param serviceWayIDLabel2
         */
        public void setServiceWayIDLabel2(String serviceWayIDLabel2) {
                this.serviceWayIDLabel2 = serviceWayIDLabel2;
        }
    
                

        
        @ApiModelProperty(name = "SupplyModuleID", value = "供应服务模块 ID")
        private Integer supplyModuleID;
        /**
         * 得到 供应服务模块 ID
         * @return
         */
        public Integer getSupplyModuleID() {
                return supplyModuleID;
        }
        /**
         * 设置 供应服务模块 ID
         * @param supplyModuleID
         */
        public void setSupplyModuleID(Integer supplyModuleID) {
                this.supplyModuleID = supplyModuleID;
        }
    
                

        
        @ApiModelProperty(name = "DemandModuleID", value = "需求服务模块 ID")
        private Integer demandModuleID;
        /**
         * 得到 需求服务模块 ID
         * @return
         */
        public Integer getDemandModuleID() {
                return demandModuleID;
        }
        /**
         * 设置 需求服务模块 ID
         * @param demandModuleID
         */
        public void setDemandModuleID(Integer demandModuleID) {
                this.demandModuleID = demandModuleID;
        }



        @ApiModelProperty(name = "ServiceIDShow", value = "服务类型是否显示")
        private Integer serviceIDShow;
        @ApiModelProperty(name = "ServiceWayIDShow", value = "服务方式是否显示")
        private Integer serviceWayIDShow;
        @ApiModelProperty(name = "HopeDateShow", value = "期望时间是否显示")
        private Integer hopeDateShow;
        @ApiModelProperty(name = "AddressShow", value = "地址是否显示")
        private Integer addressShow;
        @ApiModelProperty(name = "DescriptionShow", value = "备注是否显示")
        private Integer descriptionShow;
        @ApiModelProperty(name = "PhotoShow", value = "照片是否显示")
        private Integer photoShow;
        @ApiModelProperty(name = "ServiceItemTypeKey", value = "服务商服务项目key")
        private String serviceItemTypeKey;

        @ApiModelProperty(name = "Icon", value = "图标")
        private String Icon;

        public Integer getServiceIDShow() {
                return serviceIDShow;
        }

        public void setServiceIDShow(Integer serviceIDShow) {
                this.serviceIDShow = serviceIDShow;
        }

        public Integer getServiceWayIDShow() {
                return serviceWayIDShow;
        }

        public void setServiceWayIDShow(Integer serviceWayIDShow) {
                this.serviceWayIDShow = serviceWayIDShow;
        }

        public Integer getHopeDateShow() {
                return hopeDateShow;
        }

        public void setHopeDateShow(Integer hopeDateShow) {
                this.hopeDateShow = hopeDateShow;
        }

        public Integer getAddressShow() {
                return addressShow;
        }

        public void setAddressShow(Integer addressShow) {
                this.addressShow = addressShow;
        }

        public Integer getDescriptionShow() {
                return descriptionShow;
        }

        public void setDescriptionShow(Integer descriptionShow) {
                this.descriptionShow = descriptionShow;
        }

        public Integer getPhotoShow() {
                return photoShow;
        }

        public void setPhotoShow(Integer photoShow) {
                this.photoShow = photoShow;
        }

        public String getServiceItemTypeKey() {
                return serviceItemTypeKey;
        }

        public void setServiceItemTypeKey(String serviceItemTypeKey) {
                this.serviceItemTypeKey = serviceItemTypeKey;
        }

        public String getIcon() {
                return Icon;
        }

        public void setIcon(String icon) {
                Icon = icon;
        }
}
