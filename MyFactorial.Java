import java.util.Scanner;
public class MyFactorial {
  public static void main(String args[]) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a Positive Integer: ");
    int input = scanner.nextInt();
    
    int factorial = 1;
    int counter = 1;
    
    while (counter <= input){
        factorial = factorial * counter;
        System.out.println(counter + "! = " + factorial);
        counter = counter + 1;
    }
    scanner.close();
  }
}
