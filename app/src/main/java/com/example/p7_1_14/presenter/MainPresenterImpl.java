package com.example.p7_1_14.presenter;

import com.example.mvplibrary.base.BasePresenter;
import com.example.mvplibrary.utils.net.INetCallBack;
import com.example.p7_1_14.contract.MainContract;
import com.example.p7_1_14.model.UserBean;

public class MainPresenterImpl extends BasePresenter<MainContract.IMainView,MainContract.IMainModel> implements MainContract.IMainPresenter {
    @Override
    public MainContract.IMainModel getiModel() {
        return null;
    }

    @Override
    public void login(String name, String password) {
        //URL就在p层确定，不要从Activity中传递过来
        iModel.getLoginData("", new INetCallBack<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                iView.getData(userBean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {

    }
}
