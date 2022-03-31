package com.example.popupmenudanlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_email, et_password, rgNama1,rgEmail1, rgPass1, rgRepass1, NamaU;
    Button login;
    String email, password, isiNama;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                et_email = findViewById(R.id.etEmail);
                et_password = findViewById(R.id.etPassword);
                login = findViewById(R.id.btSignin);
                t = findViewById(R.id.btn_1);

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        validasi();

                    }
                }
                );

            }
            public void validasi() {
                email = et_email.getText().toString();
                password = et_password.getText().toString();

                if (email.isEmpty() && password.isEmpty()) {
                    et_email.setError("isi nama");

                } else if (email.equals("Pascal") && password.equals("iniPascal")) {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();

                    //membuat objek bundle
                    Bundle b = new Bundle();

                    //memasukkan value dari variabel nama dengan kunci "a"
                    //dan dimasukkan kedalam bundle
                    b.putString("a", email.trim());


                    //membuat objek intent berpindah activity dari mainactivity ke activityHasil
                    Intent i = new Intent(getApplicationContext(), Home_Activity.class);
                    i.putExtras(b);

                    //berpindah ke ActivityHasil
                    startActivity(i);

                } else if (email != ("Pascal") && password.equals("iniPascal")) {
                    Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();

                } else if (email.equals("Pascal") && password != ("iniPascal")) {
                    Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                } else if (email != ("Pascal") && password != ("iniPascal")) {
                    Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        }


