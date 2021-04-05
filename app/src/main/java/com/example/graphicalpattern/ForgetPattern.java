package com.example.graphicalpattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.graphicalpattern.model.username;

public class ForgetPattern extends AppCompatActivity {
    private Button ValidateBtn;
    private Button PatternBtn;
    private EditText uN;
    private EditText fpsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pattern);

        ValidateBtn = (Button)findViewById(R.id.btnValidate);
        PatternBtn = (Button)findViewById(R.id.btnPattern);
        uN = (EditText)findViewById(R.id.uName);
        fpsw = (EditText)findViewById(R.id.uPsw);

        username MForgot = new username(this);


        PatternBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ForgetPattern.this, PatternPage.class);
                startActivity(intent2);
            }
        });

        ValidateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=uN.getText().toString();
                String b=fpsw.getText().toString();
                String c=MForgot.getUsername();
                String d=MForgot.getPassword();
                System.out.println("c:"+c+"---d:"+d);
                if(a.equals(c) && b.equals(d)){
                    Intent intent3 = new Intent(ForgetPattern.this,appList.class);
                    startActivity(intent3);
                }
                else{
                    uN.setText("");
                    fpsw.setText("");
                    Toast.makeText(ForgetPattern.this,"Please Enter the correct details! and try again!",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }





}