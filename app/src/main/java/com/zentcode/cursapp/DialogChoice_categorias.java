package com.zentcode.cursapp;

import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by luis on 03/05/16.
 */
public class DialogChoice_categorias extends DialogFragment {

    String[] string_titles = General.toolbar_titles;

   // final FragmentManager fragmentManager = getFragmentManager();
    final Fragment_mis_categorias fragment_mis_categorias = new Fragment_mis_categorias();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
      final ArrayList<Data_mis_categorias>  mSelectedItems = new ArrayList<Data_mis_categorias>(); // Where we track the selected items
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Set the dialog title
        builder.setTitle(R.string.mis_categorias)
                // Specify the list array, the items to be selected by default (null for none),
                // and the listener through which to receive callbacks when items are selected
                .setMultiChoiceItems(string_titles, null,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which,
                                                boolean isChecked) {
                                  if (isChecked) {
                                // If the user checked the item, add it to the selected items
                                //  mSelectedItems.add(string[which]);
                               // Log.d("string",string[which]);
                               // Log.d("which",Integer.toString(which));
                                      mSelectedItems.add(new Data_mis_categorias(which, string_titles[which]));


                                  } else if (mSelectedItems.contains(which)) {
                                // Else, if the item is already in the array, remove it
                                  // mSelectedItems.remove(Integer.valueOf(which));
                                      mSelectedItems.remove(which);
                                  }
                            }
                        })
                        // Set the action buttons
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog
                        General.DATA_CAT = mSelectedItems;


                    //    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                     //   fragmentTransaction.replace(R.id.contentFragment_fav, fragment_mis_categorias);
                      //  fragmentTransaction.commit();
                    }
                })
                .setNegativeButton(R.string.dialog_cancelar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        return builder.create();
    }
}