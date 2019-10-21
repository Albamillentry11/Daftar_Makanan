package com.example.daftar_makanan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView hola;
    private ArrayList<daftar> list= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hola = findViewById(R.id.recyclerVieww);
        hola.setHasFixedSize(true);

        list.addAll(isi_daftar.getListData());
        showRecyclerList();
    }

    private void showRecyclerList()
    {
        hola.setLayoutManager(new LinearLayoutManager(this));
        Adaptor ListAdaptor = new Adaptor(list,MainActivity.this);
        hola.setAdapter(ListAdaptor);

//        Adaptor.setOnItemClickCallback(new Adaptor.OnItemClickCallback()
//        {
//            @Override
//            public void onItemClicked(daftar data)
//            {
//                showMasuk(data);
//            }
//        });
    }

//    private void showMasuk(daftar data)
//    {
//        Intent intent = new Intent(this,Masuk.class);
//        intent.putExtra("data", data);
//        startActivity(intent);
//    }
}