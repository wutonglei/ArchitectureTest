package com.example.architecturetest.mvp.simple1;

import com.example.architecturetest.bean.UserBean;

public class UserModel implements UserContract.UserModel {


    @Override
    public UserBean getUserData(String name, String password) {

        return new UserBean(name + password);
    }

    @Override
    public UserBean getUserData(String name, String password, String code) {
        return new UserBean(name + password + code);
    }
}
