package com.wikup.passandoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_segunda);

        textNome = findViewById (R.id.textNome);
        textIdade = findViewById (R.id.textIdade);

        // Recuperar os dados que foram enviados de uma para outra activity
        Bundle dados = getIntent ().getExtras ();
        //recuperei todos os dados
        String nome = dados.getString ("nome");
        int idade = dados.getInt ("idade");

        // Configurar valore recuperados
        textNome.setText ( nome );
        textIdade.setText ( String.valueOf(idade));
    }
}
