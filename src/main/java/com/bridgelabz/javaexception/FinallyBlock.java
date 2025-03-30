package com.bridgelabz.javaexception;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
        // Taking user input
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        int result = numerator / denominator;
        System.out.println("Result: " + result);

    } catch (ArithmeticException e) {
        System.out.println("Error: Cannot divide by zero!");
    } finally {
        System.out.println("Operation completed.");
        sc.close();
    }
}
}
