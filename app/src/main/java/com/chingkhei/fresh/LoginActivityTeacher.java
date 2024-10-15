package com.chingkhei.fresh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivityTeacher extends AppCompatActivity {

    ImageView imageview2;
    EditText teacher_username, teacher_password;
    Button teacher_button;
    TextView tchr_signupRedirectText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_teacher);

        imageview2 = findViewById(R.id.imageView2);
        teacher_username = findViewById(R.id.teacher_username);
        teacher_password = findViewById(R.id.teacher_password);
        tchr_signupRedirectText = findViewById(R.id.tchr_signupRedirectText);
        teacher_button = findViewById(R.id.teacher_button);

        // Set OnClickListener for redirection
        tchr_signupRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to the TeacherSignUpActivity
                Intent intentlt = new Intent(LoginActivityTeacher.this, TeacherSignUpActivity.class);
                startActivity(intentlt);
            }
        });
    }
}
