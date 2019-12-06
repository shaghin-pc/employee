package com.shagi.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {

    EditText e3,e4,e5,e6,e7,e8,e9,e10;
    Button b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        e3=(EditText)findViewById(R.id.empname);
        e4=(EditText)findViewById(R.id.desig);
        e5=(EditText)findViewById(R.id.salary);
        e6=(EditText)findViewById(R.id.company);
        e7=(EditText)findViewById(R.id.num);
        e8=(EditText)findViewById(R.id.usr);
        e9=(EditText)findViewById(R.id.pass);
        e10=(EditText)findViewById(R.id.confirm);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(back);
            }
        });
    }
}
