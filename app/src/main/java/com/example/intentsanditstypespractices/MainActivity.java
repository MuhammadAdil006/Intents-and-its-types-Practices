package com.example.intentsanditstypespractices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button call,email,web,data;
EditText phoneN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call=(Button) findViewById(R.id.CallTo) ;
        web=(Button) findViewById(R.id.web) ;
       email=(Button) findViewById(R.id.Mailing) ;
       data=(Button) findViewById(R.id.data) ;
        phoneN=(EditText) findViewById(R.id.PhoneNo);
        call.setOnClickListener(this);
        email.setOnClickListener(this);
        web.setOnClickListener(this);
        data.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.CallTo)
        {
            String ph= String.valueOf(phoneN.getText());
            ph=ph.substring(1,ph.length());
            ph="tel: +92"+ph;
            Uri uri= Uri.parse(ph);

            Intent intent = new Intent(Intent.ACTION_DIAL,uri);
            startActivity(intent);

        }else if(view.getId()==R.id.web)
        {
            Intent intent3= new Intent(MainActivity.this,EmailIntents.class);
            startActivity(intent3);
        }else if(view.getId()==R.id.Mailing)
        {

            Intent intent3= new Intent(Intent.ACTION_SEND);
            intent3.setType("*/*");
            intent3.putExtra(Intent.EXTRA_EMAIL,"qadil392@gmail.com");
            intent3.putExtra(Intent.EXTRA_SUBJECT,"something related to subject");

            startActivity(intent3);
        }else if(view.getId()==R.id.data)
        {

            Intent intent3= new Intent(MainActivity.this,EmailIntents.class);
            String msg="this is some message";
            intent3.putExtra("msg",msg);

            startActivity(intent3);
        }
    }
}