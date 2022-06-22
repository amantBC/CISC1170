import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Transactions {
  public static void main(String[] args) throws Exception {
    // Process each input file
    final double TAX = 0.08875;
    for (int i = 0; i < args.length; i++) {
      File inputFile = new File(args[i]);
      Scanner scanner = new Scanner(inputFile).useDelimiter("[,\n]");
      String startDate = "", endDate = "";
      int SKU, highestPriceSKU = 0, lowestPriceSKU = 0;
      double total = 0, highestPrice = 0, lowestPrice = 0, discount;
      boolean firstLine = true;

      // Process each line
      while (scanner.hasNext()) {
        double currentPrice;
        endDate = scanner.next();
        if (firstLine)
          startDate = endDate;

        SKU = Integer.parseInt(scanner.next());
        currentPrice = Double.parseDouble(scanner.next());
        discount = Double.parseDouble(scanner.next()) / 100;
        currentPrice -= currentPrice * discount;
        if (firstLine) {
          lowestPrice = currentPrice;
          highestPrice = currentPrice;
          lowestPriceSKU = SKU;
          highestPriceSKU = SKU;
          firstLine = false;
        }
        // Update total, lowest price, and highest price
        total += currentPrice;
        if (currentPrice < lowestPrice) {
          lowestPrice = currentPrice;
          lowestPriceSKU = SKU;
        }
        else if (currentPrice > highestPrice) {
          highestPrice = currentPrice;
          highestPriceSKU = SKU;
        }
        if (scanner.hasNextLine())
          scanner.nextLine();
      }

      // Free current scanner and write output to file
      scanner.close();
      PrintStream outputFile = new PrintStream(new File("output" + (i + 1) + ".txt"));
      outputFile.println("Report from " + startDate + " to " + endDate);
      outputFile.printf("The total is $%.2f\n", total);
      outputFile.printf("The tax is $%.2f\n", total * TAX);
      outputFile.printf("The highest price item is #%d at $%.2f\n", highestPriceSKU, highestPrice);
      outputFile.printf("The lowest price item is #%d at $%.2f\n", lowestPriceSKU, lowestPrice);
      outputFile.close();
    }
  }
}