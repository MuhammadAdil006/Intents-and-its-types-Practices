package com.example.intentsanditstypespractices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button call;
EditText phoneN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call=(Button) findViewById(R.id.CallTo) ;
        phoneN=(EditText) findViewById(R.id.PhoneNo);
        call.setOnClickListener(this);

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

        }
    }
}