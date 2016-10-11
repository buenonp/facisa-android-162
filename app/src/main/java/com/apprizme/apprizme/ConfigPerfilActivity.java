package com.apprizme.apprizme;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ConfigPerfilActivity extends AppCompatActivity {

    private ImageButton goToApprizs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_perfil);

        goToApprizs = (ImageButton) findViewById(R.id.goToApprizs);
        goToApprizs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigPerfilActivity.this, ApprizsActivity.class);
                startActivity(intent);
            }
        });

    }
}
