package com.ngo.raeces;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

public class Announcement extends AppCompatActivity {

    Dialog myDialog;
    Button student_dialog,faculty_dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement);

        myDialog = new Dialog(this);

        myDialog.setContentView(R.layout.dialog_box);
        student_dialog = (Button) myDialog.findViewById(R.id.button_student_ann);
        faculty_dialog = (Button) myDialog.findViewById(R.id.button_faculty_ann);

        myDialog.show();

    }
}
