package com.mariam;

import java.awt.*;
import java.text.NumberFormat;
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

//mortgage calculator
class MortgageCalculator{
    public static void main(String[] args){
        byte month_in_years = 12;
        
        //taking inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate : ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterest = annualInterestRate / month_in_years / 100;

        System.out.print("Period (Years) : ");
        byte period = scanner.nextByte();
        int no_of_payments = period*12;
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest , no_of_payments)) / (Math.pow(1 + monthlyInterest , no_of_payments) - 1);

        System.out.println("mortgage "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
}

class BuildingDynamicArray{
    private int[] items;
    private int count;

    public BuildingDynamicArray(int length){
        items = new int[length];
    }

    public void insert(int item){
        items[count++] = item;
        // array is full, resize it
        if(count == items.length){
            // create a new array twice the size
            //copy existing items and set items to the new array
           int [] newItems = new int[count * 2];
           for(int i = 0 ; i < count ; i++){
               newItems[i] = items[i];
           }
           items = newItems;
        }
    }

    public void removeAt(int index){
        if((index < 0) || index >= count ){
            throw new IllegalArgumentException();
        } else {
            for (int i = index ; i < count ; i++){
                items[i] = items[i+1];
            }
            count --;
        }
    }

    public void print(){
        for (int i= 0; i < count ; i++){
            System.out.println(items[i]);
        }
    }
    public static void main(String [] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter length of array");
//        int length = scanner.nextInt();
        BuildingDynamicArray numbers = new BuildingDynamicArray(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(5);
        numbers.insert(6);
        numbers.removeAt(2);
        numbers.print();

    }


}
