package com.mariam;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 1D array
        int[] a = {1,2,3,4};
        System.out.println("array a " + Arrays.toString(a));

        //multi-dimensional array
        int[][] numbers = {{1,2,3},{4,5,6}};
        System.out.println("multi-dimensional array " + Arrays.deepToString(numbers));
    }
}
