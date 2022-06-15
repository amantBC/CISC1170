/* A program that calculates and prints the perimeter and area of a rectangle given its sides.
   (No input validation is done.) */

import java.util.Scanner;

public class RectangleStat {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the width of the rectangle: ");
    double width = input.nextDouble();
    System.out.print("Enter the length of the rectangle: ");
    double length = input.nextDouble();

    System.out.println("\nWhen one side is " + width + " and the other side is " + length +
    ", the area is " + width * length + " and the perimeter is " + 2 * (width + length));
  }
};