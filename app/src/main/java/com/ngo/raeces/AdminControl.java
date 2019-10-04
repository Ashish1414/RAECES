package com.ngo.raeces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminControl extends AppCompatActivity {
    Button btnLogout,add_student;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_control);

        btnLogout = findViewById(R.id.btnLogout);
        add_student=findViewById(R.id.add_student);
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
        add_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminControl.this,Add_Student.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(0, 0);
                finish();
            }
        });
    }
}
