package com.example.appliandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class GroupInfoActivity extends BaseAppliActivity {
    public Student student1 = new Student("Audy","Maxime","maxime.audy@epsi.fr","b3","avatar1");
    public Student student2 = new Student("Kode","Arthur","rgtrgr@epsi.fr","b3","avatar2");
    public Student student3 = new Student("Lokde","Sabrina","kart.g@epsi.fr","b2","avatar3");
    public  Student[] students = new Student[]{student1,student2,student3};

    public final String ACTIVITYNAME = "Informations";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groupinformations);

        TextView textView =findViewById(R.id.nameOfAPP);
        textView.setText(ACTIVITYNAME);

        Button btn1 = findViewById(R.id.btnStudent1);
        Button btn2 = findViewById(R.id.btnSTudent2);
        Button btn3 = findViewById(R.id.btnStudent3);
        showgoBackButton();

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.btnStudent1:
                StudentInformationsActivity.displayStudent(v.getContext(),students[0]);
                break;
            case R.id.btnSTudent2:
                StudentInformationsActivity.displayStudent(v.getContext(),students[1]);
                break;
            case R.id.btnStudent3:
                StudentInformationsActivity.displayStudent(v.getContext(),students[2]);
                break;
        }
    }
}
