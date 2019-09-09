package com.hfad.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    /*This method gets called whenever the
    activity object is first created*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View view){
        /*Inside the R class there is a static inner class named id
        * this id class has a static final int named txtView holding a reference to
        * the TexView in the activity_main.xml */
        TextView androidText = (TextView)findViewById(R.id.txtView);
        String previousText = "Hello World!";
        androidText.setText(previousText);
    }
}
