package com.example.architecturetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 分俩个块  一个块写mvp的  一块写mvvm的
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_mvp)
    Button btnMvp;
    @BindView(R.id.btn_mvvm)
    Button btnMvvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_mvp, R.id.btn_mvvm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_mvp:

                break;
            case R.id.btn_mvvm:
                break;
        }
    }
}
