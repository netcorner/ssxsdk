package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class EnterpriseBindTagParams {


    
                


                

        
        @ApiModelProperty(name = "EntID", value = "企业 ID")
        private Integer entID;
        /**
         * 得到 企业 ID
         * @return
         */
        public Integer getEntID() {
                return entID;
        }
        /**
         * 设置 企业 ID
         * @param entID
         */
        public void setEntID(Integer entID) {
                this.entID = entID;
        }
    
                

        

                

        
        @ApiModelProperty(name = "TagID", value = "标签 ID")
        private Integer tagID;
        /**
         * 得到 标签 ID
         * @return
         */
        public Integer getTagID() {
                return tagID;
        }
        /**
         * 设置 标签 ID
         * @param tagID
         */
        public void setTagID(Integer tagID) {
                this.tagID = tagID;
        }
    

}
