package com.apprizme.apprizme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriacaoGrupoActivity extends AppCompatActivity {

    private Button toApprizeGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criacao_grupo);

        toApprizeGrupo = (Button) findViewById(R.id.criarButton);
        toApprizeGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CriacaoGrupoActivity.this,ApprizsGrupoActivity.class);
                startActivity(intent);
            }
        });
    }
}
