package com.example.mtrsliit.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class UsingStrings extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_strings);

        //set the textview within the layout for class object
        txtView2=findViewById(R.id.textView3);

        //This set the value of Msg2 is the text string
        txtView2.setText(R.string.Msg2);

        Log.i("LifeCycle","OnCreate() Invoked!!!");
    }

    public void onStart()
    {
     super.onStart();
     Log.i("Lifecycle","OnStart() Invoked!!!");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.i("LifeCycle","OnRestart() Invoked!!!");
    }
    public void onStop()
    {
        super.onStop();
        Log.i("LifeCycle","OnStop() Invoked!!!");
    }
    public void onResume()
    {
        super.onResume();
        Log.i("LifeCycle","OnResume() Invoked!!!");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.i("LifeCycle","OnDestroy Invoked!!!");
    }
    public void onPause()
    {
        super.onPause();
        Log.i("LifeCycle","OnPause Invoked!!!");
    }


}
