package com.example.sal.faizal_1202150074_modul3;

import android.app.Activity;
import android.os.Bundle;

public class pilihAir {
    int foto;
    String nama;
    String detail;

    public pilihAir(int foto, String nama, String detail) {
        this.foto = foto;
        this.nama = nama;
        this.detail = detail;
    }

    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public String getDetail() {return detail; }

}
