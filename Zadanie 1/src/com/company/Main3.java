package com.company;

import java.util.Scanner;

public class Main3
{
    public static void main(String[] args)
    {
        Double farenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopnie Celcjusza");
        Double celcius = scanner.nextDouble();
        farenheit = ((1.8) * celcius) + 32;
        System.out.println("To jest tyle stopni farenhaita: " + farenheit);
    }
}