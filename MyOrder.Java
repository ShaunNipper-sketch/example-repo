import java.util.Scanner;

public class MyOrder {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int number;
    
    System.out.println("Menu");
    System.out.println("1. Pizza: $12");
    System.out.println("2. Sandwich: $8");
    System.out.println("3. Hamburger: $10");
    
    System.out.println("Please enter your order (1 - 3): ");
     while (!scanner.hasNextInt()) {
        System.out.println("Invalid Input. Please enter a number between 1 and 3.");
        scanner.next();
    } int nInput = scanner.nextInt();
    int nPrice = 0;
   
    if (nInput == 1) {
        nPrice = 12;
        System.out.println("You chose the pizza. Thank you for your order. Total cost: $" + nPrice);
    } else if (nInput == 2) {
        nPrice = 8;
        System.out.println("You chose the Sandwich. Thank you for your order. Total cost: $" + nPrice);
    } else if (nInput == 3) {
        nPrice = 10;
        System.out.println("You chose the Hamburger. Thank you for your order. Total cost: $" + nPrice);
    } else if (nInput <= 0 || nInput >= 4) {
        System.out.println("Invalid menu option. please enter a number between 1 and 3.");
    }
    
    scanner.close();
  }
}
