package com.shagi.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2;
    String uname,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.uname);
        e2=(EditText)findViewById(R.id.pass);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname=e1.getText().toString();
                password=e2.getText().toString();
                if(uname.equals("shagin")&&password.equals("Santha1@"))
                {
                    Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(),empdata.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"faild",Toast.LENGTH_LONG).show();
                }



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),registration.class);
                startActivity(in);
            }
        });
    }
}
