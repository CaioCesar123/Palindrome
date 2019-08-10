package com.example.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Palin(View v){
        EditText editText = (EditText) findViewById(R.id.Input_Palavra);

        Palindrome palin = new Palindrome();

        String valor = editText.getText().toString();

        if (palin.Verificar(valor) == true){
            Toast.makeText(this , String.valueOf("É um Palindrome!"),Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this , String.valueOf("Não é um Palindrome!"),Toast.LENGTH_LONG).show();
        }
    }
}
