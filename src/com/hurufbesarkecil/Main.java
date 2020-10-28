package com.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk mengubah huruf menjadi kapital dan huruf kecil
 */

public class Main {
    static Scanner scan = new Scanner(System.in);

    private static String masukkanKalimat(){
        System.out.print("Masukkan Kalimat : ");
        return scan.nextLine();
    }

    private static void tampilKalimat(String kalimat){
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(kalimat.toLowerCase()));
    }

    public static void main(String[] args) {
        tampilKalimat(masukkanKalimat());
    }
}
