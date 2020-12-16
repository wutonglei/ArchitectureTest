package com.example.architecturetest.mvp.simple1;


import com.example.architecturetest.mvp.simple1.base.BasePresenter;

public class UserPresenter extends BasePresenter<MvpActivity> implements UserContract.UserPresenter{

    private UserContract.UserModel model;
    public UserPresenter() {
        model=new UserModel();
    }

    @Override
    public void getUser(String name, String password) {
        getView().onLoading();
        model.getUserData(name,password);
       getView().onError();

    }

    @Override
    public void register(String name, String password, String code) {
        model.getUserData(name,password,code);
        getView().onSuccess();

    }
}
