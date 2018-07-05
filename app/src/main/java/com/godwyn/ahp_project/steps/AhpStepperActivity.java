package com.godwyn.ahp_project.steps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class AhpStepperActivity extends DotStepper {

    private int i = 0;
    private AlertDialog alertDialog;
    AlertDialog.Builder alertDialogBuilder;
    private AhpMatrices ahpMatrices;
    public static final int AHP_STEPPER_ACTION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setErrorTimeout(1500);
        setTitle("Select the Preferences");

        Intent intent = getIntent();
        AhpMethod ahpMethod = (AhpMethod) intent.getSerializableExtra("ahpBundle");

        List<String> alternatives = ahpMethod.getAlternatives();
        List<String> criterions = ahpMethod.getCriterions();

        addStep(createFragment(new InitialStep()));
        for(int x = 0; x < 4; x++){
            addStep(createFragment(new ComparisonStep(alternatives, criterions.get(x),x)));
        }
        addStep(createFragment(new ComparisonStep(criterions,"Comparison of their criteria",4)));

        configureAlertDialogOnBackPressed();

        super.onCreate(savedInstanceState);
    }

    private void configureAlertDialogOnBackPressed(){
        alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Are you sure you want to exit ? ");
        alertDialogBuilder.setMessage("If you exit " +
                "all information will be lost.");

        alertDialogBuilder.setPositiveButton("Yes",
                (dialog, which) -> {
                    finish();
                });
        alertDialogBuilder.setNegativeButton("No",
                (dialog, which) -> {
                    alertDialog.cancel();
                });
        alertDialog = alertDialogBuilder.create();
    }

    private AbstractStep createFragment(AbstractStep fragment) {
//        Bundle b = new Bundle();
//        b.putSerializable("Tab_"+i, criterionMatrix);
//        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onComplete() {
        super.onComplete();

        ahpMatrices = new AhpMatrices();

        for(int x = 0; x < 4; x++) {

            float[][] stepMatrix = (float[][]) getExtras().getSerializable("Tab_" + x);
            imprimeMatriz(stepMatrix);
            switch (x) {
                case 0:
                    ahpMatrices.setCriterionOneMatrix(stepMatrix);
                    break;
                case 1:
                    ahpMatrices.setCriterionTwoMatrix(stepMatrix);
                    break;
                case 2:
                    ahpMatrices.setCriterionThreeMatrix(stepMatrix);
                    break;
                case 3:
                    ahpMatrices.setCriterionFourMatrix(stepMatrix);
                    break;
            }
        }

        float [][] preferenceMatrix = ahpMatrices.generateResultMatrix();


        float[][] criterionMatrix = (float[][]) getExtras().getSerializable("Tab_4");
        float [][] priorityMatrix = ahpMatrices.normalize(criterionMatrix);
        float [] averagePriorityMatrix = ahpMatrices.calculateAverageMatrix(priorityMatrix);


        Intent returnIntent = new Intent();
        returnIntent.putExtra("preferenceMatrix",preferenceMatrix);
        returnIntent.putExtra("averagePriorityMatrix",averagePriorityMatrix);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();

        Toast.makeText(getApplicationContext(), "Completed Steps !", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed(){
        alertDialog.show();
    }

    private void imprimeMatriz(float [][] criterion1matrix3){
        for(float[] c : criterion1matrix3){

            for(float elemento : c)
                System.out.printf(" %.2f ", elemento);
            System.out.printf("\n");
        }

    }




}
