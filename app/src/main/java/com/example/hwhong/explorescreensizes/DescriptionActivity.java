package com.example.hwhong.explorescreensizes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DescriptionActivity extends AppCompatActivity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");

        DescriptionFragment df = (DescriptionFragment) getSupportFragmentManager().findFragmentById(R.id.descripFrag2);
        df.updateInfo(name);
    }
}
