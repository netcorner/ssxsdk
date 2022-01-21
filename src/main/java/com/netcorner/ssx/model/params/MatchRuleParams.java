package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class MatchRuleParams {


    
                

        
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


        @ApiModelProperty(name = "TypeName", value = " 供求类型名称")
        private String typeName;

        public String getTypeName() {
                return typeName;
        }

        public void setTypeName(String typeName) {
                this.typeName = typeName;
        }

        @ApiModelProperty(name = "Type", value = " 供求类型 key")
        private String type;
        /**
         * 得到  供求类型 key
         * @return
         */
        public String getType() {
                return type;
        }
        /**
         * 设置  供求类型 key
         * @param type
         */
        public void setType(String type) {
                this.type = type;
        }
    
                

        
        @ApiModelProperty(name = "MatchDistance", value = "供求配对距离（单位米）")
        private Integer matchDistance;
        /**
         * 得到 供求配对距离（单位米）
         * @return
         */
        public Integer getMatchDistance() {
                return matchDistance;
        }
        /**
         * 设置 供求配对距离（单位米）
         * @param matchDistance
         */
        public void setMatchDistance(Integer matchDistance) {
                this.matchDistance = matchDistance;
        }
    
                

        

    

}
