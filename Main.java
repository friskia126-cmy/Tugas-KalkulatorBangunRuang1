/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package kalkulatorbangunruang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     KALKULATOR BANGUN RUANG");
        System.out.println("================================");

        // Input Kubus
        System.out.println("\n--- KUBUS ---");
        System.out.print("Masukkan sisi: ");
        double sisi = input.nextDouble();

        Kubus kubus = new Kubus(sisi);

        // Input Balok
        System.out.println("\n--- BALOK ---");
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);

        // Input Tabung
        System.out.println("\n--- TABUNG ---");
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        Tabung tabung = new Tabung(r, t);

        // Menampilkan hasil
        System.out.println("\n================================");
        System.out.println("       HASIL PERHITUNGAN");
        System.out.println("================================");

        System.out.println("\nKUBUS");
        System.out.println("Volume: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan: " + kubus.hitungLuas());

        System.out.println("\nBALOK");
        System.out.println("Volume: " + balok.hitungVolume());
        System.out.println("Luas Permukaan: " + balok.hitungLuas());

        System.out.println("\nTABUNG");
        System.out.println("Volume: " + tabung.hitungVolume());
        System.out.println("Luas Permukaan: " + tabung.hitungLuas());

        System.out.println("\n================================");
        System.out.println("       PROGRAM SELESAI");
        System.out.println("================================");

        input.close();
    }
}

