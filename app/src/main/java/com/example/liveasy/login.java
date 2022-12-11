package com.example.liveasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.hbb20.CountryCodePicker;

public class login extends AppCompatActivity {
    EditText num;
    TextView txtsignup;
    Button sendotp,signinemail;
    CountryCodePicker cpp;
    FirebaseAuth FAuth;
    String numberr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        num=(EditText)findViewById(R.id.Mobileno);
        sendotp=(Button)findViewById(R.id.button2);
        cpp=(CountryCodePicker)findViewById(R.id.CountryCode);

        sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberr=num.getText().toString().trim();
                String phonenumber= cpp.getSelectedCountryCodeWithPlus() + numberr;
                Intent b=new Intent(login.this,verify.class);
                b.putExtra("phonenumber",phonenumber);
                startActivity(b);
                finish();

            }
        });
    }
}