package com.epam.Introduction.JavaIfElse;

import java.util.Scanner;

/**
* https://www.hackerrank.com/challenges/java-if-else/problem
* */
public class Solution {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    scanner.close();

    int n = N;
    String answer = "";
    if(n % 2 == 1 || (n >= 6 && n <= 20)){
      answer = "Weird";
    }else{
      answer = "Not Weird";
    }
    System.out.println(answer);
  }
}
