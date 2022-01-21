package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class InfoParams {


    

    
                

        
        @ApiModelProperty(name = "CateID", value = "分类")
        private Integer cateID;
        /**
         * 得到 分类
         * @return
         */
        public Integer getCateID() {
                return cateID;
        }
        /**
         * 设置 分类
         * @param cateID
         */
        public void setCateID(Integer cateID) {
                this.cateID = cateID;
        }
    
                

        
        @ApiModelProperty(name = "Content", value = "内容")
        private String content;
        /**
         * 得到 内容
         * @return
         */
        public String getContent() {
                return content;
        }
        /**
         * 设置 内容
         * @param content
         */
        public void setContent(String content) {
                this.content = content;
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
    
                


                

                





        
        @ApiModelProperty(name = "Source", value = "来源")
        private String source;
        /**
         * 得到 来源
         * @return
         */
        public String getSource() {
                return source;
        }
        /**
         * 设置 来源
         * @param source
         */
        public void setSource(String source) {
                this.source = source;
        }
    
                

        
        @ApiModelProperty(name = "Title", value = "标题")
        private String title;
        /**
         * 得到 标题
         * @return
         */
        public String getTitle() {
                return title;
        }
        /**
         * 设置 标题
         * @param title
         */
        public void setTitle(String title) {
                this.title = title;
        }
    
                

        
        @ApiModelProperty(name = "Top", value = "置顶（0否，1是）")
        private Integer top;
        /**
         * 得到 置顶（0否，1是）
         * @return
         */
        public Integer getTop() {
                return top;
        }
        /**
         * 设置 置顶（0否，1是）
         * @param top
         */
        public void setTop(Integer top) {
                this.top = top;
        }
    
                

        
        @ApiModelProperty(name = "TopBeginTime", value = "置顶开始时间")
        private String topBeginTime;
        /**
         * 得到 置顶开始时间
         * @return
         */
        public String getTopBeginTime() {
                return topBeginTime;
        }
        /**
         * 设置 置顶开始时间
         * @param topBeginTime
         */
        public void setTopBeginTime(String topBeginTime) {
                this.topBeginTime = topBeginTime;
        }
    
                

        
        @ApiModelProperty(name = "TopEndTime", value = "置顶结束时间")
        private String topEndTime;
        /**
         * 得到 置顶结束时间
         * @return
         */
        public String getTopEndTime() {
                return topEndTime;
        }
        /**
         * 设置 置顶结束时间
         * @param topEndTime
         */
        public void setTopEndTime(String topEndTime) {
                this.topEndTime = topEndTime;
        }
    
                


                

    

}
