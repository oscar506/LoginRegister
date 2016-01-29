package com.example.oscarramirez.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    Button blogin;
    Button bregister;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username =(EditText) findViewById(R.id.username);
        password =(EditText) findViewById(R.id.password);
        blogin = (Button) findViewById(R.id.blogin);
        bregister = (Button) findViewById(R.id.bregister);

        blogin.setOnClickListener(){

        };
        bregister.setOnClickListener(bregister);

    }

    @Override
    public void onCLick(View v){
        switch(v.getId()){
            case R.id.blogin:
                break;
            case R.id.bregister:
                startActivity(new Intent(this,Register.class));
        }

    }


}
