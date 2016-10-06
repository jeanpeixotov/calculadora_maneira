package com.example.jean.calculadora_setec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conectando os elementos do layout no código]
        TextView ResultadoScreen = (TextView) findViewById(R.id.resultado);

        //operadores
        Button BotaoMulti = (Button) findViewById(R.id.btn_multiplicacao);
        Button BotaoDiv = (Button) findViewById(R.id.btn_divisao);
        Button BotaoSoma = (Button) findViewById(R.id.btn_soma);
        Button BotaoSub = (Button) findViewById(R.id.btn_menos);
        Button BotaoIgual = (Button) findViewById(R.id.btn_igual);
        Button BotaoParenteses = (Button) findViewById(R.id.btn_parenteses);
        Button BotaoPorcentagem = (Button) findViewById(R.id.btn_porcentagem);
        Button BotaoLimpar = (Button) findViewById(R.id.btn_delete);
        Button BotaoPonto = (Button) findViewById(R.id.btn_ponto);

        //numeros
        Button BotaoZero = (Button) findViewById(R.id.btn_zero);
        Button BotaoUm = (Button) findViewById(R.id.btn_um);
        Button BotaoDois = (Button) findViewById(R.id.btn_dois);
        Button BotaoTres = (Button) findViewById(R.id.btn_tres);
        Button BotaoQuatro = (Button) findViewById(R.id.btn_quatro);
        Button BotaoCinco = (Button) findViewById(R.id.btn_cinco);
        Button BotaoSeis = (Button) findViewById(R.id.btn_seis);
        Button BotaoSete = (Button) findViewById(R.id.btn_sete);
        Button BotaoOito = (Button) findViewById(R.id.btn_oito);
        Button BotaoNove = (Button) findViewById(R.id.btn_nove);


    }




}
