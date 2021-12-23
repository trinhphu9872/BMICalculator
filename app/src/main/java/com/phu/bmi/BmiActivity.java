package com.phu.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity {
// setup init
    TextView bmiValue, bmiCategory,bmiTips;
    String bmiValOutput;
    Button calculateAgainBtn;
    String[] bmiTipsArray,bmiCatelory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        matching();
        bmiValOutput = getIntent().getStringExtra("bmiVal");
        bmiValue.setText(bmiValOutput);
        findCategory();
        categoryTips();
        calculateAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
// find id text
    private void matching() {
        bmiValue = findViewById(R.id.bmi_value);
        bmiCategory = findViewById(R.id.bmi_category);
        bmiTips = findViewById(R.id.bmi_tips);
        bmiTipsArray = getResources().getStringArray(R.array.tips_array);
        bmiCatelory = getResources().getStringArray(R.array.catelory_array);
        calculateAgainBtn = findViewById(R.id.calculate_again_btn);
    }
//Fun tips
    private void categoryTips() {
        double result = Double.parseDouble(bmiValOutput);
        if(result < 15){
            bmiTips.setText(bmiTipsArray[0]);
        }
        else if(result >= 15 && result <= 16){
            bmiTips.setText(bmiTipsArray[0]);
        }
        else if(result >= 16 && result <= 18.5){
            bmiTips.setText(bmiTipsArray[1]);
        }
        else if(result >= 18.5 && result <= 25){
            bmiTips.setText(bmiTipsArray[2]);
        }
        else if(result >= 25 && result <= 30){
            bmiTips.setText(bmiTipsArray[3]);
        }
        else if(result >=30 && result <= 35){
            bmiTips.setText(bmiTipsArray[4]);
        }
        else if(result >= 35 && result <= 50){
            bmiTips.setText(bmiTipsArray[4]);
        }
        else
            bmiTips.setText(bmiTipsArray[4]);

    }
//Fin cate
    private void findCategory() {
        double result = Double.parseDouble(bmiValOutput);
        if(result < 15){
            bmiCategory.setText(bmiCatelory[0]);
        }
        else if(result >= 15 && result <= 16){

            bmiCategory.setText(bmiCatelory[1]);
        }
        else if(result >= 16 && result <= 18.5){

            bmiCategory.setText(bmiCatelory[2]);
        }
        else if(result >= 18.5 && result <= 25){

            bmiCategory.setText(bmiCatelory[3]);
        }
        else if(result >= 25 && result <= 30){

            bmiCategory.setText(bmiCatelory[4]);
        }
        else if(result >=30 && result <= 35){

            bmiCategory.setText(bmiCatelory[5]);
        }
        else if(result >= 35 && result <= 50){

            bmiCategory.setText(bmiCatelory[6]);

        }
        else

        bmiCategory.setText(bmiCatelory[7]);

    }
}