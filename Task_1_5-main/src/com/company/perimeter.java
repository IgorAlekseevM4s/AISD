package com.company;

public class perimeter {

    public perimeter(double a, double b, double c) {
        double p = (a + b + c);
        System.out.println("Периметр треугольника:"+p);
        new area(p,a,b,c);
    }
}
