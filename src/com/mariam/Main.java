package com.mariam;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

// The public class that has the same name as the Java file.
public class Main {
    public static void main(String[] args) {
        //        Linked list
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(90);
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(200));
        list.removeLast();
    }
}

