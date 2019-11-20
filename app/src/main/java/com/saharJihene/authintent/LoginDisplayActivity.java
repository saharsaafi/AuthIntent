package com.saharJihene.authintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginDisplayActivity extends AppCompatActivity {
    final String extra_login = "user_login";
    final String extra_password ="user_password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display);
        Intent intent= getIntent();
        TextView loginDisplay= findViewById(R.id.email_display);
        TextView passwordDisplay = findViewById(R.id.password_display);
        if (intent != null){
            loginDisplay.setText(intent.getStringExtra(extra_login));
            passwordDisplay.setText(intent.getStringExtra(extra_password));

        }
    }
}
