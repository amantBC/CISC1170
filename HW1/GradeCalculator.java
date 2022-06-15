/* A program that calculates and prints the sum of the following scores:
   Homework, CodeLab, Midterm1, Midterm2, Final. (No input validation is done.) */

import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float sum = 0;

    System.out.print("Enter your Homework score: ");
    sum += input.nextFloat();
    System.out.print("Enter your CodeLab score: ");
    sum += input.nextFloat();
    System.out.print("Enter your Midterm #1 score: ");
    sum += input.nextFloat();
    System.out.print("Enter your Midterm #2 score: ");
    sum += input.nextFloat();
    System.out.print("Enter your Final score: ");
    sum += input.nextFloat();

    System.out.println("The sum of all scores is " + sum);
  }
};