package com.ngo.raeces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student_Activity extends AppCompatActivity {
    Button add_student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_);
        add_student=(Button)findViewById(R.id.add_student);
        add_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Student_Activity.this,Add_Student.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(0, 0);
                finish();
            }
        });

    }
}
