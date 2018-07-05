package com.godwyn.ahp_project.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.godwyn.ahp_project.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        private AhpDashboardFragment mAhpDashboardFragment;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.ahp_dashboard_act);

            if (mAhpDashboardFragment == null) {
                mAhpDashboardFragment = AhpDashboardFragment.newInstance();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.ahp_dashboard_content_frame, mAhpDashboardFragment).commit();
            }
        }
    }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {

            Toast.makeText(this,"init on ActivityResult", Toast.LENGTH_SHORT).show();

            super.onActivityResult(requestCode, resultCode, data);

        }

}
