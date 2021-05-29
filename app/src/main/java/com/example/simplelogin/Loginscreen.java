package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginscreen extends AppCompatActivity {
    Button btn1,btn2;
    EditText usernameedt,passwordedt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        usernameedt=findViewById(R.id.username);
        passwordedt=findViewById(R.id.password);

        btn1=findViewById(R.id.Login);
        btn2=findViewById(R.id.register);

        Intent intent=getIntent();

        String username=intent.getStringExtra("username");
        String email=intent.getStringExtra("email");
        String phone=intent.getStringExtra("phone");
        String password=intent.getStringExtra("password");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameedt.getText().toString().equals(username)==true && passwordedt.getText().toString().equals(password)==true) {
                Intent intent1=new Intent(Loginscreen.this,MainActivity.class);
                intent1.putExtra("myusername",username);
                intent1.putExtra("myemail",email);
                intent1.putExtra("myphone",phone);
                startActivity(intent1);
                    Toast.makeText(Loginscreen.this,"Login Successfully",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(Loginscreen.this,"Invalid username or password",Toast.LENGTH_LONG).show();
                }

                //user login successfully
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginscreen.this,registerscreen.class);
                        startActivity(intent);
            }
        });

    }
}