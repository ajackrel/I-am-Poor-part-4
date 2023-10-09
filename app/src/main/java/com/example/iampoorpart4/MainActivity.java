/*
NAME:
DATE:
ASSIGNMENT: I AM POOR PART 4
 */
// test
/*
ASSIGNMENT: I AM POOR PART 4
-convert the component tree to CONSTRAINT LAYOUT (NOTE: Do not use Linear Layout for this assignment)
-Rebuild the I am Poor app from part 3, but with the following changes:
    -Do NOT add a EditText component
    -the TextView will now say "Are you rich or poor?"
    -the button will now say "check"
        -add a method call in the button event listener
    -when the button is pressed, it will bring up a dialog box alert
    -add a dialog box alert to your app
        -the dialog box will ask the user "how many gold bars do you own?"
        -the dialog box will have two options, "OK" and "Cancel"
            -if the user presses "OK" and if the number is greater than zero, close
            dialog box and change TextView to "I am Rich" and change ImageView to diamond
            -if "OK" and number is zero (or less), close dialog box and change TextView to
            "I am Poor" and change ImageView to coal
            -if "Cancel", close dialog box and no other changes
    -add comments to every method and variable you have added. Yes, everything YOU ADDED
    -add doc comment at top of .java with all necessary info.
-Commit and push to your repos to submit assignment

 */


package com.example.iampoorpart4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BEGIN DIALOG ALERT BOX

        //create a dialog box - a new dialog box object "connected" to the Main .java/.xml
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

        //new EditText object that is "connected" to the Main .java/.xml
        final EditText edittext = new EditText(MainActivity.this);

        //By default, the 12 key numerical keyboard will appear for input
        edittext.setRawInputType(Configuration.KEYBOARD_12KEY);

        //Banner message on the dialog box
        alert.setTitle("BANNER MESSAGE");
        //content message on the dialog box
        alert.setMessage("CONTENT MESSAGE");
        //places (ie, "connects") the EditText object on the dialog box
        alert.setView(edittext);

        //an event listener for the OK button
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

                String inputTextString = edittext.getText().toString();

            }
        });

        //an event listener for the CANCEL button
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // what ever you want to do with No option.
            }
        });

        //show the dialog box
        alert.show();
        //END DIALOG ALERT BOX


    }

}