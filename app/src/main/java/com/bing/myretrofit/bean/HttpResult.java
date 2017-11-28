package com.bing.myretrofit.bean;

/**
 * Created by RF
 * on 2017/11/28.
 */

public class HttpResult<T> {
    private String status;
    private T weather;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getWeather() {
        return weather;
    }

    public void setWeather(T weather) {
        this.weather = weather;
    }

    public HttpResult(String status, T weather) {
        this.status = status;
        this.weather = weather;
    }
}
