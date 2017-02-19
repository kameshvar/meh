package com.example.ctadmin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity5 extends AppCompatActivity {
    int quizScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        RadioGroup rbGroup2 = (RadioGroup) findViewById(R.id.q2_options);
        int selectedId2 = rbGroup2.getCheckedRadioButtonId();
        if (selectedId2 != -1) {
            RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId2);
            String radioButtonText2 = selectedRadioButton2.getText().toString();
            if ((radioButtonText2).equals(getString(R.string.q2answer))) {
                quizScore = quizScore + 1;
            }
        }

        CheckBox qAnswer1 = (CheckBox) findViewById(R.id.checkbox1);
        boolean isChecked1 = qAnswer1.isChecked();
        CheckBox qAnswer2 = (CheckBox) findViewById(R.id.checkbox2);
        boolean isChecked2 = qAnswer2.isChecked();
        CheckBox qAnswer3 = (CheckBox) findViewById(R.id.checkbox3);
        boolean isChecked3 = qAnswer3.isChecked();
        CheckBox qAnswer4 = (CheckBox) findViewById(R.id.checkbox4);
        boolean isChecked4 = qAnswer4.isChecked();
        if (isChecked2 && isChecked4 && !isChecked1 && !isChecked3) {
            quizScore = quizScore + 1;
        }

    }
}
