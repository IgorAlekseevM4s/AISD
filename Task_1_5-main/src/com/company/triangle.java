package com.company;

import java.lang.Math;

public class triangle {

    public triangle(int x1, int x2, int y1, int y2, int z1, int z2) {
        double a = Math.sqrt(Math.pow((x1 - y1), 2) + Math.pow((x2 - y2), 2));
        double b = Math.sqrt(Math.pow((y1 - z1), 2) + Math.pow((y2 - z2), 2));
        double c = Math.sqrt(Math.pow((z1 - x1), 2) + Math.pow((z2 - x2), 2));
        if (a + b >= c) {
            if (a + c >= b)
                if (b + c >= a)
                    System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует");
        }
        new perimeter(a,b,c);
    }
}
