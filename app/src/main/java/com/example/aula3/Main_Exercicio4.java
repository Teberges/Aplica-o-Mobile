package com.example.aula3;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Main_Exercicio4 extends AppCompatActivity {

    private EditText txtNome;
    private LinearLayout cbxContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_exercicio4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtNome = findViewById(R.id.txtNome);
        cbxContainer = findViewById(R.id.cbxContainer);
        txtNome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateCheckboxes(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    private void updateCheckboxes(String name){
        cbxContainer.removeAllViews();

        for(char c : name.toCharArray()){
            CheckBox cbx = new CheckBox(this);
            cbx.setText(String.valueOf(c));
            cbxContainer.addView(cbx);
        }
    }
    public void voltar(View view){
        Intent intent = new Intent(Main_Exercicio4.this, MainActivity.class);
        startActivity(intent);
    }
}