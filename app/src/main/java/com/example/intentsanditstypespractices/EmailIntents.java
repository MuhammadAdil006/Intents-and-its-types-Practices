package com.example.intentsanditstypespractices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.net.URI;

public class EmailIntents extends AppCompatActivity {
Button pu;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_intents2);
        tv=(TextView) findViewById(R.id.display);
        Intent intent4=getIntent();
        tv.setText(intent4.getStringExtra("msg"));
        pu=(Button) findViewById(R.id.BrowserToUni);
        pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url= "https://www.pucit.edu.pk";
                Uri uri= Uri.parse(url);
                Intent intent2=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent2);
            }
        });

    }
}