package com.chingkhei.fresh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TeacherSignUpActivity extends AppCompatActivity {

    private EditText t_name, t_id,t_email, t_password;
    private TextView t_signupRedirectText;
    private Spinner t_course;
    private Button t_signup_button;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_teacher_sign_up);

        t_name = findViewById(R.id.t_name);
        t_id = findViewById(R.id.t_id);
        t_email = findViewById(R.id.t_email);
        t_password = findViewById(R.id.t_password);
        t_signupRedirectText = findViewById(R.id.t_signupRedirectText);
        t_course = findViewById(R.id.t_course);
        t_signup_button = findViewById(R.id.teacher_button);

        t_signupRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(TeacherSignUpActivity.this,LoginActivityTeacher.class);
                startActivity(intentt);
            }
        });


    }
}