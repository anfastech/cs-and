<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:title="New"
        android:icon="@drawable/ic_icon1"
        android:showAsAction="ifRoom"/>
    <item
        android:title="Open" />
    <item
        android:title="Save" />
</menu>

package com.prapitha.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @Override   
        public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater a=getMenuInflater();
        a.inflate(R.menu.menu_example,menu);
        return true;
    }
}