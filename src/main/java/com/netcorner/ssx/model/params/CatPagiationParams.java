package com.netcorner.ssx.model.params;

import com.netcorner.ssx.model.params.base.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class CatPagiationParams extends PaginationParam{


    
                

        
        @ApiModelProperty(name = "hasDefault", value = "是否需要默认分类")
        private int hasDefault;


        public int getHasDefault() {
                return hasDefault;
        }

        public void setHasDefault(int hasDefault) {
                this.hasDefault = hasDefault;
        }
}
