package com.example.architecturetest.mvp.simple1.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public abstract class BaseMvpActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {
    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getActivityLayoutId());
        mPresenter=getPresenter();
        mPresenter.attach(this);
        initData();
        initView();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getPresenter().detach();
    }

    protected abstract void initView();

    protected abstract void initData();

    protected abstract P getPresenter();

    protected abstract int getActivityLayoutId();


}
