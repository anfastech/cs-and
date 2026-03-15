<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <RadioGroup
        android:id="@+id/radiosex"
        android:layout_width="134dp"
        android:layout_height="103dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.167">

    <RadioButton
        android:id="@+id/radio1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Male" />

    <RadioButton
        android:id="@+id/radio2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Female" />

    </RadioGroup>

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="display"
        android:text="Display"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.383" />

</androidx.constraintlayout.widget.ConstraintLayout>


package com.example.my_first;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View v)
    {
        RadioGroup r=findViewById(R.id.radiosex);
        int id=r.getCheckedRadioButtonId();
        RadioButton b=findViewById(id);
        Toast a=Toast.makeText(MainActivity.this,b.getText(),Toast.LENGTH_SHORT);
        a.show();
    }
}