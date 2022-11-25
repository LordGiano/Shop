package com.example.shop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void signUp2(View view) {
        EditText pas1 = (EditText)findViewById(R.id.password1);
        String pw1 = pas1.getText().toString();
        EditText pas2 = (EditText)findViewById(R.id.password2);
        String pw2 = pas2.getText().toString();
        if(pw1 == pw2)
        {
            //TODO
        }
        else
        {
            Toast.makeText(getApplicationContext(),"The two passwords do not correspond!", Toast.LENGTH_SHORT).show();
            //AlertDialog alertDialog = new AlertDialog.Builder(SignUp.this).create();
            //alertDialog.setTitle("Alert!");
            //alertDialog.setMessage("The two passwords do not correspond!");
            //alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
            //        new DialogInterface.OnClickListener() {
            //            public void onClick(DialogInterface dialog, int which) {
            //                dialog.dismiss();
            //            }
            //        });
            //alertDialog.show();
        }
    }
}