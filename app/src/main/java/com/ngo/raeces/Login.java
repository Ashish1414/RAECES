package com.ngo.raeces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Login extends AppCompatActivity {

    CircleImageView profile_image_faculty , profile_image_student , profile_image_admin;
    TextView txt_who;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        profile_image_faculty = findViewById(R.id.profile_image_teacher);
        profile_image_student = findViewById(R.id.profile_image_student);
        profile_image_admin = findViewById(R.id.profile_image_admin);

        txt_who = findViewById(R.id.txt_who);


        profile_image_faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txt_who.setText("Faculty Login");
            }
        });

        profile_image_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txt_who.setText("Student Login");
            }
        });

        profile_image_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txt_who.setText("Admin Login");
            }
        });


    }
}
