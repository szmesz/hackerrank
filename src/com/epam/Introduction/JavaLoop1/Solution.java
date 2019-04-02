package com.epam.Introduction.JavaLoop1;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 */

public class Solution {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    scanner.close();
    for(int i = 1; i <= 10; i++) {
      System.out.println(N + " x " + i + " = " +  N * i);
    }
  }
}
