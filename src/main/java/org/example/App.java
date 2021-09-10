package org.example;
import java.util.Scanner;
import java.math.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 11 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "How many euros are you exchanging? " );
        String stringEuros = scan.nextLine();
        System.out.print( "What is the exchange rate? " );
        String stringExchangerate = scan.nextLine();

        double Euros = Double.parseDouble(stringEuros);
        double exchangeRate = Double.parseDouble(stringExchangerate);

        double US = Euros * exchangeRate;

        BigDecimal bd = new BigDecimal(US).setScale(2, RoundingMode.HALF_UP);
        double converted = bd.doubleValue();

        System.out.println(stringEuros+" euros at an exchange rate of "+stringExchangerate+" is "+converted+" U.S. dollars.");
    }
}