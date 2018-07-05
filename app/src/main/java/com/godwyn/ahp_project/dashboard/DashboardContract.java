package com.godwyn.ahp_project.dashboard;

import com.godwyn.ahp_project.BasePresenter;
import com.godwyn.ahp_project.BaseView;

public interface DashboardContract {

    interface View extends BaseView<Presenter> {
        void startNew(android.view.View view);
        void addCriterion(android.view.View view);
        void addAlternative(android.view.View view);
        void openAddCriterionDialog(android.view.View view);
        void closeAddCriterionDialog(android.view.View view);
        void openAddAlternativeDialog(android.view.View view);
        void closeAddAlternativeDialog(android.view.View view);
        void checkListsContent();
    }

    interface Presenter extends BasePresenter {}
}
