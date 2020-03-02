package com.wikup.passandoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar; // buttonEnviar é o atributo do botão

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        btnEnviar = findViewById (R.id.buttonEnviar);

        btnEnviar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {

                // Objeto intente, intenção neste exemplo usamos para chamar a segunda activity, mas podia criar um intent para chamar a camera
                // ligar o Bluetooth etc Usar um eitor de pdf por exemplo
                Intent intent = new Intent(getApplicationContext (), SegundaActivity.class);

                //Passar dados
                intent.putExtra ("nome", "Ricardo");
                intent.putExtra ("idade", 32);

                startActivity (intent);
                //  Paramentro intent, vou instanciar essa intent e passar dois parametro, getApplicationContext (contexto)  e
                // A activity que quero chamar, precisa por o .class
                //

            }
        }); // adicionar um evento de click neste botão enviar
        // dentro do () instanciar uma classe, não é possível instaciar uma interface, criar um classe anonima, instanciar ela
        // e dentro dela estará implementado o metodo de click.
    }
}
