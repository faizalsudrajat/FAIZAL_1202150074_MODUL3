package com.example.sal.faizal_1202150074_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button mSubmit;
    private EditText mUsername , mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mSubmit = (Button)  findViewById(R.id.submit);



    }
    private void displayToast(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show(); // untuk mendisplay toast
    }

    public void submit(View view) {
        String user = mUsername.getText().toString();
        String pass = mPassword.getText().toString();

        if (user.equals("EAD") && pass.equals("MOBILE")){
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_LONG).show();
            Intent pindah = new Intent(this,MainActivity.class);
            startActivity(pindah);

        } else
            Toast.makeText(this,"Login Gagal",Toast.LENGTH_LONG).show();
    }
}
