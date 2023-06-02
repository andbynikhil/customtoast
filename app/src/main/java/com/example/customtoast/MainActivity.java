package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Toast toast=new Toast(MainActivity.this);


        View view =getLayoutInflater() .inflate(R.layout.customtext,(ViewGroup)findViewById(R.id.viewcontainer) );
       toast.setView(view);
        TextView textView=view.findViewById(R.id.text);
        textView.setText("this is a toast message");
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);

       toast.show();
    }
}