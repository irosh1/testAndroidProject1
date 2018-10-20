package com.example.azeem.loginexample_01;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UserDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userdashboard);
        loadTheNewPage();
    }

    private void loadTheNewPage()
    {
        String username = getIntent().getStringExtra("TextValue");
        TextView welcomeText = findViewById(R.id.welcomeText);
        welcomeText.setText("Welcome "+ username + "!");
    }

}
