// This program prints perimeter, circumference, and area based on a given shape

import java.util.Scanner;

public class Shapes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a shape, r for rectangle, c for circle: ");
    char choice = scanner.next().charAt(0);

    // Rectangle
    if (choice == 'r') {
      System.out.print("Enter the width: ");
      double width = scanner.nextDouble();
      System.out.print("Enter the length: ");
      double length = scanner.nextDouble();
      System.out.println("The perimeter is " + 2 * (width + length) + ".");
      System.out.println("The area is " + width * length + ".");
    }
    // Circle
    else if (choice == 'c') {
      System.out.print("Enter the raidus: ");
      double radius = scanner.nextDouble();
      System.out.println("The circumference is " + 2 * radius * Math.PI + ".");
      System.out.println("The area is " + radius * radius * Math.PI + ".");
    }
    // Invalid shape
    else
      System.out.println("Invalid shape!");
  }
}