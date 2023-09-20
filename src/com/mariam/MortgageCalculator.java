package com.mariam;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
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
