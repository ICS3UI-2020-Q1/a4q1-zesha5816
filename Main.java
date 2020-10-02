import java.util.Scanner;
/**
 *
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer to count down to");
		int countNumber = input.nextInt();
		int count = 100;
		System.out.println("Count Down:");
		do {
			System.out.println(count);
			count = count - 5; 
		}while (countNumber <= count);
  }
}
