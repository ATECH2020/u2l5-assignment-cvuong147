import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
       double salesTax;
       int numWindows;
       int numBoards;
       double baseCost;
       double taxCost;
 
       Scanner scanner = new Scanner(System.in);
 
       System.out.println("Enter the sales tax rate:");
       salesTax = scanner.nextDouble();
       System.out.println("How many boards do you need?");
       numBoards = scanner.nextInt();
       System.out.println("How many windows do you need?");
       numWindows = scanner.nextInt();
 
       Construction construct = new Construction(8.0, 11.0, salesTax);
       baseCost = construct.lumberCost(numBoards) + construct.windowCost(numWindows);
       taxCost = construct.grandTotal(baseCost);
 
       System.out.println("Total: " + baseCost);
       System.out.print("Grand Total: " + taxCost);
    }
}
