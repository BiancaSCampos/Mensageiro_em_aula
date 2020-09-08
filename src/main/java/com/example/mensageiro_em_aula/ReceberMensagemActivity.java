package com.example.mensageiro_em_aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ReceberMensagemActivity extends AppCompatActivity {

    public static final String MENSAGEM_EXTRA = "texto";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receber_mensagem);


        Intent intencaoRecebida = getIntent();
        String mensagem = intencaoRecebida.getStringExtra(MENSAGEM_EXTRA);
    }

}