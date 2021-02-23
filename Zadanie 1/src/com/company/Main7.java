package com.company;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędne X");
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();

        System.out.println("Podaj wpółrzędne Y");
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();

        double wynik;

        wynik = sqrt((x2-x1)*(x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("Odległość wynosi " + wynik);
    }
}
