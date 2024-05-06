package com.example.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.databinding.ActivityRegistroBinding;

public class Registro extends AppCompatActivity {

    private static String TAG = "Registro";
    private ActivityRegistroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistroBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        EditText editUserName = binding.editUserName;
        EditText editEmail = binding.editEmail;
        EditText editTelefono = binding.editTelefono;
        EditText editPassword = binding.editPsw;
        Button buttonRegister = binding.Registro;

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editUserName.getText().toString().trim();
                String email = editEmail.getText().toString().trim();
                String phoneNumber = editTelefono.getText().toString().trim();
                String password = editPassword.getText().toString().trim();

                if (username.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Registro.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                    Log.d(TAG,"Por favor, complete todos los campos");
                    return;
                }

                Toast.makeText(Registro.this, "Usuario registrado exitosamente", Toast.LENGTH_SHORT).show();
                Log.d(TAG,"Usuario registrado exitosamente");
            }
        });
    }
}
