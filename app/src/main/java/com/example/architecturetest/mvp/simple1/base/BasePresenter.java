package com.example.architecturetest.mvp.simple1.base;


public class BasePresenter<V extends BaseView> {

    private V mView;

    public void attach(V view){
        this.mView=view;
    }
    // 不解绑的问题 Activity -> Presenter  ,Presenter 持有了 Activity 应该是会有内存泄漏
    public void detach(){
        mView=null;
    }
    public V getView(){
        return mView;
    }
}
