/* A program that calculates and prints the circumference and area of a circle given its radius.
   (No input validation is done.) */

import java.util.Scanner;

public class CircleStat {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the raidus of the circle: ");
    double radius = input.nextDouble();

    System.out.println("\nWhen the radius is " + radius +
    ", the circumference is " + 2 * radius * Math.PI + " and the area is " + radius * radius * Math.PI);
  }
};