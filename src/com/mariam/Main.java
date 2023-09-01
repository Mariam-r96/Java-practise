package com.mariam;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

// The public class that has the same name as the Java file.
public class Main {
    public static void main(String[] args) {
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

// array class
class Array {
    public static void main(String[] args) {
        // 1D array
        int[] a = {1,2,3,4};
        System.out.println("array a " + Arrays.toString(a));

        //multi-dimensional array
        int[][] numbers = {{1,2,3},{4,5,6}};
        System.out.println("multi-dimensional array " + Arrays.deepToString(numbers));
    }
}

//reading input
class ReadInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.print("Age : ");
        byte age = scanner.nextByte();
        System.out.println("Your age is " + age);
    }
}
