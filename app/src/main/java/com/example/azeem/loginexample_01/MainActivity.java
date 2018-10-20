package com.example.azeem.loginexample_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginCheck(View view)
    {
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Toast toast ;

        String uname  = username.getText().toString().toLowerCase();
        String pword  = password.getText().toString();

        Intent myIntent = new Intent();
        myIntent.setClass(MainActivity.this, UserDashboard.class);

        if(uname.equals("kamal") &&  pword.equals("123"))
        {
            myIntent.putExtra("TextValue", uname);
            startActivity(myIntent);
        }
        else
        {
            toast = Toast.makeText(getApplicationContext(), "Username or password is incorrect! Please try again! " , Toast.LENGTH_SHORT);
            toast.show();
        }


    }
}
