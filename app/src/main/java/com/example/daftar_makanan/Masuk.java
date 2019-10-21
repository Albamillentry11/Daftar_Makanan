package com.example.daftar_makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Masuk extends AppCompatActivity
{
    private daftar makan;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);

        TextView nama = findViewById(R.id.view_nama);
        TextView harga = findViewById(R.id.view_harga);
        TextView deskripsi = findViewById(R.id.view_deskripsi);
        ImageView gambar = findViewById(R.id.imageView2);

        Bundle data = getIntent().getExtras();
        if(data!=null){
            makan = (daftar)getIntent().getSerializableExtra("makanan");
            String harga_mkn = "Rp."+makan.getHarga()+",-";
            String deskrip = "Deskripsi \n"+makan.getDeskripsi();
            nama.setText(makan.getMakanan());
            harga.setText(harga_mkn);
            deskripsi.setText(deskrip);
            Glide.with(this)
                    .load(makan.getGambar())
                    .into(gambar);
        }
    }
}
