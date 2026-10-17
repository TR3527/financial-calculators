package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("==Financial Calculator Options==");

        System.out.println(" ");

        System.out.println("1.A mortgage calculator - it is used to calculate what the \n" +
                "monthly payment for a loan would be (minus any insurance or taxes), \n" +
                "and the total interest paid over the life of the loan.  ");

        System.out.println(" ");

        System.out.println("2. A calculator that determines the future value of a one\n" +
                "time deposit assuming compound interest - it is used to help you decide \n" +
                "how much a CD will be worth when it matures ");

        System.out.println(" ");

        System.out.println("3.A calculator that determines the present value of an \n" +
                "ordinary annuity.");

        System.out.println(" ");

        System.out.print("Which calculator would you like to access today? 1, 2 or 3?");
        int calcChoice = read.nextInt();

        if (calcChoice == 1){
            MortgageCalc.run();
        }else if (calcChoice == 2){
            FutureValueCalc.run();
        }else if (calcChoice == 3){
            PresentValueCalc.run();
        }else{
            System.out.println("Invalid input. Only pick options 1,2 or 3!");
        }










    }
}
