package java_homework_week_9;

import java.util.Scanner;

//3. Write a Java program to reverse an array of integer values.
public class Program_3_ReverseArrayInteger {
    //main method
    public static void main(String[] args) {
        //declaring array
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        int j = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter " + j + "st value : ");
            j++;
            //user can input numbers from console in for loop
            a[i] = scanner.nextInt();
        }
        //Displaying an array on the console
        System.out.println("Array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        //Reversing the array and displaying on the console
        System.out.println("\nReverse Array is : ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + "\t");
        }
        //closing the scanner
        scanner.close();
    }
}
