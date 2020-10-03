import java.util.Scanner;
/**
 * Forces the user to type positive number if they want to continue and negative number to stop
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a Scanner for the user input
    Scanner input = new Scanner(System.in);

    // declares the variable
    int num;
    do{
      // Asks the user to type positive number to continue and negative number to stop the run
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      // Gets the number from the user
      num = input.nextInt();
    
    }while(num > 0);
    System.out.println("All Done!");
    
  }
}
