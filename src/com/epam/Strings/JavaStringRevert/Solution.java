package com.epam.Strings.JavaStringRevert;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen
 * */
public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    System.out.println( A.equalsIgnoreCase(new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );

    }
}




