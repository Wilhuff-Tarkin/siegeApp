package com.example.citydefense;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatDialogFragment;

public class LostDialogMorale extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Przegrana")

                //pass information here about days passed
                //todo
                // https://www.youtube.com/watch?v=HZYYjY2NSKk

                .setMessage("Twoi ludzie stracili ducha walki. Zamek został poddany po X dniach oblężenia")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {


                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        return builder.create();
    }
}