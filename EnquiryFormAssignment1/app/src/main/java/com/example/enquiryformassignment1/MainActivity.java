package com.example.enquiryformassignment1;


import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Resources resources;
    ImageView img;
    TextView AavidSoftware , name , phone , email , yearospassing , college , technology , enquiryform;
    EditText ename , ephone , eemail, eyearofpassing , ecollege , etechnology  ;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resources = getResources();
        img = findViewById(R.id.image);
        AavidSoftware = findViewById(R.id.Aavid_Software);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        yearospassing = findViewById(R.id.year_passing);
        college = findViewById(R.id.college);
        technology = findViewById(R.id.technology);
        enquiryform = findViewById(R.id.Enquiry_form);
        ename = findViewById(R.id.ename);
        ephone = findViewById(R.id.ephone);
        eemail = findViewById(R.id.eemail);
        eyearofpassing = findViewById(R.id.eyear_passing);
        ecollege = findViewById(R.id.ecollege);
        etechnology = findViewById(R.id.etechnology);
        btn = findViewById(R.id.Button);

    }
}