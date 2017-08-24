package com.example.mauro.presentationmvp;

/**
 * Created by mauro on 8/24/17.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V v);

    void detachView();
}
