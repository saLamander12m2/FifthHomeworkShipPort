package com.msaggik.fifthlessoncarservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.msaggik.fifthlessoncarservice.entity.Income;
import com.msaggik.fifthlessoncarservice.entity.IncomeFromService;
import com.msaggik.fifthlessoncarservice.entity.RentalIncome;

public class MainActivity extends AppCompatActivity {


    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        output = findViewById(R.id.output);

        // создание объектов
        RentalIncome rentalIncome = new RentalIncome(170000);
        Income incomeFromService = new IncomeFromService(125, 3500);

        float totalIncome = rentalIncome.getCountIncome() + incomeFromService.calculatingIncome();
        output.append("Порт заработал: \n" + totalIncome);
    }
}