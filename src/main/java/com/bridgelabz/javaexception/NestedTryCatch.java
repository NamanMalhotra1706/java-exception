package com.bridgelabz.javaexception;

import java.util.*;

public class NestedTryCatch {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = {10, 20, 30, 40, 50};

            try {
                System.out.print("Enter index to access: ");
                int index = sc.nextInt();

                try {
                    int value = numbers[index];
                    System.out.print("Enter divisor: ");
                    int divisor = sc.nextInt();

                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            } finally {
                sc.close();
            }
        }
}
