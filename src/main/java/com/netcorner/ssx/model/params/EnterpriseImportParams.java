package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EnterpriseImportParams{


    
                

        
        @ApiModelProperty(name = "ExcelFileData", value = "导入 excel 文件 路径")
        private String excelFileData;
        @ApiModelProperty(name = "ServiceID", value = "服务类型")
        private String serviceID;

        @ApiModelProperty(name = "Type", value = "服务分类")
        private String type;

        @ApiModelProperty(name = "TypeName", value = "服务分类名称")
        private String typeName;

        @ApiModelProperty(name = "ServiceName", value = "服务类型名称")
        private String serviceName;

        public String getExcelFileData() {
                return excelFileData;
        }

        public void setExcelFileData(String excelFileData) {
                this.excelFileData = excelFileData;
        }

        public String getServiceID() {
                return serviceID;
        }

        public void setServiceID(String serviceID) {
                this.serviceID = serviceID;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getTypeName() {
                return typeName;
        }

        public void setTypeName(String typeName) {
                this.typeName = typeName;
        }

        public String getServiceName() {
                return serviceName;
        }

        public void setServiceName(String serviceName) {
                this.serviceName = serviceName;
        }
}
