package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText In1, In2, In3;
    TextView Out1, Out2, Out3, Out4;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declaration
        int tea= 60, milk = 70, bread=65;
        // binding
        button = findViewById(R.id.button);
        In1 = findViewById(R.id.Br);
        In2 = findViewById(R.id.Mi);
        In3 = findViewById(R.id.Te);
        Out1 = findViewById(R.id.B1);
        Out2 = findViewById(R.id.M1);
        Out3 = findViewById(R.id.T1);
        Out4 = findViewById(R.id.G1);
//        class New {
//
//            @SuppressLint("NotConstructor")
//            public void New(String[] args) {
//
//                System.out.println(helloMethod());
//
//            }
//
//
//            public String helloMethod() {
//
//                return "Hello there!";
//
//            }
//        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // conversion from string to int.
                String bb = In1.getText().toString();
                int b = Integer.parseInt(bb);
                int b1 = product(b,bread);
                String mm = In2.getText().toString();
                int m = Integer.parseInt(mm);
                int m1 = product(m,milk);
                String tt = In3.getText().toString();
                int t = Integer.parseInt(tt);
                int t1 = product(t,tea);
                int gt = m1 + t1 + b1;
                //int gt = sum(product(b,bread), m1, t1);
                // Setting values to be displayed.
                Out1.setText(Integer.toString(product(b,bread)));
                Out2.setText(Integer.toString(m1));
                Out3.setText(Integer.toString(t1));
                Out4.setText(Integer.toString(gt));

            }
        });

            }

public static int product(int y, int x)
{
    int s;
    s = x*y;
    return s;
}}
//public static int sum(int g, int d, int i)
//{
//    int q;
//    q = g + d + i;
//    return q;
//}
//}
