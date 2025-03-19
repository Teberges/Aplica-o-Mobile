package com.example.aula3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class Main_Exercicio5 extends AppCompatActivity {

    private CheckBox cbxNotify, cbxLembrarLogin, cbxDarkMode;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_exercicio5);
        cbxNotify = findViewById(R.id.cbxNotify);
        cbxDarkMode = findViewById(R.id.cbxDarkMode);
        cbxLembrarLogin = findViewById(R.id.cbxLembrarLogin);
        btnSalvar = findViewById(R.id.btnSalvar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirPreferencias();
            }
        });
    }

    private void exibirPreferencias(){
        List<String> preferencias = new ArrayList<>();

        if(cbxNotify.isChecked()){
            preferencias.add("Enviar Notificações.");
        }
        if(cbxDarkMode.isChecked()){
            preferencias.add("Modo Escuro.");
        }
        if(cbxLembrarLogin.isChecked()){
            preferencias.add("Lembrar Login.");
        }
        StringBuilder mensagem = new StringBuilder("Preferências: ");
        if (preferencias.isEmpty()) {
            mensagem.append("Nenhuma opção selecionada.");
        } else {
            for (int i = 0; i < preferencias.size(); i++) {
                mensagem.append(preferencias.get(i));
                if (i < preferencias.size() - 1) {
                    mensagem.append(", ");
                }
            }
        }

        Toast.makeText(this, mensagem.toString(), Toast.LENGTH_SHORT).show();
    }
    public void voltar(View view){
        Intent intent = new Intent(Main_Exercicio5.this, MainActivity.class);
        startActivity(intent);
    }
}