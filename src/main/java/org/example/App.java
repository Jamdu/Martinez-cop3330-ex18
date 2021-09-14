/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Martinez
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        int temp = 0;
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String conversion = scnr.nextLine();

        System.out.println("Your choice: " + conversion);

        if (conversion.equals("C") || conversion.equals("c"))
        {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            int f = scnr.nextInt();

            temp = ((f - 32) * 5) / 9;
            System.out.println("The temperature in Celsius is " + temp);
        }
        else if (conversion.equals("F") || conversion.equals("f"))
        {
            System.out.println("Please enter the temperature in Celsius: ");
            int c = scnr.nextInt();

            temp = (c * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + temp);
        }
    }
}
