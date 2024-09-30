package com.example.tp1exercice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4;
    private Button quit, next;
    String answer1 = "";
    String answer2 = "";
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.CB1);
        cb2 = findViewById(R.id.CB2);
        cb3 = findViewById(R.id.CB3);
        cb4 = findViewById(R.id.CB4);
        quit = findViewById(R.id.quitBn);
        next = findViewById(R.id.nextBn);
        rb1 = findViewById(R.id.ouiRB);
        rb2 = findViewById(R.id.nonRB);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cb1.isChecked())
                    answer1 += cb1.getText().toString() + "\n";
                if (cb2.isChecked())
                    answer1 += cb2.getText().toString() + "\n";
                if (cb3.isChecked())
                    answer1 += cb3.getText().toString() + "\n";
                if (cb4.isChecked())
                    answer1 += cb4.getText().toString() + "\n";

                if(rb1.isChecked())
                    answer2 += "Oui";
                if(rb2.isChecked())
                    answer2 += "Non";

                Intent intent = new Intent(MainActivity.this, AnswersActivity.class);
                intent.putExtra("qst1", answer1);
                intent.putExtra("qst2", answer2);
                startActivity(intent);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}