package com.dbak.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText F;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        F=(EditText)findViewById(R.id.MONTH);

        b = (Button) findViewById(R.id.button);
        //int selectedId = r.getCheckedRadioButtonId();
      //  l = (RadioButton) findViewById(selectedId);
       // if(selectedId==-1){
         //   Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        //}
        //else {

            clickit();
        //}


    }

    public void clickit() {


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sea=Integer.parseInt(F.getText().toString());

                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
              i.putExtra("yourIntName", sea);

                    startActivity(i);
                }



        });
    }
}
