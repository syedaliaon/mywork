package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox pizza,burger,pasta,cooldrink,fries;
    Button btnbill;
    TextView tvshow;
    EditText qpizza,qbuger,qpasta,qfries,qcooldrink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizza=findViewById(R.id.pizza);
        burger=findViewById(R.id.burger);
        pasta=findViewById(R.id.pasta);
        cooldrink=findViewById(R.id.cooldrink);
        fries=findViewById(R.id.fries);
        btnbill=findViewById(R.id.btnbill);
        tvshow=findViewById(R.id.tvshow);
        qpizza= findViewById(R.id.qp);
        qbuger=findViewById(R.id.qburger);
        qpasta=findViewById(R.id.qpasta);
        qfries=findViewById(R.id.qfries);
        qcooldrink=findViewById(R.id.qcooldrink);

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qpizza.setVisibility(View.VISIBLE);
            }
        });

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qbuger.setVisibility(View.VISIBLE);
            }
        });
        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qpasta.setVisibility(View.VISIBLE);
            }
        });
        fries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qfries.setVisibility(View.VISIBLE);
            }
        });
        cooldrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qcooldrink.setVisibility(View.VISIBLE);
            }
        });

        btnbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totalammount=0;


                StringBuilder result=new StringBuilder();
                result.append("My Kitchen");
                result.append("\nTotal Bill");
                if (pizza.isChecked()) {

                    Double n1;
                    n1 = Double.parseDouble(qpizza.getText().toString());
                    if (n1 >= 2) {


                        result.append("\n");
                        result.append(n1);
                        result.append("-pizza @Rs.700/ =");
                        result.append(700 * n1);
                        result.append("\n");

                        result.append(n1 / 2);
                        result.append("- cooldrink is free");

                        totalammount += 700 * n1;
                    } else {
                        result.append("\npizza Rs.700/-");
                        totalammount += 700;
                    }
                }




                if (burger.isChecked()) {
                    Double n2;
                    n2 = Double.parseDouble(qbuger.getText().toString());
                    if (n2 >= 5) {
                        result.append("\n");
                        result.append(n2);
                        result.append("- burger@ Rs.200/-");
                        result.append(200 * n2);
                        result.append("\n");
                        result.append(n2 / 5);
                        result.append("-cool drink is free");
                        totalammount += 200 * n2;
                    } else {


                        result.append("\nBurger @ Rs.200-");
                        result.append(200 * n2);
                        totalammount += 200;
                    }
                }

                if (pasta.isChecked()){
                    Double n3;
                    n3 = Double.parseDouble(qpasta.getText().toString());
                    if (n3 >= 3) {
                        result.append("\n");
                        result.append(n3);
                        result.append("- pasta @Rs.400/-");
                        result.append(400 * n3);
                        result.append("\n");
                        result.append(n3 / 3);
                        result.append("-cool drink is free");
                        totalammount += 400 * n3;
                    } else {


                        result.append("\nBurger @ Rs.400/-");
                        result.append(400 * n3);
                        totalammount += 400;
                    }

                }
                if (fries.isChecked()){
                    Double n4;
                    n4=Double.parseDouble(qfries.getText().toString());
                    if (n4>=3){
                        result.append("\n");
                        result.append(n4);
                        result.append("-fries @Rs.150/-");
                        result.append(150*n4);
                        result.append("\n");
                        result.append(n4/2);
                        result.append("-cool drink is free");
                        totalammount+=150*n4;
                    }
                    else{
                        result.append("\nfries @ Rs 150/-");
                        result.append(150*n4);
                        totalammount+=150;
                    }

                }
                if (cooldrink.isChecked()){
                    result.append("\ncool drink Rs.100/-");
                    totalammount+=100;

                }
                result.append("\nTotal:"+totalammount+"Rs");
                tvshow.setText(result.toString());
            }
        });
    }
}