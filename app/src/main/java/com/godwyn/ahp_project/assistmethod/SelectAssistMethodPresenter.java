package com.godwyn.ahp_project.assistmethod;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

public class SelectAssistMethodPresenter implements SelectAssistMethodContract.Presenter {

    private final SelectAssistMethodContract.View mDashboardView;

    public SelectAssistMethodPresenter(@NonNull SelectAssistMethodContract.View dashboardView) {

        this.mDashboardView = checkNotNull(dashboardView);

        mDashboardView.setPresenter(this);
    }

}