package com.example.jogadas;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    String jogador = "X";

    public void trocaJogador() {
        if (jogador.equals("X")) {
            jogador = "O";
        } else {
            jogador = "X";
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        final Button btn11Prog = (Button) findViewById(R.id.btn11);
        final Button btn12Prog = (Button) findViewById(R.id.btn12);
        final Button btn13Prog = (Button) findViewById(R.id.btn13);
        final Button btn22Prog = (Button) findViewById(R.id.btn22);
        final Button btn23Prog = (Button) findViewById(R.id.btn23);
        final Button btn21Prog = (Button) findViewById(R.id.btn21);
        final Button btn31Prog = (Button) findViewById(R.id.btn31);
        final Button btn32Prog = (Button) findViewById(R.id.btn32);
        final Button btn33Prog = (Button) findViewById(R.id.btn33);
        final TextView txtJogadorProg = (TextView) findViewById(R.id.txtJogador);
        final Button btnResetProg = (Button) findViewById(R.id.btnReset);

        btn11Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11Prog.setText(jogador);
                trocaJogador();
                btn11Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });
        btn12Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn12Prog.setText(jogador);
                trocaJogador();
                btn12Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });
        btn13Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn13Prog.setText(jogador);
                trocaJogador();
                btn13Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });
        btn22Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn22Prog.setText(jogador);
                trocaJogador();
                btn22Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });
        btn23Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn23Prog.setText(jogador);
                trocaJogador();
                btn23Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });
        btn21Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn21Prog.setText(jogador);
                trocaJogador();
                btn21Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });
        btn31Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn31Prog.setText(jogador);
                trocaJogador();
                btn31Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });
        btn32Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn32Prog.setText(jogador);
                trocaJogador();
                btn32Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });
        btn33Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn33Prog.setText(jogador);
                trocaJogador();
                btn33Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: " + jogador);
            }
        });

        btnResetProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11Prog.setClickable(true);
                btn11Prog.setText("");
                btn12Prog.setClickable(true);
                btn12Prog.setText("");
                btn13Prog.setClickable(true);
                btn13Prog.setText("");
                btn22Prog.setClickable(true);
                btn22Prog.setText("");
                btn23Prog.setClickable(true);
                btn23Prog.setText("");
                btn21Prog.setClickable(true);
                btn21Prog.setText("");
                btn31Prog.setClickable(true);
                btn31Prog.setText("");
                btn32Prog.setClickable(true);
                btn32Prog.setText("");
                btn33Prog.setClickable(true);
                btn33Prog.setText("");
            }
        });
    }
}