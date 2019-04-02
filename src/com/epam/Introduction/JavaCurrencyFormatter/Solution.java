package com.epam.Introduction.JavaCurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-currency-formatter/problem
 * */
public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    NumberFormat nf = NumberFormat.getInstance();
    Locale INDIA = new Locale("en", "IN");

    System.out.println("US: " + nf.getCurrencyInstance(Locale.US).format(payment));
    System.out.println("India: " + nf.getCurrencyInstance(INDIA).format(payment));
    System.out.println("China: " + nf.getCurrencyInstance(Locale.CHINA).format(payment));
    System.out.println("France: " + nf.getCurrencyInstance(Locale.FRANCE).format(payment));
  }

}

