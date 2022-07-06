import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Calculations {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new File(args[0]));
    PrintStream printStream = new PrintStream(new File("calculations.txt"));

    // Scan the input file line by line, and print the output accordingly
    while (scanner.hasNext()) {
      int value = scanner.nextInt();
      printStream.print(factorial(value) + "; ");
      printStream.print(sumOfSquares(value) + "; ");
      printFibonacci(value, printStream);
      printStream.println("");
    }

    // Free resources
    scanner.close();
    printStream.close();
  }

  // Computes the factorial of num
  static long factorial (int num) {
    long product = 1;
    for (int i = 1; i <= num; i++)
      product *= i;
    return product;
  }

  // Computes the sum of squares from 1 to num
  static long sumOfSquares (int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++)
      sum += i * i;
    return sum;
  }

  // Prints elements 1 to n of the fibonacci sequence
  static void printFibonacci (int num, PrintStream printStream) {
    int num1 = 1, num2 = 2, next = 3;
    printStream.print(num1 + " " + num2 + " ");
    for (int i = 3; i <= num; i++) {
      printStream.print(next + " ");
      num1 = num2;
      num2 = next;
      next = num1 + num2;
    }
  }
};