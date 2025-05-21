package com.example.utils;

public class BMIResults {
    private double BMI;

    public BMIResults() {
    }

    private String description;

    public BMIResults(double BMI, String description) {
        this.BMI = BMI;
        this.description = description;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
