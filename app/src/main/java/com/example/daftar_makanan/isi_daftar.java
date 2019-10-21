package com.example.daftar_makanan;

import java.util.ArrayList;

public class isi_daftar
{
    private static String[]makanan=
            {
                    "Pecel Lele",
                    "Nasi Goreng Mercon",
                    "Ayam Geprek Keju",
                    "Kari Ayam",
                    "Tahu Bulat",
                    "Salad Buah"
            };

    private static  String[] deskripsi=
            {
                    "Nasi yang disajikan dengan lele jadi-jadian",
                    "Nasi yang digoreng lalu diberikan 1000kg lombok",
                    "Ayam yang digeprek lembut dengan siraman keju yang lembut",
                    "Makanan yang dibuatnya dengan cita rasa dunia kuliner yang uwaw",
                    "Tahu yang ketika digoreng seketika bulat karena ya bulat",
                    "Makanan yang dibuat dengan sayuran biar makin kuat dan sehat"
            };

    public static String[] harga=
            {
                    "15000",
                    "14500",
                    "20000",
                    "17500",
                    "500",
                    "12000"
            };

    private static int[] gambar=
            {
                    R.drawable.lele,
                    R.drawable.nasgor,
                    R.drawable.geprek,
                    R.drawable.kari,
                    R.drawable.tahu,
                    R.drawable.salad
            };


    static ArrayList<daftar> getListData()
    {
        ArrayList<daftar> list = new ArrayList<>();
        for (int position = 0; position < makanan.length; position++)
        {
            daftar daftar = new daftar();
            daftar.setMakanan(makanan[position]);
            daftar.setHarga(harga[position]);
            daftar.setGambar(gambar[position]);
            daftar.setDeskripsi(deskripsi[position]);
            list.add(daftar);
        }
        return list;
    };
}