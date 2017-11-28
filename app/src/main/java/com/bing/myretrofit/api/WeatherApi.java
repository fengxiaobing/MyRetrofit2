package com.bing.myretrofit.api;



import com.bing.myretrofit.bean.HttpResult;
import com.bing.myretrofit.bean.WeatherData;
import com.bing.myretrofit.bean.WeatherDataBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by RF
 * on 2017/11/28.
 */

public interface WeatherApi {

    //http://tj.nineton.cn/Heart/index/all?city=CHSH000000
    @GET("/Heart/index/all")
    Call<WeatherDataBean> getString(@Query("city")String city);

    @FormUrlEncoded
    @POST("/Heart/index/all")
    Observable<WeatherDataBean> getString1(@Field("city") String city);

    //使用 RxJava 的方法,返回一个 Observable
    @GET("/Heart/index/all")
    Observable<WeatherDataBean> getObservable(@Query("city")String city);
    @GET("/Heart/index/all")
    Observable<WeatherDataBean> getText();

    @GET("/Heart/index/all")
    Observable<HttpResult<List<WeatherData>>> getObservable11(@Query("city")String city);
}
