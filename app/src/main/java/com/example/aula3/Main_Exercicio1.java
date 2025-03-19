package com.example.aula3;

import static java.lang.Integer.parseInt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Main_Exercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_exercicio1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void verifica(View view){
        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtIdade = findViewById(R.id.txtIdade);
        if(parseInt(txtIdade.getText().toString()) >= 18){
            TextView textViewMensagem = findViewById(R.id.lblResposta);
            textViewMensagem.setText("Você é maior de idade! E seu nome é " + txtNome.getText().toString());
        }else{
            TextView textViewMensagem = findViewById(R.id.lblResposta);
            textViewMensagem.setText("Você é menor de idade! E seu nome é " + txtNome.getText().toString());
        }
    }
    public void voltar(View view){
        Intent intent = new Intent(Main_Exercicio1.this, MainActivity.class);
        startActivity(intent);
    }
}