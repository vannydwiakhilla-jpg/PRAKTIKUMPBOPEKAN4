/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;

/**
 *
 * @author adema
 */
import java.util.*;

public class MainPegawai {
    public static void main(String[] args) {

        Pegawai p1 = new Pegawai("012110", "Uchiha Itachi", "SDM");
        Pegawai p2 = new Pegawai("33-001", "Sasori", "Keuangan");
        Pegawai p3 = new Pegawai("IW-08721", "Deidara", "Produksi");
        
        ArrayList<Pegawai> sdm = new ArrayList<>();
        sdm.add(p1);
        ArrayList<Pegawai> keuangan = new ArrayList<>();
        keuangan.add(p2);
        ArrayList<Pegawai> produksi = new ArrayList<>();
        produksi.add(p3);

        System.out.println("-- Departemen SDM --");
        for (Pegawai p : sdm) {
            System.out.println(p.getId() + " | " + p.getNama());
        }

        System.out.println("-- Departemen Keuangan --");
        for (Pegawai p : keuangan) {
            System.out.println(p.getId() + " | " + p.getNama());
        }

        System.out.println("-- Departemen Produksi --");
        for (Pegawai p : produksi) {
            System.out.println(p.getId() + " | " + p.getNama());
        }
    }
}