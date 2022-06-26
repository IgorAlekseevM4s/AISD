package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите координаты первой точки (x1,x2):");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        System.out.print("введите координаты первой точки (y1,y2):");
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("введите координаты первой точки (y1,y2):");
        int z1 = scanner.nextInt();
        int z2 = scanner.nextInt();
        new triangle(x1, x2, y1, y2, z1, z2);
        System.out.print("Введите точку для поиска (px,py):");
        int px = scanner.nextInt();
        int py = scanner.nextInt();

        if(isInTriangle(x1, x2, y1, y2, z1, z2, px, py)){
            System.out.println("Точка в треугольнике");
        }
        else{
            System.out.println("Точка вне треугольника");
        }

    }

    private static boolean isInTriangle(int x1,int x2,int y1,int y2,int z1,int z2,int px,int py) {
        double bigArea,area1,area2,area3;
        bigArea = AreaofTriangle(x1, x2, y1, y2, z1, z2);
        area1 = AreaofTriangle(px, py, y1, y2, z1, z2);
        area2 = AreaofTriangle(x1, x2, px, py, z1, z2);
        area3 = AreaofTriangle(x1, x2, y1, y2, px, py);

        if(bigArea == (area1+area2+area3)) {
            return true;
        }
        return false;
    }

    private static double AreaofTriangle(int x1,int x2,int y1,int y2,int z1,int z2) {
        return 0.5*(double)Math.abs(x1*(y2-z2)+y1*(z2-x2)+z1*(x2-y2));
    }
}
