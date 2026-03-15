<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/image1"
        android:layout_width="412dp"
        android:layout_height="726dp"
        tools:layout_editor_absoluteX="0dp"
        tools:layout_editor_absoluteY="3dp"
        tools:src="@tools:sample/avatars" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="setimage"
        android:text="Image1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.187"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.916" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="setimage2"
        android:text="Image2"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.785"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.916" />

    <ImageView
        android:id="@+id/image2"
        android:layout_width="400dp"
        android:layout_height="735dp"
        tools:layout_editor_absoluteX="7dp"
        tools:layout_editor_absoluteY="-2dp"
        tools:src="@tools:sample/avatars" />

</androidx.constraintlayout.widget.ConstraintLayout>


package com.example.my_first;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView a;
    ImageView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.image1);
        b=findViewById(R.id.image2);
    }
    public void setimage(View v)
    {
        a.setImageResource(R.drawable.jerry);
        b.setImageResource(0);
    }
    public void setimage2(View v)
    {
        b.setImageResource(R.drawable.tom);
        a.setImageResource(0);
    }
}
