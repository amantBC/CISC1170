// This program calculates the current ages of people given their list of birthdays

import java.io.File;
import java.util.Scanner;

public class Age {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new File(args[0])).useDelimiter("[/;]");
    final int currentDay = 6, currentMonth = 7, currentYear = 2022;
    int birthDay, birthMonth, birthYear;

    // Scan each line and print the birthday and age to standard output
    while (scanner.hasNext()) {
      birthMonth = scanner.nextInt();
      birthDay = scanner.nextInt();
      birthYear = scanner.nextInt();
      int age = currentYear - birthYear;

      // Adjust age if the birthday hasn't occurred this year yet
      if (currentMonth < birthMonth)
        age--;
      else if (birthMonth == currentMonth && currentDay < birthDay)
        age--;

      // Print birthday and age to standard output
      System.out.printf("Birthday: %d/%d/%d; Age: %d\n", birthMonth, birthDay, birthYear, age);

      if (scanner.hasNextLine())
        scanner.nextLine();
    }
  }
}