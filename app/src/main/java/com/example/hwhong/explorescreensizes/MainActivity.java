package com.example.hwhong.explorescreensizes;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements NameFragment.Communicate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRespond(String name) {
        //have to pass infor from here to the article fragment
        // NameFragment -> MainActivity -> DescriptionFragment

        DescriptionFragment df = (DescriptionFragment) getSupportFragmentManager()
                .findFragmentById(R.id.descripFragment);
        //if big screen layout is not initialized, meaning small screen is used
        if (df == null) {
            Intent intent = new Intent(getApplicationContext(), DescriptionActivity.class);
            intent.putExtra("name", name);
            startActivity(intent);
        } else {
            df.updateInfo(name);
        }
    }
}
