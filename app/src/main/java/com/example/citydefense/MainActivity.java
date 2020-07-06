package com.example.citydefense;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNewGame;
    Button btnHowToPlay;
    Button btnLoadGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewGame = findViewById(R.id.btnNewGame);
        btnHowToPlay = findViewById(R.id.btnHowToPlay);
        btnLoadGame = findViewById(R.id.btnLoadGame);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_new_game);

            }
        });

    }
}
