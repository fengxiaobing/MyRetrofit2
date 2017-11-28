package com.bing.myretrofit.http;

import com.bing.myretrofit.api.WeatherApi;
import com.bing.myretrofit.interactor.HttpParamInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by RF
 * on 2017/11/28.
 */

public class Api {
    private static WeatherApi SERVICE;
    /**
     * 请求超时时间
     */
    public static final int DEFAULT_TIMEPUT = 10000;
    public static WeatherApi getDefalut() {
        synchronized (Api.class) {
            if (SERVICE == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.connectTimeout(DEFAULT_TIMEPUT, TimeUnit.SECONDS);
                //拦截器
                HttpParamInterceptor httpParamInterceptor = new HttpParamInterceptor();
                builder.addInterceptor(httpParamInterceptor);
                OkHttpClient client = builder.build();

                SERVICE = new Retrofit.Builder()
                        .baseUrl("http://tj.nineton.cn")
                        .addConverterFactory(ScalarsConverterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .client(client)
                        .build().create(WeatherApi.class);
            }
            return SERVICE;
        }
    }
}
