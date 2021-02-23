package com.company;

import java.util.Scanner;

public class Main4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok 1");
        int a = scan.nextInt();
        System.out.println("Podaj bok 2");
        int b = scan.nextInt();
        System.out.println("Podaj bok 3");
        int c = scan.nextInt();
        if (a + b > c)
            System.out.println("Tak");
        else
            System.out.println("Nie");
    }
}

