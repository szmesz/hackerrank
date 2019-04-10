package com.epam.Strings.JavaSubstring;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-substring/problem?h_r=next-challenge&h_v=zen
 * */
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    System.out.println(S.substring(start, end));
  }
}
