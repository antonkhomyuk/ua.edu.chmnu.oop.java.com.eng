/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.Lab2;

public class Lab2 {
    
    public static void main(String[] args) {
       double x, a, b,c, r;
        x = -3.2;
        a = -7.1;
        b = 4.1;
        c = 5.0;
        double s = Math.pow (10, (-b*x) *a );
        r = s * (Math.cos ((Math.abs((c*x)-a))/(b*(Math.pow(x,2))+c)));
        System.out.println(""+r); 
    }
    
}
