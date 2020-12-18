package com.example.mvplibrary.base;

public abstract class BasePresenter<V extends BaseView,M extends BaseModel> {
    public V iView;
    public M iModel;
    private V v;

    public void attachView(V v){
        this.v = v;
        iModel=null;
    }

    public void detachView(){
        iView=null;
        iModel=null;
    }
    public abstract M getiModel();
}
