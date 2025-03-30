package com.bridgelabz.javaexception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosing {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\naman\\IdeaProjects\\java-exceptions\\src\\main\\java\\com\\bridgelabz\\javaexception\\info.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
