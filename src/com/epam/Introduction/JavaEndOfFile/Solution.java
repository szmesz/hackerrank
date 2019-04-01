package com.epam.Introduction.JavaEndOfFile;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 1;
    while (scanner.hasNext()) {
      System.out.println(n++ + " " + scanner.nextLine());
    }
  }
}

