package com.hariobudiharjo.tanamanqu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailTanamanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tanaman);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String nama = getIntent().getStringExtra("nama");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        String gambar = getIntent().getStringExtra("gambar");

        ImageView imageView = findViewById(R.id.gambarTanaman);
        TextView textViewJudul = findViewById(R.id.textJudul);
        TextView textViewDeskripsi = findViewById(R.id.textDeskripsi);

        int gambarId = getResources().getIdentifier(gambar, "drawable", getPackageName());
        imageView.setImageResource(gambarId);
        textViewJudul.setText(nama);
        textViewDeskripsi.setText(deskripsi);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
