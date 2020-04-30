package com.example.appliandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseAppliActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View logo = findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHomeActivity();
            }
        });
    }

    public void goToHomeActivity() {
        Intent intenet = new Intent(this,HomeActivity.class);
        startActivity(intenet);
    }
}