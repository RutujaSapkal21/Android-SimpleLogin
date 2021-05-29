package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myname,myemail,myphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myname=findViewById(R.id.getusername);
        myemail=findViewById(R.id.getuseremail);
        myphone=findViewById(R.id.getphone);

        Intent intent=getIntent();

        String getname=intent.getStringExtra("myusername");
        String getemail=intent.getStringExtra("myemail");
        String getphone=intent.getStringExtra("myphone");

        myname.setText("Username: "+getname);
        myemail.setText("Email: "+getemail);
        myphone.setText("Phone: "+getphone);

        myemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{getemail});
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Choose client"));
            }
        });
    }
}