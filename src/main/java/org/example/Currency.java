/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args){
        int euro;
        double usdollars=0, rate;
        System.out.println("How many euros are you exchanging?");
        Scanner scanner = new Scanner(System.in);
        String euros = scanner.next();
        System.out.println("What is the exchange rate?");
        Scanner scanner1 = new Scanner(System.in);
        String exchange = scanner1.next();

        euro = Integer.parseInt(euros);

        rate = Double.parseDouble(exchange);
        usdollars = euro * rate;
        Math.round(usdollars);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println( euro + " euros at an exchange rate of " + rate + " is " + numberFormat.format(usdollars) + " U.S. Dollars");
    }

}
