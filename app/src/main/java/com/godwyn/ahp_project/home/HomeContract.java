package com.godwyn.ahp_project.home;

import com.ahpandroid.BasePresenter;
import com.ahpandroid.BaseView;


public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void goToDashboard(android.view.View view);
        void showAppInfo(android.view.View view);
        void closeAppInfo(android.view.View view);
        void goToDenisGithub(android.view.View view);
        void goToGabrielGithub(android.view.View view);
        void goToProjectGithub(android.view.View view);
    }

    interface Presenter extends BasePresenter {}
}
