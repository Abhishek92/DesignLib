package com.android.design;

import com.google.gson.annotations.Expose;

/**
 * Created by hp pc on 02-07-2015.
 */
public class CommonResponse {

    @Expose
    private String isSuccess;
    @Expose
    private String message;

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

}

