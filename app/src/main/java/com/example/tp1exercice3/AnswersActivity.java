package com.example.tp1exercice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class AnswersActivity extends AppCompatActivity {

    private TextView aswr1, aswr2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        aswr1 = findViewById(R.id.aswr1);
        aswr2 = findViewById(R.id.aswr2);
        Intent intent = getIntent();
        String answer1 = intent.getStringExtra("qst1");
        if (answer1 == null || answer1 == "")
            answer1 += "Pas de réponse à afficher!";
        aswr1.setText(answer1);

        String answer2 = intent.getStringExtra("qst2");
        if (answer2 == null || answer2 == "")
            answer2 += "Pas de réponse à afficher!";
        aswr2.setText(answer2);




    }
}