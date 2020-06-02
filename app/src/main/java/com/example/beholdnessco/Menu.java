package com.example.beholdnessco;

public class Menu {
    private String nama;
    private String harga;
    private String gambar;
    private String ket;

    public Menu(String datanama, String dataharga, String datagambar, String dataket){

        nama=datanama;
        harga=dataharga;
        gambar=datagambar;
        ket=dataket;
    }
    public String getNama() {
        return nama;
    }
    public String getHarga() {
        return harga;
    }
    public String getGambar() {
        return gambar;
    }
    public String getKet() {
        return ket;
    }
}
