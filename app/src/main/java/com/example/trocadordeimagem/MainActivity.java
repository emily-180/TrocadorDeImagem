package com.example.trocadordeimagem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button btnBotao1;
    private Button btnBotao2;
    private Button btnBotao3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        btnBotao1 = findViewById(R.id.btnBotao1);
        btnBotao2 = findViewById(R.id.btnBotao2);
        btnBotao3 = findViewById(R.id.btnBotao3);

        EscutadorBotao eb = new EscutadorBotao();

        btnBotao1.setOnClickListener( eb );
        btnBotao2.setOnClickListener( eb );
        btnBotao3.setOnClickListener( eb );

    }

    private class EscutadorBotao implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            Button b = (Button) view;

            switch ( b.getId() ) {

                case R.id.btnBotao1:
                    imageView.setImageResource(R.drawable.carla);
                    break;

                case R.id.btnBotao2:
                    imageView.setImageResource(R.drawable.lucrecia);
                    break;

                case R.id.btnBotao3:
                    imageView.setImageResource(R.drawable.rebeka);
                    break;
            }
        }
    }
}