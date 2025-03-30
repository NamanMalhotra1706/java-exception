package com.bridgelabz.javaexception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if(age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }
            else{
                System.out.println("Access granted!");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        }
    }
}
