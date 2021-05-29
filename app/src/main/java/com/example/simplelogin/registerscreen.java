package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registerscreen extends AppCompatActivity {
    Button register;
    EditText myusername,myemail,myphone,mypassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerscreen);
        myusername=findViewById(R.id.myusername);
        myemail=findViewById(R.id.myemail);
        myphone=findViewById(R.id.myphone);
        mypassword=findViewById(R.id.mypassword);

        register=findViewById(R.id.registerr);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(registerscreen.this,Loginscreen.class);
                intent.putExtra("username",myusername.getText().toString());
                intent.putExtra("email",myemail.getText().toString());
                intent.putExtra("phone",myphone.getText().toString());
                intent.putExtra("password",mypassword.getText().toString());
                startActivity(intent);
            }
        });
    }
}