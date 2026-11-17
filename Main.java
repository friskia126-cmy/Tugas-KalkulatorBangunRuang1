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

        // KUBUS
        System.out.println("\n--- KUBUS ---");
        System.out.print("Masukkan sisi: ");
        double sisi = input.nextDouble();

        Kubus kubus = new Kubus(sisi);

        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Kubus: " + kubus.hitungLuas());

        // BALOK
        System.out.println("\n--- BALOK ---");
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);

        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Balok: " + balok.hitungLuas());

        // TABUNG
        System.out.println("\n--- TABUNG ---");
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        Tabung tabung = new Tabung(r, t);

        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        System.out.println("Luas Tabung: " + tabung.hitungLuas());

        input.close();
    }
}
