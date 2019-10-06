package com.ngo.raeces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminControl extends AppCompatActivity {



    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_control);

        Button btnLogout,student,faculty,study_materials,complaint,ann,add_student;

        btnLogout =(Button) findViewById(R.id.btnLogout);
        student=(Button)findViewById(R.id.student);
        faculty=(Button)findViewById(R.id.faculty);
        study_materials=(Button)findViewById(R.id.study_material);
        complaint=(Button)findViewById(R.id.complaints);
        ann=(Button)findViewById(R.id.announcement);


        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences = getSharedPreferences("Login",0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent = new Intent(AdminControl.this,Login.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(0, 0);
                finish();
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminControl.this,Student_Activity.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(0, 0);

            }
        });
        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminControl.this,Faculty_Activity.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(0, 0);

            }
        });
        study_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminControl.this,Study_material_admin.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(0, 0);

            }
        });
        complaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminControl.this,complaints_receive_admin.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(0, 0);

            }
        });
        ann.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent = new Intent(AdminControl.this, Announcement.class);
                                       startActivityForResult(intent, 0);
                                       overridePendingTransition(0, 0);
                                   }
                               });


    }

    }
