/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hitung;

/**
 *
 * @author asus
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
      //Membuat objek
      Matematika rafli = new Matematika(6,4);
      
        System.out.println("Hasil Penjumlahan : " + rafli.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + rafli.setPengurangan());
        System.out.println("Hasil Perkalian : " + rafli.setPerkalian());
        System.out.println("Hasil Pembagian : " + rafli.setPembagian());

    }
    
}
