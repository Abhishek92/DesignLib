package com.android.design;

import java.util.Map;

import retrofit.Callback;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by hp pc on 02-07-2015.
 */
public interface LoginApi {

    @FormUrlEncoded
    @POST("/loginUser")
    public void doLogin(@FieldMap Map<String, Object> params, Callback<Login> callback);
}
