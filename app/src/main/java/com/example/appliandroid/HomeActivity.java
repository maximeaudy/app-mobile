package com.example.appliandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class HomeActivity extends BaseAppliActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        View zone1 = findViewById(R.id.btn_zone1);
        View zone2 = findViewById(R.id.btn_zone2);

        showgoBackButton();

        zone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informationsGroupActivity();
            }
        });

    }

    private void informationsGroupActivity() {
        Intent intent = new Intent(this,GroupInfoActivity.class);
        startActivity(intent);
    }

}
