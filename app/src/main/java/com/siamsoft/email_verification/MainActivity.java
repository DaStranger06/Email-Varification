package com.siamsoft.email_verification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int view = R.layout.activity_main;
    Button button;
    EditText emailId, passsa;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(view);


        button = findViewById(R.id.butt);
        emailId = findViewById(R.id.emailt);
        passsa =findViewById(R.id.passt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailId.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"enter email address",Toast.LENGTH_SHORT).show();

                }else {
                    if ((emailId.getText().toString().trim().matches(emailPattern))&& (passsa.getText().toString().length() == 4)) {

                        Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }
}