package ua.edu.chmnu.fks.oop.Lab3;

public class Lab3_2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int max = 0, min = 100;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
               
            }
        }
        System.out.println(max);
    }
}
