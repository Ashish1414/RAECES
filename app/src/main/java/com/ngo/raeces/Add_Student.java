package com.ngo.raeces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Add_Student extends AppCompatActivity
{
    String name,class1,contact,email,pass,course,interest,register_url;
    EditText name_e,class1_e,contact_e,email_e,pass_e,course_e,interest_e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__student);
        name_e=(EditText)findViewById(R.id.name);
        class1_e=(EditText)findViewById(R.id.class_student);
        contact_e=(EditText)findViewById(R.id.contact);
        email_e=(EditText)findViewById(R.id.email);
        pass_e=(EditText)findViewById(R.id.password);
        course_e=(EditText)findViewById(R.id.course);
        interest_e=(EditText)findViewById(R.id.interest);
        register_url="http://paytmpay001.dx.am/api/raeces/Student_details.php";


        Button add=(Button)findViewById(R.id.add_btn);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=name_e.getText().toString().trim();
                class1=class1_e.getText().toString().trim();
                contact=contact_e.getText().toString().trim();
                email=email_e.getText().toString().trim();
                pass=pass_e.getText().toString().trim();
                course=course_e.getText().toString().trim();
                interest=interest_e.getText().toString().trim();
                StringRequest stringRequest=new StringRequest(Request.Method.POST, register_url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(Add_Student.this, response, Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Add_Student.this,error.toString() , Toast.LENGTH_SHORT).show();
                    }
                }){
                    @Override
                    protected Map<String, String> getParams()  {
                        Map<String,String>parms=new HashMap<String, String>();
                        parms.put("name",name);
                        parms.put("class",class1);
                        parms.put("phone",contact);
                        parms.put("email",email);
                        parms.put("password",pass);
                        parms.put("course",course);
                        parms.put("interest",interest);

                        return parms;
                    }
                };
                RequestQueue requestQueue= Volley.newRequestQueue(Add_Student.this);
                requestQueue.add(stringRequest);
            }
        });


    }
}