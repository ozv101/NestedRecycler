package com.nestedrecycler.nestedrecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.nestedrecycler.nestedrecycler.adapter.VerticalAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView verticalRecyclerVuew = (RecyclerView) findViewById(R.id.vertical_recycler_view);
        verticalRecyclerVuew.setLayoutManager(new LinearLayoutManager(this));
        VerticalAdapter adapter = new VerticalAdapter(this);
        verticalRecyclerVuew.setAdapter(adapter);
    }
}
