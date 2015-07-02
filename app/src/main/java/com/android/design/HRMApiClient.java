package com.android.design;

import retrofit.RestAdapter;

/**
 * Created by hp pc on 02-07-2015.
 */
public class HRMApiClient {

    private final static String API_URL = "http://hrm-360.elasticbeanstalk.com/hrm360";
    private static ApiInterface.LoginApi sLoginApi = null;
    private static ApiInterface.ForgotPasswordApi sForgotPasswordApi = null;
    private static ApiInterface.LogoutApi sLogoutApi = null;

    private static RestAdapter getRestAdapter()
    {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        return restAdapter;
    }
    public static ApiInterface.LoginApi getLoginApi()
    {
        if(sLoginApi == null)
            sLoginApi = getRestAdapter().create(ApiInterface.LoginApi.class);

        return sLoginApi;
    }

    public static ApiInterface.ForgotPasswordApi getForgotPasswordApi()
    {
        if(sForgotPasswordApi == null)
            sForgotPasswordApi = getRestAdapter().create(ApiInterface.ForgotPasswordApi.class);

        return sForgotPasswordApi;
    }

    public static ApiInterface.LogoutApi getLogoutApi()
    {
        if(sLogoutApi == null)
            sLogoutApi = getRestAdapter().create(ApiInterface.LogoutApi.class);

        return sLogoutApi;
    }
}
