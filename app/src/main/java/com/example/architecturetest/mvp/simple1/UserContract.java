package com.example.architecturetest.mvp.simple1;

import com.example.architecturetest.bean.UserBean;

public class UserContract {
    interface UserView {
        void onLoading();

        void onSuccess();

        void onError();


    }

    interface UserPresenter {
        void getUser(String name, String password);

        void register(String name, String password, String code);
    }


    interface UserModel {
        UserBean getUserData(String name, String password);
        UserBean getUserData(String name, String password, String code);
    }


}
