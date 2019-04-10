package com.epam.Strings.JavaStringsIntroduction;

import java.util.*;

/**
 *  https://www.hackerrank.com/challenges/java-strings-introduction/problem
 * */
public class Solution {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();

    int sumOfLength = A.length() + B.length();
    System.out.println(sumOfLength);

    //for some reason on the hackerrank  the comparator "<" is ">"
    if(A.compareToIgnoreCase(B) < B.compareToIgnoreCase(A)){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    String firstString = A.replace(A.charAt(0), A.toUpperCase().charAt(0));
    String secondString = B.replace(B.charAt(0), B.toUpperCase().charAt(0));
    System.out.println(firstString + " " + secondString);

  }
}
