package com.pluralsight;
import java.util.Scanner;

public class PresentValueCalc {
    public static void run(){
    //public static void main(String[] args){

        Scanner readThis = new Scanner(System.in);

        System.out.print("What is the desired monthly payout?: ");
        double monthlyPayout = readThis.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInt = readThis.nextDouble();

        System.out.print("Enter number of years the annuity pays out: ");
        int payoutYears = readThis.nextInt();

        double decimalAnnualInt = annualInt/100;
        double monthlyIntRate = decimalAnnualInt/12;
        int monthCount = 12;


        int numOfPayments = monthCount * payoutYears;

        double presValue = monthlyPayout * (1 - Math.pow(1 + monthlyIntRate, -numOfPayments)) / monthlyIntRate;



        System.out.println("To fund an annuity that pays $" + monthlyPayout + " monthly \n" +
                "for " + payoutYears + " years and earns an expected " + annualInt + "% interest, you \n"+
                "would need to invest $" + presValue + " today.");








//fill out the output o find out what variables are needed


    }


}
