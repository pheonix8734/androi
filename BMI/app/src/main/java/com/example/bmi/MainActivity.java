package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result;
        EditText editweight,editHeightft,editHeightIn;
        Button btncalculate;
        LinearLayout llmain;
        editweight=findViewById(R.id.editweight);
        editHeightft=findViewById(R.id.editheightft);
        editHeightIn=findViewById(R.id.editheightin);
        llmain=findViewById(R.id.llmain);
        btncalculate=findViewById(R.id.btncalculate);
        result =findViewById(R.id.result);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt=Integer.parseInt(editweight.getText().toString());
                int ft= Integer.parseInt(editHeightft.getText().toString());
                int in=Integer.parseInt(editHeightIn.getText().toString());
                int totalIn=12*ft+in;
                double totalcm=totalIn*2.53;
                double totalm=totalcm/100;
                double bmi=wt/(totalm*totalm);
                if(bmi>25)
                {
                    result.setText("You are overweight");
                    llmain.setBackgroundColor(getResources().getColor(R.color.teal_700));
                }
                else if(bmi<10)
                {
                    result.setText("you are underweight");
                }
                else
                {
                    result.setText("You are healthy");
                }

            }
        });

    }
}