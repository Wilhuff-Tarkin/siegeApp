package com.example.citydefense;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewGame extends AppCompatActivity {

    TextView tvDayOfSiege;
    TextView tvMorale;
    TextView tvPopulationPeasants;
    TextView tvPopulationArchers;
    TextView tvPopulationInfantry;
    TextView tvStateOfDefenses;
    TextView tvFood;
    TextView tvGranarySize;
    TextView tvRationsSize;

    Button btnCommandPeasants;
    Button btnCommandArchers;
    Button btnCommandInfantry;
    Button btnEndTurn;

    int dayOfSiege = 1;
    int morale = 100;
    int populationPeasants = 50;
    int populationArchers = 25;
    int populationInfantry = 25;
    int stateOfDefenses = 100;
    int food = 100;
    int granarySize = 200;
    int rationsSize = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        tvDayOfSiege = findViewById(R.id.tvDayOfSiege);
        tvMorale = findViewById(R.id.tvMorale);
        tvPopulationPeasants = findViewById(R.id.tvPopulationPeasants);
        tvPopulationArchers = findViewById(R.id.tvPopulationArchers);
        tvPopulationInfantry = findViewById(R.id.tvPopulationInfantry);
        tvStateOfDefenses = findViewById(R.id.tvStateOfDefenses);
        tvFood = findViewById(R.id.tvFood);
        tvGranarySize = findViewById(R.id.tvGranarySize);
        tvRationsSize = findViewById(R.id.tvRationsSize);

        btnCommandPeasants = findViewById(R.id.btnCommandPeasants);
        btnCommandArchers = findViewById(R.id.btnCommandArchers);
        btnCommandInfantry = findViewById(R.id.btnCommandInfantry);
        btnEndTurn = findViewById(R.id.btnEndTurn);

        //initial values setup
//TODO nie nadaje tych wartosci na layout poki co

        tvDayOfSiege.setText(String.valueOf(dayOfSiege));
        tvMorale.setText(String.valueOf(morale));
        tvPopulationPeasants.setText(String.valueOf(populationPeasants));
        tvPopulationArchers.setText(String.valueOf(populationArchers));
        tvPopulationInfantry.setText(String.valueOf(populationInfantry));
        tvStateOfDefenses.setText(String.valueOf(stateOfDefenses));
        tvFood.setText(String.valueOf(food));
        tvGranarySize.setText(String.valueOf(granarySize));
        tvRationsSize.setText(String.valueOf(rationsSize));

        btnEndTurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //is this the place for the calling actual game mechanics methods?

                dayOfSiege++;

                if (morale>0){
                    morale-=10;
                }

                if (stateOfDefenses>0){
                    stateOfDefenses-=10;
                }

                if (food>0){
                    food-=(populationPeasants+populationArchers+populationInfantry);
                }

            }
        });

    }
}
