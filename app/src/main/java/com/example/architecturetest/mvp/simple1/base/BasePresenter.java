package com.example.architecturetest.mvp.simple1.base;


import android.util.Log;

public class BasePresenter<V extends BaseView> {
    private static final String TAG = "BasePresenter";
    private V mView;

    public void attach(V view){
        Log.i(TAG, "attach: "+view);
        this.mView=view;
        Log.i(TAG, "attach: "+mView);
    }
    // 不解绑的问题 Activity -> Presenter  ,Presenter 持有了 Activity 应该是会有内存泄漏
    public void detach(){
        Log.i(TAG, "detach: ");
        mView=null;
    }
    public V getView(){
        Log.i(TAG, "getView: "+mView);
        return mView;
    }
}
