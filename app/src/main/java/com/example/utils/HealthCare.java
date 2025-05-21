package com.example.utils;

import android.app.Activity;

import com.example.k22411csampleproject.R;

public class HealthCare {
    public static BMIResults calculate(double height, double weight, Activity context) {
        double BMI = weight/Math.pow(height/100.0,2);
        BMIResults results = new BMIResults();
        results.setBMI(BMI);
        String des = "";
        if (BMI < 18.5)
            des = context.getResources().getString(R.string.title_slim);
        else if (BMI < 23) {
            des = context.getResources().getString(R.string.title_normal);

        }
        else
            des = context.getResources().getString(R.string.title_fat);
        results.setDescription(des);
        return results;

    }
}
