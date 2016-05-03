package com.zentcode.cursapp;

import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by luis on 03/05/16.
 */
public class DialogAlert_Logout extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialog_cerrar_sesion)
                .setPositiveButton(R.string.dialog_si, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(getContext(), Login.class);
                         startActivity(intent);
                    }
                })
                .setNegativeButton(R.string.dialog_cancelar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

}

