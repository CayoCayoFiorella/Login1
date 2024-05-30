package com.example.login;

import android.os.Bundle;

import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.view.View;
import com.google.gson.Gson;

public class HomeActivity extends AppCompatActivity {

    private TextView txtWelcomeMessage;
    private ListView listViewUserData;
    private AccountEntity user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);
        listViewUserData = findViewById(R.id.listViewUserData);

        String userJson = getIntent().getStringExtra("ACCOUNT");
        Gson gson = new Gson();
        user = gson.fromJson(userJson, AccountEntity.class);

        if (user != null) {
            txtWelcomeMessage.setText("Bienvenido, " + user.getFirstname() + " " + user.getLastname());
        }
        displayUserData();
    }
    private void displayUserData() {
        if (user != null) {
            ArrayList<String> userDataList = new ArrayList<>();
            userDataList.add("Nombre: " + user.getFirstname());
            userDataList.add("Apellido: " + user.getLastname());
            userDataList.add("Correo electrónico: " + user.getEmail());
            userDataList.add("Teléfono: " + user.getPhone());

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, userDataList);
            listViewUserData.setAdapter(adapter);
        }
    }
}