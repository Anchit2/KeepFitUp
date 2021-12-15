package com.example.keepfitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistrationPage extends AppCompatActivity {
    TextView skip;
    EditText regname,regemail,regphone,regage,regheight,regweight;
    Button regbtn;
    FirebaseDatabase database;
    DatabaseReference reference;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        regname=findViewById(R.id.regname);
        regemail=findViewById(R.id.regemail);
        regphone=findViewById(R.id.regphone);
        regbtn=findViewById(R.id.regbtn);
        regage=findViewById(R.id.regage);
        regheight=findViewById(R.id.regheight);
        regweight=findViewById(R.id.regweight);
        skip=findViewById(R.id.skip);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationPage.this,HomePage.class));
            }
        });

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=regname.getText().toString().trim();

                String email = regemail.getText().toString().trim();

                String phone =regphone.getText().toString().trim();

                String age =regage.getText().toString().trim();
//                int agee=Integer.parseInt(age);

                String height =regheight.getText().toString().trim();
//                int heightt=Integer.parseInt(height);

                String weight =regweight.getText().toString().trim();
//                int weightt=Integer.parseInt(weight);

                database=FirebaseDatabase.getInstance();

                if (name.isEmpty()){
                    regname.setError("Enter Your Name");
                }

                else if(email.isEmpty()){
                    regemail.setError("Enter Your Email ID");
                }
                else if(!email.matches(emailPattern)){
                    regemail.setError("Invalid Email ID");
                }
                else if(phone.isEmpty()){
                    regphone.setError("Enter Your Phone Number");
                }
                else if(phone.length()<10){
                    regphone.setError("Invalid Phone Number");
                }
                else if(age.isEmpty()){
                    regage.setError("Enter Your Age");
                }
//                else if(agee>=80){
//                    regage.setError("Unacceptable Age");
//                }
                else if(height.isEmpty()){
                    regheight.setError("Enter Your Height");
                }
//                else if(heightt>=200){
//                    regage.setError("Unacceptable Age");
//                }
                else if(weight.isEmpty()){
                    regweight.setError("Enter Your Weight");
                }
//                else if(weightt>=150){
//                    regage.setError("Unacceptable Age");
//                }
                else {
                    regname.setError(null);
                    regemail.setError(null);
                    regphone.setError(null);
                    regage.setError(null);
                    regheight.setError(null);
                    regweight.setError(null);


                    userdetail detail= new userdetail(name,email,phone,age,height,weight);
                    reference = database.getReference().child("Members");
                    reference.child(phone).setValue(detail);
                    Toast.makeText(RegistrationPage.this, "REGISTRATION SUCCESSFUL !", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegistrationPage.this, HomePage.class));
                }
            }
        });

        SharedPreferences preferences= getSharedPreferences("pref",MODE_PRIVATE);
        String firsttime= preferences.getString("firsttimeinstall","");

        if (firsttime.equals("yes")){
            startActivity(new Intent(RegistrationPage.this, HomePage.class));
        }else {
            SharedPreferences.Editor editor=preferences.edit();
            editor.putString("firsttimeinstall","yes");
            editor.apply();
        }

    }
}