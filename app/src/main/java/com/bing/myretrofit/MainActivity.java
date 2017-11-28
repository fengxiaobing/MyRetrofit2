package com.bing.myretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.bing.myretrofit.bean.WeatherData;
import com.bing.myretrofit.bean.WeatherDataBean;
import com.bing.myretrofit.http.Api;
import com.bing.myretrofit.http.HttpUtil;
import com.bing.myretrofit.http.ProgressSubscriber;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= (TextView) findViewById(R.id.tv_normal);
        tv.setOnClickListener(this);
        TextView tv_Rxjava= (TextView) findViewById(R.id.tv_Rxjava);
        tv_Rxjava.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_normal:
                Call<WeatherDataBean> call = Api.getDefalut().getString("CHSH000000");
                call.clone().enqueue(new Callback<WeatherDataBean>() {
                    @Override
                    public void onResponse(Call<WeatherDataBean> call, Response<WeatherDataBean> response) {
                        WeatherDataBean weatherDataBean = response.body();
                        Log.e("","");
                    }

                    @Override
                    public void onFailure(Call<WeatherDataBean> call, Throwable t) {

                    }
                });
                break;
            case R.id.tv_Rxjava:


                Observable ob = Api.getDefalut().getObservable11("CHSH000000");
                HttpUtil.getInstance().toSubscribe(ob, new ProgressSubscriber<List<WeatherData>> (this) {

                    @Override
                    protected void _onNext(List<WeatherData> weatherData) {
                        List<WeatherData> weatherDataBean = weatherData;
                        Log.e("","");
                    }

                    @Override
                    protected void _onError(String message) {

                    }
                });





//                Api.getDefalut()
//                        .getText()
//                        .subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe(new Subscriber<WeatherDataBean>() {
//                            @Override
//                            public void onCompleted() {
//
//                            }
//                            @Override
//                            public void onError(Throwable e) {
//
//                            }
//                            @Override
//                            public void onNext(WeatherDataBean weatherDataBean) {
//                                WeatherDataBean weatherDataBean1 = weatherDataBean;
//                                Log.e("","");
//                            }
//                        });
                break;
        }
    }
}
