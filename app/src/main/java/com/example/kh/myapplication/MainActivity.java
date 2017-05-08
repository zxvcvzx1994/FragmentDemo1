package com.example.kh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kh.myapplication.Module.Fragment_Bottom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void SetString(String text){
        Fragment_Bottom  fragment_bottom  =new Fragment_Bottom();
        android.app.FragmentManager manager  =getFragmentManager();
        fragment_bottom  = (Fragment_Bottom) manager.findFragmentById(R.id.fragment_Bot);
        fragment_bottom.GetText(text);
    }
}
