package com.epam.Introduction.JavaStaticInitializerBlock;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 * */
public class Solution {

  static int B;
  static int H;
  static boolean flag;

  static void isTrueFlag() throws Exception {
    if ((0 >= B) || (0 >= H)) {
      flag = false;
      throw new Exception();
    } else {
      flag = true;
    }
  }

  static {
    Scanner scanner = new Scanner(System.in);
    H = scanner.nextInt();
    B = scanner.nextInt();

    try {
      isTrueFlag();
    } catch (Exception e) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }

  }

}

