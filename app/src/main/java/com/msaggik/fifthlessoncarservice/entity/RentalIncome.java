package com.msaggik.fifthlessoncarservice.entity;

public class RentalIncome extends Income {
    private float countIncome;



    public RentalIncome(float countIncome) {
        this.countIncome = countIncome;
    }


    public float getCountIncome() {
        return countIncome;
    }

    public void setCountIncome(float countIncome) {
        this.countIncome = countIncome;
    }
}