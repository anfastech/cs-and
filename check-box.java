<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="224dp"
        android:layout_height="38dp"
        android:text="select your favourite fruit"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.085"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.044" />

    <CheckBox
        android:id="@+id/check1"
        android:layout_width="195dp"
        android:layout_height="40dp"
        android:text="Apple"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.126"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.038" />

    <CheckBox
        android:id="@+id/check2"
        android:layout_width="208dp"
        android:layout_height="34dp"
        android:text="Mango"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.126"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.149" />

    <CheckBox
        android:id="@+id/check3"
        android:layout_width="209dp"
        android:layout_height="40dp"
        android:text="Grapes"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.126"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.255" />

    <CheckBox
        android:id="@+id/check4"
        android:layout_width="218dp"
        android:layout_height="31dp"
        android:text="Watermelon"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.126"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.387" />

    <CheckBox
        android:id="@+id/check5"
        android:layout_width="223dp"
        android:layout_height="32dp"
        android:text="Avocado"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.116"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.515" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="display"
        android:text="OK"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.442"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.696" />

    <TextView
        android:id="@+id/text1"
        android:layout_width="190dp"
        android:layout_height="114dp"
        android:text=""
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.443"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.92" />

</androidx.constraintlayout.widget.ConstraintLayout>


package com.example.my_first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(View v) {
        TextView a = findViewById(R.id.text1);
        CheckBox r = findViewById(R.id.check1);
        CheckBox s = findViewById(R.id.check2);
        CheckBox t = findViewById(R.id.check3);
        CheckBox u = findViewById(R.id.check4);
        CheckBox q = findViewById(R.id.check5);
        String st = a.getText().toString();
        String result = "";
        if (r.isChecked()) {
            result = result + r.getText().toString() + "\n";
        }
        if (s.isChecked()) {
            result = result + s.getText().toString() + "\n";
        }
        if (t.isChecked()) {
            result = result + t.getText().toString() + "\n";
        }
        if (u.isChecked()) {
            result = result + u.getText().toString() + "\n";
        }
        if (q.isChecked()) {
            result = result + q.getText().toString() + "\n";
        }
        a.setText("You are selected:\n"+result);
    }
}
