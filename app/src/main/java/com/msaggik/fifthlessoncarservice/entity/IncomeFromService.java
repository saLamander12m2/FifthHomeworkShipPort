package com.msaggik.fifthlessoncarservice.entity;

public class IncomeFromService extends Income {

    private int countShip;
    private int costServicingOneVessel;

    public IncomeFromService(int countShip, int costServicingOneVessel) {
        this.countShip = countShip;
        this.costServicingOneVessel = costServicingOneVessel;
    }

    @Override
    public float calculatingIncome() {
        return countShip * costServicingOneVessel;
    }
}
