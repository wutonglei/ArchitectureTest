package com.example.architecturetest.mvp.simple1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecturetest.R;
import com.example.architecturetest.mvp.simple1.base.BaseMvpActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class MvpActivity extends BaseMvpActivity<UserPresenter> implements UserContract.UserView {

    @BindView(R.id.tv_loading)
    TextView tvLoading;
    @BindView(R.id.tv_error)
    TextView tvError;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    protected void initView() {


        tvLoading.setVisibility(View.GONE);
        tvError.setVisibility(View.GONE);
    }

    @Override
    protected void initData() {


    }

    @Override
    protected UserPresenter createPresenter() {
        return new UserPresenter();
    }

    @Override
    protected int getActivityLayoutId() {
        return R.layout.activity_mvp;
    }

    private static final String TAG = "MvpActivity";

    @Override
    public void onLoading() {
        tvLoading.setVisibility(View.VISIBLE);
        Log.i(TAG, "onLoading: ");
    }

    @Override
    public void onSuccess() {
        tvLoading.setVisibility(View.GONE);
        Log.i(TAG, "onSuccess: ");
    }

    @Override
    public void onError() {
        tvError.setVisibility(View.VISIBLE);
        tvLoading.setVisibility(View.GONE);
        Log.i(TAG, "onError: ");
    }

    @OnClick({R.id.btn_login, R.id.btn_register})
    public void onViewClicked(View view) {
        tvLoading.setVisibility(View.GONE);
        tvError.setVisibility(View.GONE);
        switch (view.getId()) {
            case R.id.btn_login:
                getPresenter().getUser("111","121212");
                break;
            case R.id.btn_register:
                getPresenter().register("sadasdsad","dsadsadsa","1111");
                break;
        }
    }
}
