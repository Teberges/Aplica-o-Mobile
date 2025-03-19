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

public class Main_Exercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_exercicio2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void soma(View view){
        EditText txtNumber1 = findViewById(R.id.txtNumber1);
        EditText txtNumber2 = findViewById(R.id.txtNumber2);
        TextView lblResult = findViewById(R.id.lblResult);
        int resultado = (parseInt(txtNumber1.getText().toString()) + parseInt(txtNumber2.getText().toString()));
        lblResult.setText(String.valueOf("O resultado é " + resultado));
    }
    public void subtracao(View view){
        EditText txtNumber1 = findViewById(R.id.txtNumber1);
        EditText txtNumber2 = findViewById(R.id.txtNumber2);
        TextView lblResult = findViewById(R.id.lblResult);
        int resultado = (parseInt(txtNumber1.getText().toString()) - parseInt(txtNumber2.getText().toString()));
        lblResult.setText(String.valueOf("O resultado é " + resultado));
    }
    public void mult(View view){
        EditText txtNumber1 = findViewById(R.id.txtNumber1);
        EditText txtNumber2 = findViewById(R.id.txtNumber2);
        TextView lblResult = findViewById(R.id.lblResult);
        int resultado = (parseInt(txtNumber1.getText().toString()) * parseInt(txtNumber2.getText().toString()));
        lblResult.setText(String.valueOf("O resultado é " + resultado));
    }
    public void div(View view){
        EditText txtNumber1 = findViewById(R.id.txtNumber1);
        EditText txtNumber2 = findViewById(R.id.txtNumber2);
        TextView lblResult = findViewById(R.id.lblResult);
        int resultado = (parseInt(txtNumber1.getText().toString()) / parseInt(txtNumber2.getText().toString()));
        lblResult.setText(String.valueOf("O resultado é " + resultado));
    }
    public void voltar(View view){
        Intent intent = new Intent(Main_Exercicio2.this, MainActivity.class);
        startActivity(intent);
    }
}