package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclickBTNok();
    }

    public void onclickBTNok(){
        button = (Button)findViewById(R.id.btnOK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context =  getApplicationContext();
                CharSequence text = "Sending Message...";
                int duaration = Toast.LENGTH_SHORT;

                toast = Toast.makeText(context,text,duaration);
                toast.setGravity(Gravity.CENTER,0,700);
                toast.show();

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}