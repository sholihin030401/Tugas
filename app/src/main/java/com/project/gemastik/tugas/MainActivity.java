package com.project.gemastik.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView gambar1 = findViewById(R.id.gambar1);
        TextView gambar2 = findViewById(R.id.gambar2);
        TextView gambar3 = findViewById(R.id.gambar3);
        TextView gambar4 = findViewById(R.id.gambar4);
        TextView gambar5 = findViewById(R.id.gambar5);
        TextView gambar6 = findViewById(R.id.gambar6);

        gambar1.setOnClickListener(this);
        gambar2.setOnClickListener(this);
        gambar3.setOnClickListener(this);
        gambar4.setOnClickListener(this);
        gambar5.setOnClickListener(this);
        gambar6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.gambar1:

            case R.id.gambar2:

            case R.id.gambar3:

            case R.id.gambar4:

            case R.id.gambar5:

            case R.id.gambar6:
                Intent intent1 = new Intent(this,Gambar.class);
                startActivity(intent1);
                break;
        }
    }
}