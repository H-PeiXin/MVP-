package com.example.p7_1_14.view;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.mvplibrary.base.BaseActivity;
import com.example.p7_1_14.R;
import com.example.p7_1_14.contract.MainContract;
import com.example.p7_1_14.model.UserBean;
import com.example.p7_1_14.presenter.MainPresenterImpl;

public class LoginActivity extends BaseActivity<MainPresenterImpl> implements MainContract.IMainView {


    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;

    @Override
    protected void initData() {
        presenter.login(getUserName(),password());
    }

    @Override
    protected void initView() {
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
    }

    @Override
    public MainPresenterImpl add() {
        return new MainPresenterImpl();
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public String getUserName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String password() {
        return editTextTextPassword.getText().toString();
    }

    @Override
    public void getData(UserBean string) {
        //网络数据返回
    }

    public void loginButton(View view) {
        if (!TextUtils.isEmpty(getUserName())&&!TextUtils.isEmpty(password())){
            presenter.login(getUserName(),password());
        }
    }
}