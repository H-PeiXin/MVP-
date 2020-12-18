package com.example.p7_1_14.contract;

import com.example.mvplibrary.base.BaseModel;
import com.example.mvplibrary.base.BaseView;
import com.example.mvplibrary.utils.net.INetCallBack;
import com.example.p7_1_14.model.UserBean;

public class MainContract {
    public interface IMainModel extends BaseModel {
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }

    public interface IMainPresenter{
        void login(String name,String password);
        void loginResult(String result);
    }

    public interface IMainView extends BaseView {
        String getUserName();
        String password();
        void getData(UserBean string);
    }
}
