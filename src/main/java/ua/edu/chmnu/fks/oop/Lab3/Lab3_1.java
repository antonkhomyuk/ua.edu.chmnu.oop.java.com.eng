/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.Lab3;

public class Lab3_1 {
    
   public static void main(String[] args) {
    int qq = 0;
    int[] arr = new int[12];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = (int) Math.round((Math.random() * 100) - 50);
        System.out.print("\t" + arr[i]);
        }
    for (int i:arr){
        if (i<0){
            qq++;
        }
    }
    System.out.println("\nКоличество чисел меньше 0 - " + qq);
    }

}
