package com.apprizme.apprizme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PesquisaGruposActivity extends AppCompatActivity {

    private Button toApprizeGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa_grupos);

        toApprizeGrupo = (Button)findViewById(R.id.BtEntrar);
        toApprizeGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PesquisaGruposActivity.this,MensagemActivity.class);
                startActivity(intent);
            }
        });
    }
}
