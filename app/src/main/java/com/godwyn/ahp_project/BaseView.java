package com.godwyn.ahp_project;

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
