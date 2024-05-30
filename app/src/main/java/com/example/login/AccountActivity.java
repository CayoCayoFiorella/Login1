package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.databinding.ActivityRegistroBinding;
import com.google.gson.Gson;

public class AccountActivity extends AppCompatActivity {

    //private static String TAG = "Registro";
    private ActivityRegistroBinding binding;
    public final static String ACCOUNT_RECORD="ACCOUNT_RECORD";
    public final static Integer ACCOUNT_ACEPTAR=100;
    public final static Integer ACCOUNT_CANCELAR=200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistroBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        EditText editFirstname = binding.editFirstname;
        EditText editLastname = binding.editLastname;
        EditText editUsername = binding.editUsername2;
        EditText editEmail = binding.editEmail;
        EditText editPhone = binding.editPhone;
        EditText editPassword = binding.editPsw;

        //Button buttonRegister = findViewById(R.id.buttonRegister);
        Button buttonRegister = binding.buttonRegister;
        Button buttonCancel = binding.buttonCancel;

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AccountEntity accountEntity = new AccountEntity();
                accountEntity.setFirstname(editFirstname.getText().toString());
                accountEntity.setLastname(editLastname.getText().toString());
                accountEntity.setUsername(editUsername.getText().toString());
                accountEntity.setEmail(editEmail.getText().toString());
                accountEntity.setPhone(editPhone.getText().toString());
                accountEntity.setPassword(editPassword.getText().toString());

                Gson gson = new Gson();
                String accountJson = gson.toJson(accountEntity);


                Intent data = new Intent();
                data.putExtra(ACCOUNT_RECORD, accountJson);

                setResult(ACCOUNT_ACEPTAR, data);
                finish();

            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(ACCOUNT_CANCELAR);
                finish();
            }
        });

/*
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editUserName.getText().toString().trim();
                String email = editEmail.getText().toString().trim();
                String phoneNumber = editTelefono.getText().toString().trim();
                String password = editPassword.getText().toString().trim();

                if (username.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty()) {
                    Toast.makeText(AccountActivity.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                    Log.d(TAG,"Por favor, complete todos los campos");
                    return;
                }

                Toast.makeText(AccountActivity.this, "Usuario registrado exitosamente", Toast.LENGTH_SHORT).show();
                Log.d(TAG,"Usuario registrado exitosamente");
            }
        });*/


    }
}