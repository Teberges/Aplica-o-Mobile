package com.example.aula3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView textViewMensagem = findViewById(R.id.textViewMensagem);
        textViewMensagem.setText("Novo Texto!");

        EditText editText = findViewById(R.id.editTextNome);
        editText.setHint("Digite o seu nome! ");
        Toast.makeText(this, "Seu Nome é:" + editText.getText(), Toast.LENGTH_SHORT).show();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void eventoBotao(View view) {
        Toast.makeText(this, "O botão foi clicado?", Toast.LENGTH_SHORT).show();
    }
    public void proximaTela(View view){
        Intent intent = new Intent(MainActivity.this, activity_main2.class);
        startActivity(intent);
    }
    public void exercicio1(View view){
        Intent intent = new Intent(MainActivity.this, Main_Exercicio1.class);
        startActivity(intent);
    }
    public void exercicio2(View view){
        Intent intent = new Intent(MainActivity.this, Main_Exercicio2.class);
        startActivity(intent);
    }
    public void exercicio3(View view){
        Intent intent = new Intent(MainActivity.this, Main_Exercicio3.class);
        startActivity(intent);
    }
    public void exercicio4(View view){
        Intent intent = new Intent(MainActivity.this, Main_Exercicio4.class);
        startActivity(intent);
    }
    public void exercicio5(View view){
        Intent intent = new Intent(MainActivity.this, Main_Exercicio5.class);
        startActivity(intent);
    }
}