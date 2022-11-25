package com.example.shop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

public class LogIn extends AppCompatActivity {

    private static final String LOG_TAG = LogIn.class.getName();
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        auth = FirebaseAuth.getInstance();
    }

    public void logIn2(View view) {
        String email;


        EditText un = (EditText)findViewById(R.id.inputName);
        String username = un.getText().toString();

        EditText pw = (EditText)findViewById(R.id.inputPassword);
        String password = pw.getText().toString();

        auth.createUserWithEmailAndPassword(username, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    Log.d(LOG_TAG, "User created successfully!");
                    Toast.makeText(LogIn.this, "User created successfully!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Log.d(LOG_TAG, "User wasn't created!");
                    Toast.makeText(LogIn.this, "User wasn't created! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}