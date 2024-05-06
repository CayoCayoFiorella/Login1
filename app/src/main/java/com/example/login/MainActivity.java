package com.example.login;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        EditText edtUsername = binding.editUsername;
        EditText edtPassword = binding.editPassword;
        Button btnLogin = binding.btnLogin;
        TextView textViewRegister = binding.textRegistro;

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtUsername.getText().toString().equals("admin") && edtPassword.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Bienvenido a mi App",Toast.LENGTH_SHORT).show();
                    Log.d(TAG,"Bienvenido a mi App");
                }else{
                    Toast.makeText(getApplicationContext(),"Error en la autenticacion",Toast.LENGTH_SHORT).show();
                    Log.d(TAG,"Error en la autenticacion");
                }
            }
        });

        // Redirigir al hacer clic en el TextView de registro
        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivity(intent);
            }

        });
    }
}
