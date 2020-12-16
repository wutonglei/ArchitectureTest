package com.example.architecturetest.mvp.simple1.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;


public abstract class BaseMvpActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {
    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getActivityLayoutId());
        ButterKnife.bind(this);
        mPresenter = createPresenter();
        mPresenter.attach(this);
        initData();
        initView();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        createPresenter().detach();
    }

    protected abstract void initView();

    protected abstract void initData();

    protected abstract P createPresenter();

    protected abstract int getActivityLayoutId();


    protected P getPresenter() {
        return mPresenter;
    }
}
