package com.android.design;

import com.google.gson.annotations.Expose;

public class Login {

    @Expose
    private Object userId;
    @Expose
    private String message;
    @Expose
    private String isSuccess;
    @Expose
    private Object userName;
    @Expose
    private Object profileURL;
    @Expose
    private Object companyId;
    @Expose
    private Object roleId;

    /**
     *
     * @return
     * The userId
     */
    public Object getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The userId
     */
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The isSuccess
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    /**
     *
     * @param isSuccess
     * The isSuccess
     */
    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     *
     * @return
     * The userName
     */
    public Object getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     * The userName
     */
    public void setUserName(Object userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     * The profileURL
     */
    public Object getProfileURL() {
        return profileURL;
    }

    /**
     *
     * @param profileURL
     * The profileURL
     */
    public void setProfileURL(Object profileURL) {
        this.profileURL = profileURL;
    }

    /**
     *
     * @return
     * The companyId
     */
    public Object getCompanyId() {
        return companyId;
    }

    /**
     *
     * @param companyId
     * The companyId
     */
    public void setCompanyId(Object companyId) {
        this.companyId = companyId;
    }

    /**
     *
     * @return
     * The roleId
     */
    public Object getRoleId() {
        return roleId;
    }

    /**
     *
     * @param roleId
     * The roleId
     */
    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

}

