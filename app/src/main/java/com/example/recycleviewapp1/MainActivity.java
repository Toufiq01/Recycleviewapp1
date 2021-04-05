package com.example.recycleviewapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Contact o1 = new Contact(1, "0358095039", "toufiq");
    Contact o2 = new Contact(2, "0358095039", "toufiq");
    Contact o3 = new Contact(3, "0358095039", "toufiq");
    Contact o4 = new Contact(4, "0358095039", "toufiq");
    Contact o5 = new Contact(5, "0358095039", "toufiq");
    Contact o6 = new Contact(6, "0358095039", "toufiq");
    Contact o7 = new Contact(7, "0358095039", "toufiq");
    Contact o8 = new Contact(8, "0358095039", "toufiq");
    Contact o9 = new Contact(9, "0358095039", "toufiq");

    Contact[] contacts = {o1,o2,o3,o4,o5,o6,o7,o8,o9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
    }
}