package com.bing.myretrofit.http;


import com.bing.myretrofit.bean.HttpResult;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

/**

/**
 * Created by RF 
 * on 2016/12/23.
 */
public class HttpUtil {

    /**
     * 构造方法私有
     */
    private HttpUtil() {

    }

    /**
     * 在访问HttpMethods时创建单例
     */
    private static class SingletonHolder {
        private static final HttpUtil INSTANCE = new HttpUtil();
    }

    /**
     * 获取单例
     */
    public static HttpUtil getInstance() {
        return SingletonHolder.INSTANCE;
    }


    /**
     * 添加线程管理并订阅
     * @param ob
     * @param subscriber

     */
    public void toSubscribe(Observable ob, final ProgressSubscriber subscriber) {
        //数据预处理
        Observable.Transformer<HttpResult<Object>, Object> result = RxHelper.handleResult();
        Observable observable = ob.compose(result)
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        //显示Dialog和一些其他操作
                        subscriber.showProgressDialog();
                    }
                });
        observable.subscribe(subscriber);
//        load(observable).subscribe(subscriber);
    }


    /**
     * 可以用来缓存数据。
     * concat会三个数据源都会请求的。如何使得哪层有数据就用哪层的，之后就不走后面的逻辑了
     *  first()-> if no data from observables will cause exception :
     * java.util.NoSuchElementException: Sequence contains no elements
     * takeFirst -> no exception
     * @param fromNetwork 网络获取的数据
     * @param <T>
     * @return
     */
    public static <T> Observable<T> load(Observable<T> fromNetwork) {
        //假设是从内存中获取的数据
        Observable<T> fromCache = Observable.create(new Observable.OnSubscribe<T>() {
            @Override
            public void call(Subscriber<? super T> subscriber) {
                    subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            return Observable.concat(fromCache, fromNetwork).takeFirst(new Func1<T, Boolean>() {
                @Override
                public Boolean call(T t) {
                    return t!=null;
                }
            });
        }
    }
