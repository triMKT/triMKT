package com.example.david.trimkt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registrarActivity extends AppCompatActivity {

    private DatabaseReference fbDB = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);





//        fbDB.child("aoooo").setValue("1000");

    }

    public void onClickButton(View v){
//        fbDB.setValue("Aooo");
    }
}
