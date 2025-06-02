package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CardsActivity extends AppCompatActivity {
    private CardView blueCard;
    private CardView purpleCard;
    private CardView greenCard;
    private CardView orangeCard;
    private CardView yellowCard;
    private CardView redCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);


        blueCard = findViewById(R.id.blueCardButton);
        purpleCard = findViewById(R.id.purpleCardButton);
        greenCard = findViewById(R.id.greenCardButton);
        redCard = findViewById(R.id.redCardButton);
        orangeCard = findViewById(R.id.orangeCardButton);
        yellowCard = findViewById(R.id.yellowCardButton);

        blueCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CardsActivity.this, "CardView clicado!!!!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        purpleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CardsActivity.this, "CardView clicado!!!!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        greenCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CardsActivity.this, "CardView clicado!!!!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        orangeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CardsActivity.this, "CardView clicado!!!!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
            }
        });

        redCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardsActivity.this, BarcelonaActivity.class);
                startActivity(intent);
            }
        });

        yellowCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardsActivity.this, QatarActivity.class);
                startActivity(intent);
            }
        });
    }
}
