package com.android.design;

import java.util.Map;

import retrofit.Callback;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by hp pc on 02-07-2015.
 */
public interface ApiInterface {

    interface LoginApi
    {
        @FormUrlEncoded
        @POST("/rest/loginUser")
        void doLogin(@FieldMap Map<String, Object> params, Callback<Login> callback);
    }

    interface ForgotPasswordApi
    {
        @FormUrlEncoded
        @POST("/rest/forgotPassword")
        void forgotPassword(@FieldMap Map<String, Object> params, Callback<CommonResponse> callback);
    }

    interface LogoutApi
    {
        @FormUrlEncoded
        @POST("/rest/logout")
        void doLogout(@FieldMap Map<String, Object> params, Callback<CommonResponse> callback);
    }


}
