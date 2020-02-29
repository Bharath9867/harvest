package com.dbak.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
TextView v,l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        l=(TextView) findViewById(R.id.textView3);
        v=(TextView)findViewById(R.id.textView4);

       Intent intent = getIntent();
       int score = intent.getIntExtra("yourIntName",0);
     if(score>=5&&score<=7)
     {
         l.setText("khariff");
v.setText(" Jowar," +
        " bajra, " +
        "rice, " +
        "maize, " +
        "cotton," +
        " groundnut," +
        " jute," +
        " hemp, " +
        "sugarcane");
     }else if(score>=10&&score<=12)
     {
         l.setText("rabi");
v.setText("wheat," +
        " barley," +
        " gram," +
        " linseed," +
        " mustard," +
        " masoor");
     }
     else if(score>=7&&score<=9)
     {l.setText("zaid");
v.setText("rice," +
        " jowar, " +
        "rapeseed," +
        " cotton, " +
        "oilseeds.");
     }else if(score>=2&&score<=4)
     {   l.setText("zaid khariff");
         v.setText("watermelon," +
                 " toris, " +
                 "cucumber," +
                 " leafy" );

     }else if(score==1)
     {
         l.setText("zaidrhabi");
v.setText("wheat");
     }


    }
}
