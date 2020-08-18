package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et1 = (EditText)findViewById(R.id.num1val);
        et2 = (EditText)findViewById(R.id.num2val);
        ans = (TextView)findViewById(R.id.answer);


    }

    public void add(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;
        ans.setText(result);
    }

    public void substract(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 - n2;
        ans.setText(result);
    }

    public void divide(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 / n2;
        ans.setText(result);
    }

    public void mulitply(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;
        ans.setText(result);
    }
}