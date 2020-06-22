package com.example.citydefense;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnHowToPlay;
    Button btnNewGame;
    Button btnLoadGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHowToPlay = findViewById(R.id.btnHowToPlay);
        btnNewGame = findViewById(R.id.btnNewGame);
        btnLoadGame = findViewById(R.id.btnLoadGame);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_new_game);

            }
        });

    }
}
