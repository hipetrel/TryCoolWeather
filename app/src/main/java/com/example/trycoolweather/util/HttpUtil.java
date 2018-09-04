package com.example.trycoolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wqc on 2018/9/4.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, Callback callback){

        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);

    }
}
