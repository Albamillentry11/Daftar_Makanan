package com.example.daftar_makanan;

import java.io.Serializable;

public class daftar implements Serializable {
    private String makanan;
    private String harga;
    private String deskripsi;
    private int gambar;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan)
    {
        this.makanan = makanan;
    }

    public String getHarga()
    {
        return harga;
    }

    public void setHarga(String harga)
    {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}