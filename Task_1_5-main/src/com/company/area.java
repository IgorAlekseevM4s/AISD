package com.company;

import java.lang.Math;

public class area {

    public area(double p, double a, double b, double c) {
        double p2 = p / 2;
        double S = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
        System.out.println("Площадь треугольника:"+S);
    }
}
