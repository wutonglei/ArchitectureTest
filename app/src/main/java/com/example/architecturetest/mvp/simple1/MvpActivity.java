package com.example.architecturetest.mvp.simple1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.architecturetest.R;
import com.example.architecturetest.mvp.simple1.base.BaseMvpActivity;
import com.example.architecturetest.mvp.simple1.base.BasePresenter;

import org.w3c.dom.Text;


public class MvpActivity extends BaseMvpActivity<UserPresenter> implements UserContract.UserView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
   private TextView tv;
    private   TextView tvError;
    @Override
    protected void initView() {

        tvError = findViewById(R.id.tv_error);
        tv = findViewById(R.id.tv_loading);
        tv.setVisibility(View.GONE);
        tvError.setVisibility(View.GONE);
    }

    @Override
    protected void initData() {
        getPresenter().getUser("sdsada", "dsadsad132121");

    }

    @Override
    protected UserPresenter getPresenter() {
        return new UserPresenter();
    }

    @Override
    protected int getActivityLayoutId() {
        return R.layout.activity_mvp;
    }

    private static final String TAG = "MvpActivity";
    @Override
    public void onLoading() {
        tv.setVisibility(View.VISIBLE);
        Log.i(TAG, "onLoading: ");
    }

    @Override
    public void onSuccess() {
        tv.setVisibility(View.GONE);
        Log.i(TAG, "onSuccess: ");
    }

    @Override
    public void onError() {
        tvError.setVisibility(View.VISIBLE);
        Log.i(TAG, "onError: ");
    }
}
