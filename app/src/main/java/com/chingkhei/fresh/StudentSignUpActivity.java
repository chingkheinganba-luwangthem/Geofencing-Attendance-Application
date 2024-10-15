package com.chingkhei.fresh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class StudentSignUpActivity extends AppCompatActivity {

    private EditText name, enrollment, email, dob, password;
    private TextView loginn;
    private RadioButton male, female;
    private Button signup1, addface; // Declare the addface button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // This may not be necessary depending on your target API level
        setContentView(R.layout.activity_student_sign_up);

        // Initialize UI components
        name = findViewById(R.id.name);
        enrollment = findViewById(R.id.enrollment);
        email = findViewById(R.id.email);
        dob = findViewById(R.id.dob);
        password = findViewById(R.id.password);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        loginn = findViewById(R.id.loginn);
        signup1 = findViewById(R.id.signup1);
        addface = findViewById(R.id.addface); // Initialize the addface button

        loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentln = new Intent(StudentSignUpActivity.this, LoginActivityStudent.class);
                startActivity(intentln);
            }
        });

        addface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentaf = new Intent(StudentSignUpActivity.this, AddFaceActivity.class);
                startActivity(intentaf);
            }
        });
    }
}
