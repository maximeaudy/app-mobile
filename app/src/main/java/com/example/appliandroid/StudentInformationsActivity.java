package com.example.appliandroid;
import android.os.Bundle;
import androidx.annotation.Nullable;

import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageView;
import android.content.Context;


public class StudentInformationsActivity extends BaseAppliActivity {
    public static void displayStudent(Context context, Student student){
        Intent intent = new Intent(context, StudentInformationsActivity.class);
        intent.putExtra("student",student);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_info);
        showgoBackButton();

        ImageView avatarT = findViewById(R.id.avatar);
        TextView nameT = findViewById(R.id.student_name);
        TextView emailT = findViewById(R.id.student_email);
        TextView groupNameT = findViewById(R.id.group_name);

        Student student = (Student) getIntent().getExtras().get("student");
        TextView nameAt = findViewById(R.id.nameOfAPP);
        nameAt.setText(student.getNom());

        String entiereName = student.getNom() + " - " +  student.getPrenom();
        nameT.setText(entiereName);
        emailT.setText(student.getEmail());
        groupNameT.setText(student.getGroup());
        avatarT.setImageResource(R.drawable.avatar1);
    }
}
