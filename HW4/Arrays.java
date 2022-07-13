import java.time.LocalTime;

public class Arrays {
  public static void main(String[] args) {
    String[] strings = {"first", "second", "third", "fourth", "fifth",
                        "sixth", "seventh", "eighth", "nineth", "tenth"};
    System.out.println("\nStrings and their lengths:");
    printElements(strings);

    System.out.println("\n\nTimes test:");
    LocalTime[] times = new LocalTime[3];
    times[0] = LocalTime.parse("09:40:59");
    times[1] = LocalTime.parse("21:15:30");
    times[2] = LocalTime.parse("00:09:22");
    printElements(times);

    // Create and fill numTable with values, then print the values in matrix form
    System.out.println("\n\nMatrix test:\n");
    int[][] numTable = new int[10][20];
    System.out.println("The number of rows in the matrix is: " + numTable.length);
    for (int i = 0; i < numTable.length; i++)
      for (int j = 0; j < numTable[i].length; j++)
        numTable[i][j] = i + j + 100;
    printElements(numTable);
  }

  // Creates and manipulates an integer array.
  static void basicArray() {
    int[] nums = new int[50];
    // Store the numbers 1 through 50 in the array.
    for (int i = 0; i < nums.length; i++)
      nums[i] = i + 1;

    // Add 10 to each element in the array.
    for (int i = 0; i < nums.length; i++)
      nums[i] += 10;

    // Print all the elements of the array, one number per line.
    for (int i = 0; i < nums.length; i++)
      System.out.println(nums[i]);
  }

  // Prints the elements of a String array, followed by a comma, followed by the string size.
  static void printElements(String[] strings) {
    for (int i = 0; i < strings.length; i++)
      System.out.println(strings[i] + ", " + strings[i].length());
  }

  // Prints the elements of a 2D array in matrix form.
  static void printElements(int[][] numTable) {
    for (int i = 0; i < numTable.length; i++) {
      for (int j = 0; j < numTable[i].length; j++)
        System.out.printf("%3d ", numTable[i][j]);
      System.out.println("");
    }
  }

  // Prints the elements of an array of Time objects.
  static void printElements(LocalTime[] times) {
    for (int i = 0; i < times.length; i++)
      System.out.println(times[i].toString());
  }
}