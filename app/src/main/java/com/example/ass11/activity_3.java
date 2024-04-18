package com.example.ass11;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_3 extends AppCompatActivity {

    private Spinner[] spinners;
    private TextView[] textStatements;
    private Button buttonCheck;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        spinners = new Spinner[]{
                findViewById(R.id.spinner_1),
                findViewById(R.id.spinner_statement2),

        };
        textStatements = new TextView[]{
                findViewById(R.id.text_statement1),
                findViewById(R.id.text_statement2),

        };
        buttonCheck = findViewById(R.id.button_check);
        textResult = findViewById(R.id.text_result);

        // Set up Spinners
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        for (Spinner spinner : spinners) {
            spinner.setAdapter(adapter);
        }

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswers();
            }
        });
    }

    private void checkAnswers() {
        int correctCount = 0;


        for (Spinner spinner : spinners) {
            String selected = spinner.getSelectedItem().toString();
            if (selected.equals("Correct")) {
                correctCount++;
            }
        }


        textResult.setText("You got " + correctCount + " out of " + spinners.length + " correct.");
    }
}
