package com.bing.myretrofit;

import android.app.Application;

import com.bing.myretrofit.api.WeatherApi;
import com.bing.myretrofit.interactor.HttpParamInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by RF
 * on 2017/11/28.
 */

public class App extends Application{
    /**
     * 请求超时时间
     */
    public static final int DEFAULT_TIMEPUT = 10000;
    private static App INSTANCE;

    public static App getInstance(){
        return INSTANCE;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }



}
