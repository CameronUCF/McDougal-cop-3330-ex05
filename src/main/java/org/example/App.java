/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        float firstNumber = scanner.nextFloat();

        System.out.println("What is the second number?");
        float secondNumber = scanner.nextFloat();

        scanner.close();

        System.out.printf("%.2f + %.2f = %.2f\n", firstNumber, secondNumber, firstNumber + secondNumber);
        System.out.printf("%.2f - %.2f = %.2f\n", firstNumber, secondNumber, firstNumber - secondNumber);
        System.out.printf("%.2f * %.2f = %.2f\n", firstNumber, secondNumber, firstNumber * secondNumber);
        System.out.printf("%.2f / %.2f = %.2f\n", firstNumber, secondNumber, firstNumber / secondNumber);
    }
}
