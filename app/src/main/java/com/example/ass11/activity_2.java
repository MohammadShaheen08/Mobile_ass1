package com.example.ass11;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        String[] compounds = {
                "Water (H₂O) - composed of hydrogen (H₂) and oxygen (O₂)",
                "Carbon dioxide (CO₂) - composed of carbon (C) and oxygen (O₂)",
                "Sodium chloride (NaCl) - composed of sodium (Na) and chlorine (Cl₂)",
                "Hydrochloric acid (HCl) - composed of hydrogen (H₂) and chlorine (Cl₂)",
                "Sulfuric acid (H₂SO₄) - composed of hydrogen (H₂), sulfur (S), and oxygen (O₂)",
                "Methane (CH₄) - composed of carbon (C) and hydrogen (H₂)",
                "Ethanol (C₂H₅OH) - composed of carbon (C), hydrogen (H₂), and oxygen (O₂)",
                "Ammonia (NH₃) - composed of nitrogen (N) and hydrogen (H₂)",
                "Carbon monoxide (CO) - composed of carbon (C) and oxygen (O₂)",
                "Calcium carbonate (CaCO₃) - composed of calcium (Ca), carbon (C), and oxygen (O₂)"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, compounds);


        ListView listView = findViewById(R.id.listview);


        listView.setAdapter(adapter);
    }
}