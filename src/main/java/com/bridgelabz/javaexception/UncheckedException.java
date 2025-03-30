package com.bridgelabz.javaexception;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            System.out.println("Result: " + numerator / denominator);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Cannot enter a non-numeric value: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
