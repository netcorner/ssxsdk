package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class QuotationParams {


    
                

        
        @ApiModelProperty(name = "Exes", value = "费用明细")
        private String exes;
        /**
         * 得到 费用明细
         * @return
         */
        public String getExes() {
                return exes;
        }
        /**
         * 设置 费用明细
         * @param exes
         */
        public void setExes(String exes) {
                this.exes = exes;
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
    
                

        
        @ApiModelProperty(name = "ItemDel", value = "发起端删除（0未删除，1删除）")
        private Integer itemDel;
        /**
         * 得到 发起端删除（0未删除，1删除）
         * @return
         */
        public Integer getItemDel() {
                return itemDel;
        }
        /**
         * 设置 发起端删除（0未删除，1删除）
         * @param itemDel
         */
        public void setItemDel(Integer itemDel) {
                this.itemDel = itemDel;
        }
    
                

        
        @ApiModelProperty(name = "ItemDelTime", value = "发起端删除时间")
        private Date itemDelTime;
        /**
         * 得到 发起端删除时间
         * @return
         */
        public Date getItemDelTime() {
                return itemDelTime;
        }
        /**
         * 设置 发起端删除时间
         * @param itemDelTime
         */
        public void setItemDelTime(Date itemDelTime) {
                this.itemDelTime = itemDelTime;
        }
    
                

        
        @ApiModelProperty(name = "ItemEntName", value = "项目发起人所在企业")
        private String itemEntName;
        /**
         * 得到 项目发起人所在企业
         * @return
         */
        public String getItemEntName() {
                return itemEntName;
        }
        /**
         * 设置 项目发起人所在企业
         * @param itemEntName
         */
        public void setItemEntName(String itemEntName) {
                this.itemEntName = itemEntName;
        }
    
                

        
        @ApiModelProperty(name = "ItemEvaluation", value = "发起端评价（0未评价，1已评价）")
        private Integer itemEvaluation;
        /**
         * 得到 发起端评价（0未评价，1已评价）
         * @return
         */
        public Integer getItemEvaluation() {
                return itemEvaluation;
        }
        /**
         * 设置 发起端评价（0未评价，1已评价）
         * @param itemEvaluation
         */
        public void setItemEvaluation(Integer itemEvaluation) {
                this.itemEvaluation = itemEvaluation;
        }
    
                

        
        @ApiModelProperty(name = "ItemID", value = "项目 ID")
        private Integer itemID;
        /**
         * 得到 项目 ID
         * @return
         */
        public Integer getItemID() {
                return itemID;
        }
        /**
         * 设置 项目 ID
         * @param itemID
         */
        public void setItemID(Integer itemID) {
                this.itemID = itemID;
        }
    
                

        
        @ApiModelProperty(name = "ItemUserID", value = "项目人 ID")
        private Integer itemUserID;
        /**
         * 得到 项目人 ID
         * @return
         */
        public Integer getItemUserID() {
                return itemUserID;
        }
        /**
         * 设置 项目人 ID
         * @param itemUserID
         */
        public void setItemUserID(Integer itemUserID) {
                this.itemUserID = itemUserID;
        }
    
                

        
        @ApiModelProperty(name = "ItemUserName", value = "项目人")
        private String itemUserName;
        /**
         * 得到 项目人
         * @return
         */
        public String getItemUserName() {
                return itemUserName;
        }
        /**
         * 设置 项目人
         * @param itemUserName
         */
        public void setItemUserName(String itemUserName) {
                this.itemUserName = itemUserName;
        }
    
                

        
        @ApiModelProperty(name = "ItemUserPhoto", value = "项目人照片")
        private String itemUserPhoto;
        /**
         * 得到 项目人照片
         * @return
         */
        public String getItemUserPhoto() {
                return itemUserPhoto;
        }
        /**
         * 设置 项目人照片
         * @param itemUserPhoto
         */
        public void setItemUserPhoto(String itemUserPhoto) {
                this.itemUserPhoto = itemUserPhoto;
        }
    
                

        
        @ApiModelProperty(name = "PayTime", value = "支付时间")
        private Date payTime;
        /**
         * 得到 支付时间
         * @return
         */
        public Date getPayTime() {
                return payTime;
        }
        /**
         * 设置 支付时间
         * @param payTime
         */
        public void setPayTime(Date payTime) {
                this.payTime = payTime;
        }
    
                

        
        @ApiModelProperty(name = "Remark", value = "备注")
        private String remark;
        /**
         * 得到 备注
         * @return
         */
        public String getRemark() {
                return remark;
        }
        /**
         * 设置 备注
         * @param remark
         */
        public void setRemark(String remark) {
                this.remark = remark;
        }
    
                

        
        @ApiModelProperty(name = "QuotationDel", value = "选中端删除（0未删除，1删除）")
        private Integer QuotationDel;
        /**
         * 得到 选中端删除（0未删除，1删除）
         * @return
         */
        public Integer getQuotationDel() {
                return QuotationDel;
        }
        /**
         * 设置 选中端删除（0未删除，1删除）
         * @param QuotationDel
         */
        public void setQuotationDel(Integer QuotationDel) {
                this.QuotationDel = QuotationDel;
        }
    
                

        
        @ApiModelProperty(name = "QuotationDelTime", value = "选中删除时间")
        private Date QuotationDelTime;
        /**
         * 得到 选中删除时间
         * @return
         */
        public Date getQuotationDelTime() {
                return QuotationDelTime;
        }
        /**
         * 设置 选中删除时间
         * @param QuotationDelTime
         */
        public void setQuotationDelTime(Date QuotationDelTime) {
                this.QuotationDelTime = QuotationDelTime;
        }
    
                

        
        @ApiModelProperty(name = "QuotationEntLogo", value = "选中人的公司 LOGO")
        private String QuotationEntLogo;
        /**
         * 得到 选中人的公司 LOGO
         * @return
         */
        public String getQuotationEntLogo() {
                return QuotationEntLogo;
        }
        /**
         * 设置 选中人的公司 LOGO
         * @param QuotationEntLogo
         */
        public void setQuotationEntLogo(String QuotationEntLogo) {
                this.QuotationEntLogo = QuotationEntLogo;
        }
    
                

        
        @ApiModelProperty(name = "QuotationEntName", value = "选中人的公司名称")
        private String QuotationEntName;
        /**
         * 得到 选中人的公司名称
         * @return
         */
        public String getQuotationEntName() {
                return QuotationEntName;
        }
        /**
         * 设置 选中人的公司名称
         * @param QuotationEntName
         */
        public void setQuotationEntName(String QuotationEntName) {
                this.QuotationEntName = QuotationEntName;
        }
    
                

        
        @ApiModelProperty(name = "QuotationEvaluation", value = "选中端评价（0未评价，1已评价）")
        private Integer QuotationEvaluation;
        /**
         * 得到 选中端评价（0未评价，1已评价）
         * @return
         */
        public Integer getQuotationEvaluation() {
                return QuotationEvaluation;
        }
        /**
         * 设置 选中端评价（0未评价，1已评价）
         * @param QuotationEvaluation
         */
        public void setQuotationEvaluation(Integer QuotationEvaluation) {
                this.QuotationEvaluation = QuotationEvaluation;
        }
    
                

        
        @ApiModelProperty(name = "QuotationItemID", value = "选中对应的项目 ID")
        private Integer QuotationItemID;
        /**
         * 得到 选中对应的项目 ID
         * @return
         */
        public Integer getQuotationItemID() {
                return QuotationItemID;
        }
        /**
         * 设置 选中对应的项目 ID
         * @param QuotationItemID
         */
        public void setQuotationItemID(Integer QuotationItemID) {
                this.QuotationItemID = QuotationItemID;
        }
    
                

        
        @ApiModelProperty(name = "QuotationPrice", value = "总报价价格（数字）")
        private String QuotationPrice;
        /**
         * 得到 总报价价格（数字）
         * @return
         */
        public String getQuotationPrice() {
                return QuotationPrice;
        }
        /**
         * 设置 总报价价格（数字）
         * @param QuotationPrice
         */
        public void setQuotationPrice(String QuotationPrice) {
                this.QuotationPrice = QuotationPrice;
        }
    
                

        
        @ApiModelProperty(name = "QuotationTime", value = "选中时间")
        private Date QuotationTime;
        /**
         * 得到 选中时间
         * @return
         */
        public Date getQuotationTime() {
                return QuotationTime;
        }
        /**
         * 设置 选中时间
         * @param QuotationTime
         */
        public void setQuotationTime(Date QuotationTime) {
                this.QuotationTime = QuotationTime;
        }
    
                

        
        @ApiModelProperty(name = "QuotationUserID", value = "选中人ID ")
        private Integer QuotationUserID;
        /**
         * 得到 选中人ID 
         * @return
         */
        public Integer getQuotationUserID() {
                return QuotationUserID;
        }
        /**
         * 设置 选中人ID 
         * @param QuotationUserID
         */
        public void setQuotationUserID(Integer QuotationUserID) {
                this.QuotationUserID = QuotationUserID;
        }
    
                

        
        @ApiModelProperty(name = "QuotationUserName", value = "选中人")
        private String QuotationUserName;
        /**
         * 得到 选中人
         * @return
         */
        public String getQuotationUserName() {
                return QuotationUserName;
        }
        /**
         * 设置 选中人
         * @param QuotationUserName
         */
        public void setQuotationUserName(String QuotationUserName) {
                this.QuotationUserName = QuotationUserName;
        }
    
                

        
        @ApiModelProperty(name = "QuotationUserPhoto", value = "选中人照片")
        private String QuotationUserPhoto;
        /**
         * 得到 选中人照片
         * @return
         */
        public String getQuotationUserPhoto() {
                return QuotationUserPhoto;
        }
        /**
         * 设置 选中人照片
         * @param QuotationUserPhoto
         */
        public void setQuotationUserPhoto(String QuotationUserPhoto) {
                this.QuotationUserPhoto = QuotationUserPhoto;
        }
    
                

        
        @ApiModelProperty(name = "QuotationWorkCerPath", value = "选中人的公司工作牌")
        private String QuotationWorkCerPath;
        /**
         * 得到 选中人的公司工作牌
         * @return
         */
        public String getQuotationWorkCerPath() {
                return QuotationWorkCerPath;
        }
        /**
         * 设置 选中人的公司工作牌
         * @param QuotationWorkCerPath
         */
        public void setQuotationWorkCerPath(String QuotationWorkCerPath) {
                this.QuotationWorkCerPath = QuotationWorkCerPath;
        }
    
                

        
        @ApiModelProperty(name = "Status", value = "状态（1选中，2项目发起人已选中，3选中人支付费用）")
        private Integer status;
        /**
         * 得到 状态（1选中，2项目发起人已选中，3选中人支付费用）
         * @return
         */
        public Integer getStatus() {
                return status;
        }
        /**
         * 设置 状态（1选中，2项目发起人已选中，3选中人支付费用）
         * @param status
         */
        public void setStatus(Integer status) {
                this.status = status;
        }
    
                

        
        @ApiModelProperty(name = "Type", value = "类型(可按表格名称进行区分）")
        private String type;
        /**
         * 得到 类型(可按表格名称进行区分）
         * @return
         */
        public String getType() {
                return type;
        }
        /**
         * 设置 类型(可按表格名称进行区分）
         * @param type
         */
        public void setType(String type) {
                this.type = type;
        }
    
                

        
        @ApiModelProperty(name = "UpdateTime", value = "更新时间")
        private Date updateTime;
        /**
         * 得到 更新时间
         * @return
         */
        public Date getUpdateTime() {
                return updateTime;
        }
        /**
         * 设置 更新时间
         * @param updateTime
         */
        public void setUpdateTime(Date updateTime) {
                this.updateTime = updateTime;
        }
    

}
