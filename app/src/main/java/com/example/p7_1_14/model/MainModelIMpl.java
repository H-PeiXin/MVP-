package com.example.p7_1_14.model;

import com.example.mvplibrary.utils.net.INetCallBack;
import com.example.mvplibrary.utils.net.RetrofitUtils;
import com.example.p7_1_14.contract.MainContract;

public class MainModelIMpl implements MainContract.IMainModel{
    private MainContract.IMainPresenter presenter;

    public MainModelIMpl(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {
        presenter.loginResult("成功");
        RetrofitUtils.getInstance().get(url,callBack);
    }
}
