package com.example.mvplibrary.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {
    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());

        if (presenter==null){
            presenter=add();
            presenter.attachView(this);
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    public abstract P add();

    protected abstract int getLayoutID();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑MVP
        if (presenter!=null){
            presenter.detachView();
        }
    }
}
