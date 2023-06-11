/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hitung;

/**
 *
 * @AmangArap
 */
public class Matematika {
    //Membuat Variabel
    private double bil1,bil2;
    
    //Membuat constructor
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //method accessor
    double setPenjumlahan() {
        return bil1 + bil2;
    }
}
