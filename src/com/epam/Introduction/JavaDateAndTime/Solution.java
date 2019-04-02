package com.epam.Introduction.JavaDateAndTime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

/**
 * This is not the same solution as in the hackerrank.com
 * It needed to be refactored to make it possible to run in terminal.
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
 **/
class Result {

  /*
   * Complete the 'findDay' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. INTEGER month
   *  2. INTEGER day
   *  3. INTEGER year
   */

  static String findDay(int month, int day, int year) {
    String dayOfWeek = null;
    if (month <= 12 || day <= 31) {
      LocalDate date = LocalDate.of(Integer.parseInt(String.valueOf(year)), Integer.parseInt(String.valueOf(month)),
          Integer.parseInt(String.valueOf(day)));
      dayOfWeek = date.getDayOfWeek().name();
    }
    return dayOfWeek;
  }
}

public class Solution {
  public static void main(String[] args) throws IOException {

    final String FILENAME = "C:\\Users\\Tamas_Vajda\\Desktop\\hackerrank_output\\output.txt";
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILENAME));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int month = Integer.parseInt(firstMultipleInput[0]);

    int day = Integer.parseInt(firstMultipleInput[1]);

    int year = Integer.parseInt(firstMultipleInput[2]);

    String res = Result.findDay(month, day, year);
    System.out.println(res);

    bufferedWriter.write(res);
    bufferedWriter.newLine();

    bufferedReader.close();
  }
}

