package com.godwyn.ahp_project.result;

import com.godwyn.ahp_project.BasePresenter;
import com.godwyn.ahp_project.BaseView;

import java.util.List;

public interface AhpResultsDialogContract {

    interface View extends BaseView<Presenter> {
        void ahpResultsDialogConfiguration();
        void show();
        void close(android.view.View view);
        void showResults(float[] averagePriorityMatrix, float[][] preferenceMatrix, List<String> alternatives, List<String> criterions);
    }

    interface Presenter extends BasePresenter {
        void loadInspectionFromProblemsIdentified(String problemIdentifiedGuid);
    }
}
