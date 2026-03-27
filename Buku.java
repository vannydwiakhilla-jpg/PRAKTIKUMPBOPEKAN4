/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum3;

/**
 *
 * @author adema
 */
public class Buku {
    private String id;
    private String judul;
    private Integer tahunTerbit;

    public Buku(String id, String judul, Integer tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}