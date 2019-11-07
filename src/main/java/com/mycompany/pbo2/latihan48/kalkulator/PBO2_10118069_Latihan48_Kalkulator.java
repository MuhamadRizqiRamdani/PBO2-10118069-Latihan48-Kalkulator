/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan48.kalkulator;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : Kalkulator
 */
public class PBO2_10118069_Latihan48_Kalkulator {
    private static double val1, val2;
    
    public static void main(String[] args) {
        
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        val1 = kalkulator.getValue1();
        val2 = kalkulator.getValue2();
        
        System.out.println("VALUE 1 = " + val1);
        System.out.println("VALUE 2 = " + val2);
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result Add is = " + kalkulator.add(val1,val2));
        System.out.println("Result Minus is = " + kalkulator.minus(val1, val2));
        System.out.println("Result Multiple is = " + kalkulator.mutiplication(val1, val2));
        System.out.println("Result Division is = " + kalkulator.division(val1, val2));
        
    }
}
