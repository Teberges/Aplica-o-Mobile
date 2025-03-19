package com.example.aula3;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_main2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main2);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });

        Button buttonEnviar = findViewById(R.id.ButtonEnviar);
        buttonEnviar.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Botão pressionado", Toast.LENGTH_SHORT).show();
        });

        Button buttonVoltar = findViewById(R.id.ButtonVoltar);
        buttonVoltar.setOnClickListener(v -> {
           Intent intent = new Intent(activity_main2.this, MainActivity.class);
           startActivity(intent);
        });
    }
}