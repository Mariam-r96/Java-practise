package com.mariam;

import java.util.Scanner;

public class ReadInput {
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
