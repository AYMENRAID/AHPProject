package com.godwyn.ahp_project.assistmethod;

import com.ahpandroid.BasePresenter;
import com.ahpandroid.BaseView;

public interface SelectAssistMethodContract {

    interface View extends BaseView<Presenter> {
        void goToAHP();
        void goToRegression();
        void goToProgression();
    }

    interface Presenter extends BasePresenter {}
}
