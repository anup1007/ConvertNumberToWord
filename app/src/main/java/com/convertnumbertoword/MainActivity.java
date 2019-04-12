package com.convertnumbertoword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etN;
    TextView tvW;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etN= findViewById(R.id.etNumber);
        tvW= findViewById(R.id.tvWords);
        btnConvert= findViewById(R.id.btnConvert);


        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num;
                num= Integer.parseInt(etN.getText().toString());

                ConvertNumberToWords numbertoWords= new ConvertNumberToWords(num);
                tvW.setText(numbertoWords.Words());

            }
        });
    }
}
