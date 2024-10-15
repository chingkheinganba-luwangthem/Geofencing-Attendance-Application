package com.chingkhei.fresh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivityStudent extends AppCompatActivity {

    private ImageView imageView2;
    private EditText student_password, student_username;
    private TextView std_signup_rdt_pg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_student);
        imageView2 = findViewById(R.id.imageView2);
        student_password = findViewById(R.id.student_password);
        student_username = findViewById(R.id.student_username);
        std_signup_rdt_pg = findViewById(R.id.std_signup_rdt_pg);

        std_signup_rdt_pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentls = new Intent(LoginActivityStudent.this, StudentSignUpActivity.class);
                startActivity(intentls);
            }
        });



    }
}