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

public class MainBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        daftarBuku.add(new Buku("123", "Attack on Titan", 2009));
        daftarBuku.add(new Buku("234", "Dragon Ball", 1984));

        try {
            System.out.print("Masukkan id: ");
            String id = input.nextLine();
            System.out.print("Masukkan judul: ");
            String judul = input.nextLine();
            System.out.print("Masukkan tahun terbit: ");
            
            int tahun = input.nextInt();
            Buku bukuBaru = new Buku(id, judul, tahun);
            daftarBuku.add(bukuBaru);

        } catch (InputMismatchException e) {
            System.out.println("Error: Inputan tahun harus angka!!");
        }

        System.out.println("Daftar Buku:");
        for (Buku b : daftarBuku) {
            System.out.println(b.getId() + " | " + b.getJudul() + " | " + b.getTahunTerbit());
        }
    }
}