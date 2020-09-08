package com.example.mensageiro_em_aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnviarMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_mensagem);
    }

    public void onEnviarMensagem (View view){

        EditText editText = (EditText) findViewById(R.id.editMensagem);
        String mensagem = editText.getText().toString();
        Intent intencao = new Intent(this, ReceberMensagemActivity.class);
        intencao.putExtra(ReceberMensagemActivity.MENSAGEM_EXTRA, mensagem);
        startActivity(intencao);
    }
}