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

    //starting values for the players castle
    int dayOfSiege = 1;
    int morale = 98;
    int populationPeasants = 20;
    int populationArchers = 30;
    int populationInfantry = 50;
    int stateOfDefenses = 100;
    int food = 100;
    int granarySize = 200;
    int rationsSize = 82;

    //starting values for the AI
    int enemyMorale = 100;
    int enemyPopulation = 500;
    int enemyFood = 500;
    int enemyValor = 20;

    //other var
    int changeInStateOfDefense = 0;



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

        tvDayOfSiege.setText(String.valueOf(dayOfSiege));
        tvMorale.setText(String.valueOf(morale));
        tvPopulationPeasants.setText(String.valueOf(populationPeasants));
        tvPopulationArchers.setText(String.valueOf(populationArchers));
        tvPopulationInfantry.setText(String.valueOf(populationInfantry));
        tvStateOfDefenses.setText(String.valueOf(stateOfDefenses));
        tvFood.setText(String.valueOf(food));
        tvGranarySize.setText(String.valueOf(granarySize));
        tvRationsSize.setText(String.valueOf(rationsSize));

//        https://ciekawostkihistoryczne.pl/2019/10/01/trebusze-podstepy-i-tluste-swinie-jak-wygladaly-oblezenia-sredniowiecznych-zamkow/


        btnEndTurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculateAttack();
                calculateMorale();

                if (checkIfSiegeContinues()) {
                    updateTimeOfSiege();
                }

            }
        });

    }

    private void calculateAttack() {

        changeInStateOfDefense = ((enemyMorale * enemyValor)/enemyPopulation);
        stateOfDefenses -= changeInStateOfDefense;
        tvStateOfDefenses.setText(String.valueOf(stateOfDefenses));


    }

    private boolean checkIfSiegeContinues() {

       if (morale > 0) {
           return true;
       }
       else
       {
           openLostDialogMorale();
           //todo przejscie do main ?
           return false;
       }

    }

    private void openLostDialogMorale() {

        LostDialogMorale lostDialogMorale = new LostDialogMorale();
        lostDialogMorale.show(getSupportFragmentManager(), "dialog");


    }

    private void calculateMorale() {

        morale = Math.round((morale * rationsSize)/100);
        tvMorale.setText(String.valueOf(morale));

        }


    private void updateTimeOfSiege() {
        dayOfSiege++;
        tvDayOfSiege.setText(String.valueOf(dayOfSiege));
    }
}
