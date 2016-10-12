package com.apprizme.apprizme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MensagemActivity extends AppCompatActivity {

    private ImageButton returnToApprizGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        returnToApprizGroup = (ImageButton)findViewById(R.id.imageButton2);
        returnToApprizGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MensagemActivity.this,MenuLateralActivity.class);
                startActivity(intent);
            }
        });
    }
}
