package com.company;

import java.util.Scanner;

public class Main6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby");
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();

        if ((liczba1 > liczba2) && (liczba1 > liczba3) && (liczba2 > liczba3)) {
            System.out.println(liczba1);
            System.out.println(liczba2);
            System.out.println(liczba3);
        } else if ((liczba2 > liczba1) && (liczba2 > liczba3) && (liczba1 > liczba3)) {
            System.out.println(liczba2);
            System.out.println(liczba1);
            System.out.println(liczba3);
        } else if ((liczba3 > liczba2) && (liczba3 > liczba1) && (liczba2 > liczba1)) {
            System.out.println(liczba3);
            System.out.println(liczba2);
            System.out.println(liczba1);
        } else if ((liczba3 > liczba2) && (liczba3 > liczba1) && (liczba1 > liczba2)) {
            System.out.println(liczba3);
            System.out.println(liczba1);
            System.out.println(liczba2);
        }
    }
}
