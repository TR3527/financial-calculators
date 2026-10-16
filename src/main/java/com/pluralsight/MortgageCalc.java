package com.pluralsight;

import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = read.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = read.nextDouble();

        System.out.print("Enter the loan term: ");
        int loanLife = read.nextInt();

        int numOfMonthlyPayments = loanLife * 12;
        double annualInterestRate = interestRate / 100;
        double monthlyInterestRate = annualInterestRate/12;
        double powerVal = Math.pow(1 + monthlyInterestRate, numOfMonthlyPayments);

        //Monthly payment =  P × (i × (1 + i)^n) / ((1 + i)^n - 1)
        double monthlyPayment = (loanAmount * monthlyInterestRate * powerVal) / ((powerVal)-1);


        //Total Interest
        double interestTotal = (monthlyPayment * numOfMonthlyPayments) - loanAmount;

        System.out.println("A $" + loanAmount + " loan at " + annualInterestRate + "% interest rate " + "for ");
        System.out.println(loanLife + " years would have a $" + monthlyPayment + "/mo payment");
        System.out.println("with a total interest of $" + interestTotal + ".");

        read.close();







    }
}
