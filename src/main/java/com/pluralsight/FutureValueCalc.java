package com.pluralsight;
import java.util.Scanner;

public class FutureValueCalc {

       // public static void run(){
            //^^ add this when finished
        public static void main(String[] args){

        Scanner read = new Scanner(System.in);

            System.out.print("Enter deposit amount: ");
            double depositAmount = read.nextDouble();

            System.out.print("Enter interest rate: ");
            double interestRate = read.nextDouble();

            System.out.print("Enter number of years selected: ");
            int yearCount = read.nextInt();

            //FV = P × (1 + (r / d))^n (future value)

            //convert % to decimal (% / 100)

            double interestDecimalForm = interestRate/100;
            int daysPerYear = 365;
            int totalNumberofDays = daysPerYear * yearCount;
           double  interestPerDay = 1 + interestDecimalForm/daysPerYear;



            double futureValue = depositAmount * Math.pow(interestPerDay,totalNumberofDays);

            //interest earned: o Total Interest Earned = FV - P

            double earnedInterest = futureValue - depositAmount;



            System.out.println("if you deposit $" + depositAmount + " in a CD that earns ");
            System.out.println(interestRate + "% interest and matures in " + yearCount + " years, ");
            System.out.println("your CD's ending balance will be $" + futureValue + " and you" );
            System.out.println("would have earned $" + earnedInterest + " in interest.");


           // or  do like this:  System.out.println("2. A calculator that determines the future value of a one\n" +
          //"time deposit assuming compound interest - it is used to help you decide \n" +
                     //     "how much a CD will be worth when it matures ");  /*


/*
for long comments
*/



        }

}
