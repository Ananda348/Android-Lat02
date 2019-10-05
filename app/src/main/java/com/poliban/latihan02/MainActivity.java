package com.poliban.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btRealmadrid = findViewById(R.id.btRealmadrid);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btLencester = findViewById(R.id.btLencester);
        Button btFiorentina = findViewById(R.id.btFiorentina);

        btRealmadrid.setOnClickListener(view -> {
            Toast.makeText(this, "Ente Musuh Ana", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Guweh barcelona Fans Club", Toast.LENGTH_SHORT).show();
        });

        btBarcelona.setOnClickListener(view -> Toast.makeText(this, "I'm Barcelona", Toast.LENGTH_SHORT).show());
        btLencester.setOnClickListener(view -> Toast.makeText(this, "I'm Lencester", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(view -> Toast.makeText(this, "I'm Fiorentina", Toast.LENGTH_SHORT).show());

    }
}
