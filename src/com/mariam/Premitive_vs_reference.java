package com.mariam;

import java.awt.*;

public class Premitive_vs_reference {
    public static void main(String[] args){
        // for primitive types
        byte a = 3;
        byte b = a;
        a = 5;
        System.out.println(b);

        // for reference types
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
