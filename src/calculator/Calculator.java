/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author M. Galih Wiyono
 */

    //class kalkulator
    class kalku{
    double tambah(double angka1, double angka2){
        return angka1 + angka2;
    }
    
    double kali(double angka1, double angka2){
        return angka1 * angka2;
    }
    
    double kurang(double angka1, double angka2){
        return angka1 - angka2;
    }
    
    double bagi(double angka1, double angka2){
        return angka1 / angka2;
    }
    
    //constructor kalkulator
        kalku() {
      System.out.println("Selamat Datang di Kalkulator Sederhana\nPerhitungan yang dapat dilakukan adalah perhitungan 2 angka sederhana\n================================");
    }
            
    }

public class Calculator {
    static Scanner input = new Scanner(System.in);   
    
    //metode input angka
    static double inputAngka1() {
        System.out.println("Silahkan Masukan Kedua Angka");
        System.out.print("Angka Pertama : ");
        double angka1 = input.nextDouble();
        return angka1;
    }
    static double inputAngka2() {
        System.out.print("Angka Kedua : ");
        double angka2 = input.nextDouble();
        return angka2;
    }
    
    public static void main(String[] args) {
       int pilih;
       double angka1,angka2;
       kalku kalku = new kalku();
        do {
        System.out.print("\nSilahkan Masukan Jenis Perhitungan(1-5):\n1. Pertambahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Keluar\nPilihan Anda : ");
        pilih = input.nextInt();
        
            switch (pilih) {   
                case 1 : angka1 = inputAngka1();
                         angka2 = inputAngka2();
                        System.out.println("Hasil : " + kalku.tambah(angka1, angka2));
                        break;
                case 2 : angka1 = inputAngka1();
                         angka2 = inputAngka2();
                        System.out.println("Hasil : " + kalku.kurang(angka1, angka2));
                        break;
                case 3 : angka1 = inputAngka1();
                         angka2 = inputAngka2();
                        System.out.println("Hasil : " + kalku.kali(angka1, angka2));
                        break;
                case 4 : do {
                         angka1 = inputAngka1();
                         angka2 = inputAngka2();
                            if (angka2 == 0) {
                                System.out.println("Angka ke-2 Tidak Boleh 0, Mohon Masukan Kembali Angka Lain");
                            } else {
                                System.out.println("Hasil : " + kalku.bagi(angka1, angka2));
                            }
                         } while (angka2 == 0);
                         break;
                case 5 : System.out.println("Terima Kasih Sudah Menggunakan Kalkulator Sederhana");
                        break;
                default : System.out.println("Pilihan Anda Salah");;
                        break;
            }
        } while (pilih != 5);
        
    }
    
}
