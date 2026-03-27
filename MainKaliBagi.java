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

public class MainKaliBagi {
    public static void main(String[] args) {
        KaliBagi kb1 = new KaliBagi(5.0, 3.0);
        System.out.println(kb1.getA1() + " * " + kb1.getA2() + " = " + kb1.kali());
        System.out.println(kb1.getA1() + " / " + kb1.getA2() + " = " + kb1.bagi());
        System.out.println(" ");
        
        KaliBagi kb2 = new KaliBagi(10.0, 5.0);
        System.out.println(kb2.getA1() + " + " + kb2.getA2() + " = " + kb2.kali());
        System.out.println(kb2.getA1() + " / " + kb2.getA2() + " = " + kb2.bagi());
        System.out.println(" ");


        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan a1: ");
            Double a1 = input.nextDouble();

            System.out.print("Masukkan a2: ");
            Double a2 = input.nextDouble();

            System.out.println("Output");

            KaliBagi kb = new KaliBagi(a1, a2);
            System.out.println(kb.getA1() + " * " + kb.getA2() + " = " + kb.kali());
            System.out.println(kb.getA1() + " / " + kb.getA2() + " = " + kb.bagi());
            System.out.println(" ");
            
        } catch (InputMismatchException e) {
            System.out.println("Error : Inputan harus angka!!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}