package com.epam.Strings.JavaStringCompare;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-compare/problem
 * */
public class Solution {

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    String subString;

    for(int i = 0; i < s.length()-k+1; i++){
      subString = s.substring(i, i+k);
      if(i==0){
        smallest = subString;
        largest = subString;
      } else if(subString.compareTo(smallest)<0){
        smallest = subString;
      } else if(subString.compareTo(largest)>0){
        largest = subString;
      }
    }
    return smallest + "\n" + largest;
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
  }
}