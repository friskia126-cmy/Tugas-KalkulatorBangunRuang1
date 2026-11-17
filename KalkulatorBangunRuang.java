/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package kalkulatorbangunruang;

// Class Kubus
class Kubus {

    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public double hitungLuas() {
        return 6 * sisi * sisi;
    }
}

// Class Balok
class Balok {

    double panjang;
    double lebar;
    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuas() {
        return 2 * (panjang * lebar
                + panjang * tinggi
                + lebar * tinggi);
    }
}

// Class Tabung
class Tabung {

    double jariJari;
    double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public double hitungLuas() {
        return 2 * Math.PI * jariJari
                * (jariJari + tinggi);
    }
}
