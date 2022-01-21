package com.netcorner.ssx.model.params;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Created by shijiufeng on 2021/3/4.
 */
public class UserDelParams {


    
                

        
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
    
                

        
        @ApiModelProperty(name = "UserName", value = "用户名")
        private String userName;
        /**
         * 得到 用户名
         * @return
         */
        public String getUserName() {
                return userName;
        }
        /**
         * 设置 用户名
         * @param userName
         */
        public void setUserName(String userName) {
                this.userName = userName;
        }
    
                

        
        @ApiModelProperty(name = "RealName", value = "联系人名称")
        private String realName;
        /**
         * 得到 联系人名称
         * @return
         */
        public String getRealName() {
                return realName;
        }
        /**
         * 设置 联系人名称
         * @param realName
         */
        public void setRealName(String realName) {
                this.realName = realName;
        }
    
                

        
        @ApiModelProperty(name = "Pwd", value = "密码")
        private String pwd;
        /**
         * 得到 密码
         * @return
         */
        public String getPwd() {
                return pwd;
        }
        /**
         * 设置 密码
         * @param pwd
         */
        public void setPwd(String pwd) {
                this.pwd = pwd;
        }
    
                

        
        @ApiModelProperty(name = "LastLoginTime", value = "最后登录时间")
        private Date lastLoginTime;
        /**
         * 得到 最后登录时间
         * @return
         */
        public Date getLastLoginTime() {
                return lastLoginTime;
        }
        /**
         * 设置 最后登录时间
         * @param lastLoginTime
         */
        public void setLastLoginTime(Date lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
        }
    
                

        
        @ApiModelProperty(name = "LastLoginIP", value = "最后登录IP")
        private String lastLoginIP;
        /**
         * 得到 最后登录IP
         * @return
         */
        public String getLastLoginIP() {
                return lastLoginIP;
        }
        /**
         * 设置 最后登录IP
         * @param lastLoginIP
         */
        public void setLastLoginIP(String lastLoginIP) {
                this.lastLoginIP = lastLoginIP;
        }
    
                

        
        @ApiModelProperty(name = "RegTime", value = "注册时间")
        private Date regTime;
        /**
         * 得到 注册时间
         * @return
         */
        public Date getRegTime() {
                return regTime;
        }
        /**
         * 设置 注册时间
         * @param regTime
         */
        public void setRegTime(Date regTime) {
                this.regTime = regTime;
        }
    
                

        
        @ApiModelProperty(name = "Descripts", value = "描述")
        private String descripts;
        /**
         * 得到 描述
         * @return
         */
        public String getDescripts() {
                return descripts;
        }
        /**
         * 设置 描述
         * @param descripts
         */
        public void setDescripts(String descripts) {
                this.descripts = descripts;
        }
    
                

        
        @ApiModelProperty(name = "Question", value = "回答问题")
        private String question;
        /**
         * 得到 回答问题
         * @return
         */
        public String getQuestion() {
                return question;
        }
        /**
         * 设置 回答问题
         * @param question
         */
        public void setQuestion(String question) {
                this.question = question;
        }
    
                

        
        @ApiModelProperty(name = "Answer", value = "回答答案")
        private String answer;
        /**
         * 得到 回答答案
         * @return
         */
        public String getAnswer() {
                return answer;
        }
        /**
         * 设置 回答答案
         * @param answer
         */
        public void setAnswer(String answer) {
                this.answer = answer;
        }
    
                

        
        @ApiModelProperty(name = "Email", value = "email")
        private String email;
        /**
         * 得到 email
         * @return
         */
        public String getEmail() {
                return email;
        }
        /**
         * 设置 email
         * @param email
         */
        public void setEmail(String email) {
                this.email = email;
        }
    
                

        
        @ApiModelProperty(name = "Tel", value = "电话")
        private String tel;
        /**
         * 得到 电话
         * @return
         */
        public String getTel() {
                return tel;
        }
        /**
         * 设置 电话
         * @param tel
         */
        public void setTel(String tel) {
                this.tel = tel;
        }
    
                

        
        @ApiModelProperty(name = "Mobile", value = "手机")
        private String mobile;
        /**
         * 得到 手机
         * @return
         */
        public String getMobile() {
                return mobile;
        }
        /**
         * 设置 手机
         * @param mobile
         */
        public void setMobile(String mobile) {
                this.mobile = mobile;
        }
    
                

        
        @ApiModelProperty(name = "IsLockedOut", value = "是否琐定")
        private Integer isLockedOut;
        /**
         * 得到 是否琐定
         * @return
         */
        public Integer getIsLockedOut() {
                return isLockedOut;
        }
        /**
         * 设置 是否琐定
         * @param isLockedOut
         */
        public void setIsLockedOut(Integer isLockedOut) {
                this.isLockedOut = isLockedOut;
        }
    
                

        
        @ApiModelProperty(name = "LastPasswordChangedDate", value = "最后密码修改时间")
        private Date lastPasswordChangedDate;
        /**
         * 得到 最后密码修改时间
         * @return
         */
        public Date getLastPasswordChangedDate() {
                return lastPasswordChangedDate;
        }
        /**
         * 设置 最后密码修改时间
         * @param lastPasswordChangedDate
         */
        public void setLastPasswordChangedDate(Date lastPasswordChangedDate) {
                this.lastPasswordChangedDate = lastPasswordChangedDate;
        }
    
                

        
        @ApiModelProperty(name = "FailedPasswordAttemptCount", value = "密码修改失败次数")
        private Integer failedPasswordAttemptCount;
        /**
         * 得到 密码修改失败次数
         * @return
         */
        public Integer getFailedPasswordAttemptCount() {
                return failedPasswordAttemptCount;
        }
        /**
         * 设置 密码修改失败次数
         * @param failedPasswordAttemptCount
         */
        public void setFailedPasswordAttemptCount(Integer failedPasswordAttemptCount) {
                this.failedPasswordAttemptCount = failedPasswordAttemptCount;
        }
    
                

        
        @ApiModelProperty(name = "FailedPasswordAnswerAttemptCount", value = "回答问题失败次数")
        private Integer failedPasswordAnswerAttemptCount;
        /**
         * 得到 回答问题失败次数
         * @return
         */
        public Integer getFailedPasswordAnswerAttemptCount() {
                return failedPasswordAnswerAttemptCount;
        }
        /**
         * 设置 回答问题失败次数
         * @param failedPasswordAnswerAttemptCount
         */
        public void setFailedPasswordAnswerAttemptCount(Integer failedPasswordAnswerAttemptCount) {
                this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
        }
    
                

        
        @ApiModelProperty(name = "LoginTimes", value = "登录次数")
        private Integer loginTimes;
        /**
         * 得到 登录次数
         * @return
         */
        public Integer getLoginTimes() {
                return loginTimes;
        }
        /**
         * 设置 登录次数
         * @param loginTimes
         */
        public void setLoginTimes(Integer loginTimes) {
                this.loginTimes = loginTimes;
        }
    
                

        
        @ApiModelProperty(name = "VerifyCode", value = "注册验证Key")
        private String verifyCode;
        /**
         * 得到 注册验证Key
         * @return
         */
        public String getVerifyCode() {
                return verifyCode;
        }
        /**
         * 设置 注册验证Key
         * @param verifyCode
         */
        public void setVerifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
        }
    
                

        
        @ApiModelProperty(name = "Verifme", value = "激活时间")
        private Date verifme;
        /**
         * 得到 激活时间
         * @return
         */
        public Date getVerifme() {
                return verifme;
        }
        /**
         * 设置 激活时间
         * @param verifme
         */
        public void setVerifme(Date verifme) {
                this.verifme = verifme;
        }
    
                

        
        @ApiModelProperty(name = "VerifyIP", value = "账号验证IP")
        private String verifyIP;
        /**
         * 得到 账号验证IP
         * @return
         */
        public String getVerifyIP() {
                return verifyIP;
        }
        /**
         * 设置 账号验证IP
         * @param verifyIP
         */
        public void setVerifyIP(String verifyIP) {
                this.verifyIP = verifyIP;
        }
    
                

        
        @ApiModelProperty(name = "Integral", value = "积分")
        private Integer integral;
        /**
         * 得到 积分
         * @return
         */
        public Integer getIntegral() {
                return integral;
        }
        /**
         * 设置 积分
         * @param integral
         */
        public void setIntegral(Integer integral) {
                this.integral = integral;
        }
    
                

        
        @ApiModelProperty(name = "ViewTimes", value = "被访问次数")
        private Integer viewTimes;
        /**
         * 得到 被访问次数
         * @return
         */
        public Integer getViewTimes() {
                return viewTimes;
        }
        /**
         * 设置 被访问次数
         * @param viewTimes
         */
        public void setViewTimes(Integer viewTimes) {
                this.viewTimes = viewTimes;
        }
    
                

        
        @ApiModelProperty(name = "UserIdentity", value = "用户唯一ID值")
        private String userIdentity;
        /**
         * 得到 用户唯一ID值
         * @return
         */
        public String getUserIdentity() {
                return userIdentity;
        }
        /**
         * 设置 用户唯一ID值
         * @param userIdentity
         */
        public void setUserIdentity(String userIdentity) {
                this.userIdentity = userIdentity;
        }
    
                

        
        @ApiModelProperty(name = "Money", value = "金额")
        private String money;
        /**
         * 得到 金额
         * @return
         */
        public String getMoney() {
                return money;
        }
        /**
         * 设置 金额
         * @param money
         */
        public void setMoney(String money) {
                this.money = money;
        }
    
                

        
        @ApiModelProperty(name = "SignMsg", value = "个人签名")
        private String signMsg;
        /**
         * 得到 个人签名
         * @return
         */
        public String getSignMsg() {
                return signMsg;
        }
        /**
         * 设置 个人签名
         * @param signMsg
         */
        public void setSignMsg(String signMsg) {
                this.signMsg = signMsg;
        }
    
                

        
        @ApiModelProperty(name = "IsDeleted", value = "是否被删除")
        private String isDeleted;
        /**
         * 得到 是否被删除
         * @return
         */
        public String getIsDeleted() {
                return isDeleted;
        }
        /**
         * 设置 是否被删除
         * @param isDeleted
         */
        public void setIsDeleted(String isDeleted) {
                this.isDeleted = isDeleted;
        }
    
                

        
        @ApiModelProperty(name = "DeletedOn", value = "删除时间")
        private Date deletedOn;
        /**
         * 得到 删除时间
         * @return
         */
        public Date getDeletedOn() {
                return deletedOn;
        }
        /**
         * 设置 删除时间
         * @param deletedOn
         */
        public void setDeletedOn(Date deletedOn) {
                this.deletedOn = deletedOn;
        }
    
                

        
        @ApiModelProperty(name = "CreatedOn", value = "创建时间")
        private Date createdOn;
        /**
         * 得到 创建时间
         * @return
         */
        public Date getCreatedOn() {
                return createdOn;
        }
        /**
         * 设置 创建时间
         * @param createdOn
         */
        public void setCreatedOn(Date createdOn) {
                this.createdOn = createdOn;
        }
    
                

        
        @ApiModelProperty(name = "CreatedBy", value = "被谁创建的")
        private Integer createdBy;
        /**
         * 得到 被谁创建的
         * @return
         */
        public Integer getCreatedBy() {
                return createdBy;
        }
        /**
         * 设置 被谁创建的
         * @param createdBy
         */
        public void setCreatedBy(Integer createdBy) {
                this.createdBy = createdBy;
        }
    
                

        
        @ApiModelProperty(name = "LastModifiedOn", value = "最后修改时间")
        private Date lastModifiedOn;
        /**
         * 得到 最后修改时间
         * @return
         */
        public Date getLastModifiedOn() {
                return lastModifiedOn;
        }
        /**
         * 设置 最后修改时间
         * @param lastModifiedOn
         */
        public void setLastModifiedOn(Date lastModifiedOn) {
                this.lastModifiedOn = lastModifiedOn;
        }
    
                

        
        @ApiModelProperty(name = "LastModifiedBy", value = "最后修改人")
        private Integer lastModifiedBy;
        /**
         * 得到 最后修改人
         * @return
         */
        public Integer getLastModifiedBy() {
                return lastModifiedBy;
        }
        /**
         * 设置 最后修改人
         * @param lastModifiedBy
         */
        public void setLastModifiedBy(Integer lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
        }
    
                

        
        @ApiModelProperty(name = "Status", value = "当前状态")
        private Integer status;
        /**
         * 得到 当前状态
         * @return
         */
        public Integer getStatus() {
                return status;
        }
        /**
         * 设置 当前状态
         * @param status
         */
        public void setStatus(Integer status) {
                this.status = status;
        }
    
                

        
        @ApiModelProperty(name = "UserPhoto", value = "用户照片")
        private String userPhoto;
        /**
         * 得到 用户照片
         * @return
         */
        public String getUserPhoto() {
                return userPhoto;
        }
        /**
         * 设置 用户照片
         * @param userPhoto
         */
        public void setUserPhoto(String userPhoto) {
                this.userPhoto = userPhoto;
        }
    
                

        
        @ApiModelProperty(name = "UserKey", value = "用户码")
        private String userKey;
        /**
         * 得到 用户码
         * @return
         */
        public String getUserKey() {
                return userKey;
        }
        /**
         * 设置 用户码
         * @param userKey
         */
        public void setUserKey(String userKey) {
                this.userKey = userKey;
        }
    
                

        
        @ApiModelProperty(name = "Sex", value = "性别")
        private Integer sex;
        /**
         * 得到 性别
         * @return
         */
        public Integer getSex() {
                return sex;
        }
        /**
         * 设置 性别
         * @param sex
         */
        public void setSex(Integer sex) {
                this.sex = sex;
        }
    
                

        
        @ApiModelProperty(name = "HasPassword", value = "是否有密码")
        private Integer hasPassword;
        /**
         * 得到 是否有密码
         * @return
         */
        public Integer getHasPassword() {
                return hasPassword;
        }
        /**
         * 设置 是否有密码
         * @param hasPassword
         */
        public void setHasPassword(Integer hasPassword) {
                this.hasPassword = hasPassword;
        }
    
                

        
        @ApiModelProperty(name = "DataVer", value = "用户数据版本")
        private Integer dataVer;
        /**
         * 得到 用户数据版本
         * @return
         */
        public Integer getDataVer() {
                return dataVer;
        }
        /**
         * 设置 用户数据版本
         * @param dataVer
         */
        public void setDataVer(Integer dataVer) {
                this.dataVer = dataVer;
        }
    
                

        
        @ApiModelProperty(name = "Born", value = "出生日期")
        private Date born;
        /**
         * 得到 出生日期
         * @return
         */
        public Date getBorn() {
                return born;
        }
        /**
         * 设置 出生日期
         * @param born
         */
        public void setBorn(Date born) {
                this.born = born;
        }
    
                

        
        @ApiModelProperty(name = "ClientID", value = "客户唯一 ID")
        private String clientID;
        /**
         * 得到 客户唯一 ID
         * @return
         */
        public String getClientID() {
                return clientID;
        }
        /**
         * 设置 客户唯一 ID
         * @param clientID
         */
        public void setClientID(String clientID) {
                this.clientID = clientID;
        }
    
                

        
        @ApiModelProperty(name = "ReleaseVer", value = "版本号")
        private String releaseVer;
        /**
         * 得到 版本号
         * @return
         */
        public String getReleaseVer() {
                return releaseVer;
        }
        /**
         * 设置 版本号
         * @param releaseVer
         */
        public void setReleaseVer(String releaseVer) {
                this.releaseVer = releaseVer;
        }
    
                

        
        @ApiModelProperty(name = "Model", value = "手机机型")
        private String model;
        /**
         * 得到 手机机型
         * @return
         */
        public String getModel() {
                return model;
        }
        /**
         * 设置 手机机型
         * @param model
         */
        public void setModel(String model) {
                this.model = model;
        }
    
                

        
        @ApiModelProperty(name = "Release", value = "版本")
        private String release;
        /**
         * 得到 版本
         * @return
         */
        public String getRelease() {
                return release;
        }
        /**
         * 设置 版本
         * @param release
         */
        public void setRelease(String release) {
                this.release = release;
        }
    
                

        
        @ApiModelProperty(name = "Lat", value = "最后登录纬度")
        private String lat;
        /**
         * 得到 最后登录纬度
         * @return
         */
        public String getLat() {
                return lat;
        }
        /**
         * 设置 最后登录纬度
         * @param lat
         */
        public void setLat(String lat) {
                this.lat = lat;
        }
    
                

        
        @ApiModelProperty(name = "Lon", value = "最后登录经度")
        private String lon;
        /**
         * 得到 最后登录经度
         * @return
         */
        public String getLon() {
                return lon;
        }
        /**
         * 设置 最后登录经度
         * @param lon
         */
        public void setLon(String lon) {
                this.lon = lon;
        }
    
                

        
        @ApiModelProperty(name = "UserRoleID", value = "用户色色 ID")
        private Integer userRoleID;
        /**
         * 得到 用户色色 ID
         * @return
         */
        public Integer getUserRoleID() {
                return userRoleID;
        }
        /**
         * 设置 用户色色 ID
         * @param userRoleID
         */
        public void setUserRoleID(Integer userRoleID) {
                this.userRoleID = userRoleID;
        }
    

}
