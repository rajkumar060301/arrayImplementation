package main;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 03-Mar-22
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        System.out.println("Array size is: " + size);
        int[] array = new int[size];
        System.out.print("array index is: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(i);
            if (i < array.length - 1) {
                System.out.print(",");
            }

        }
        System.out.println("\n");
        System.out.print("Enter the value in array: ");
        for (int index = 0; index < size; index++) {
            array[index] = scanner.nextInt();

        }
        System.out.print("Array values is: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            if (j < size - 1) {
                System.out.print(",");
            }

        }


    }
}
